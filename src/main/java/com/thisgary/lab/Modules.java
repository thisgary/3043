package com.thisgary.lab;

import com.thisgary.library.GetNumber;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Modules {
    public static void main(String[] args) throws Throwable {
        while (true) {
            // List all modules
            File file = new File("./src/main/java/com/thisgary/lab/");
            List<String> directories = Arrays.stream(file.list((p, c) -> new File(p, c).isDirectory()))
                    .map(name -> name.substring(6))
                    .sorted()
                    .collect(Collectors.toList());

            // Find the module
            final String MODULES = "Modules: " + String.join(", ", directories);
            final Function<Number, Boolean> MODULE_EXISTS_RULE = (n) -> directories.contains("" + n.intValue());
            int i = GetNumber.jopInt(MODULES, "Lab modules", "Module does not exist", MODULE_EXISTS_RULE);

            // List all methods
            Class c = Class.forName("com.thisgary.lab.module" + i + ".Module" + i);
            Method[] methods = c.getDeclaredMethods();

            // List all activities
            List<String> activities = Arrays.stream(methods)
                    .map(method -> method.getName())
                    .map(n -> n.startsWith("activity") ? n.substring(8) : null)
                    .filter(n -> n != null)
                    .sorted()
                    .collect(Collectors.toList());

            // Find the activity
            final String ACTIVITIES = "Activities: " + String.join(", ", activities);
            final Function<Number, Boolean> ACTIVITY_EXISTS_RULE = (n) -> activities.contains("" + n.intValue());
            int choice = GetNumber.jopInt(
                    ACTIVITIES, "Lab Module " + i, "Activity does not exist", ACTIVITY_EXISTS_RULE
            );

            // Run the activity
            Method activity = c.getMethod("activity" + choice, (Class<?>[]) null);
            activity.invoke(null, (Object[]) null);
        }
    }
}
