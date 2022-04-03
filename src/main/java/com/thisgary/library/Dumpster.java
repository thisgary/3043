package com.thisgary.library;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dumpster {
    public static int dayInMonth(int m, int y) {
        return (
                (m == 2) ?
                        (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 29 : 28 :
                        (m % 2 == 0) ^ (m > 7) ? 30 : 31 // XOR
        );
    }

    public static boolean isDate(String YMD) {
        int y = Integer.parseInt(YMD.substring(0, 2));
        int d = Integer.parseInt(YMD.substring(4, 6));
        int m = Integer.parseInt(YMD.substring(2, 4));
        if (m > 12 || m < 1) return false;
        int maxDay = dayInMonth(m, y);
        return d >= 1 && d <= maxDay;
    }

    // prototype public static void method invoker
    public static void psvInvoker(String packageClassName, String methodName) throws Throwable {
        Method m = Class.forName(packageClassName).getMethod(methodName, (Class<?>[]) null);
        m.invoke(null, (Object[]) null);
    }

    public static void testModule(int i) {
        try {
            // List all methods
            Class<?> cls = Class.forName("com.thisgary.lab.module" + i + ".Test");
            Method[] methods = cls.getDeclaredMethods();

            // List all activities
            List<String> activities = Arrays.stream(methods)
                    .map(Method::getName) // get method name
                    .map(n -> n.startsWith("activity") ? n.substring(8) : null) // check if it is activity
                    .filter(Objects::nonNull) // filter unmatched (null)
                    .sorted()
                    .collect(Collectors.toList());

            while (true) {
                // Find the activity
                final String ACTIVITIES = "Activities: " + String.join(", ", activities);
                final Function<Number, Boolean> ACTIVITY_EXISTS_RULE = (n) -> activities.contains("" + n.intValue());
                int choice = GetNumber.jopInt(
                        ACTIVITIES, "Lab Module " + i, "Activity does not exist", ACTIVITY_EXISTS_RULE
                );

                // Run the activity
                Method activity = cls.getMethod("activity" + choice, (Class<?>[]) null);
                try { // Non-breaking exception
                    activity.invoke(null, (Object[]) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Should not happen.");
        }
    }

    public static String repeat(int length, String that) {
        return new String(new char[Math.max(1, length)]).replace("\0", that);
    }

    public static String repeatSpace(int length) {
        return repeat(length, " ");
    }

    public static int intLength(int i) {
        return String.valueOf(i).length();
    }

    public static double[] scanDoubleArray(String question, String subQuestion) {
        int i = GetNumber.scanInt(question), j = 0;
        double[] ds = new double[i];
        while (j < i) {
            ds[j] = GetNumber.scanDouble(subQuestion + ++j + ": ");
        }
        return ds;
    }

    public static void tablePrintEven(String[][] table, int space) {
        for (String[] row : table) {
            for (String cell : row) System.out.print(cell + Dumpster.repeatSpace(space - cell.length()));
            System.out.println();
        }
    }
}
