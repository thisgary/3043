package com.thisgary.lab;

import com.thisgary.library.Dumpster;
import com.thisgary.library.GetNumber;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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

            Dumpster.testModule(i);
        }
    }
}
