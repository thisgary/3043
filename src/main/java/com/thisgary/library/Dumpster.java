package com.thisgary.library;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Dumpster {
    public static int dayInMonth(int m, int y) {
        return (
                (m == 2) ?
                        (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 29 : 28 :
                        (m % 2 == 0) ^ (m > 7) ? 30 : 31 // XOR
        );
    }

    public static boolean isDate(String yymmdd) {
        int y = Integer.parseInt(yymmdd.substring(0, 2));
        int d = Integer.parseInt(yymmdd.substring(4, 6));
        int m = Integer.parseInt(yymmdd.substring(2, 4));
        if (m > 12 || m < 1) return false;
        int maxDay = dayInMonth(m, y);
        return d >= 1 && d <= maxDay;
    }

    // prototype public static void method invoker
    public static void PSVInvoker(String packageClassName, String methodName) throws Throwable {
        Method m = Class.forName(packageClassName).getMethod(methodName, (Class<?>[]) null);
        m.invoke(null, (Object[]) null);
    }

    // it exists
    public static void moduleActivity(int i) throws Throwable {
        // Get list of options in module i
        final Class<?> CLASS = Class.forName("com.thisgary.lab.module" + i + ".Module" + i);
        final Method[] METHODS = CLASS.getDeclaredMethods();

        // List options in module i
        final Pattern P = Pattern.compile("activity[0-9]+");
        List<String> options = new ArrayList<>();
        for (Method method : METHODS) {
            Matcher m = P.matcher(method.getName());
            if (m.matches()) {
                String name = m.group(0);
                options.add(name.substring(name.length() - 1));
            }
        }
        final String REF = "Activities: " + String.join(", ", options);

        while (true) {
            int choice = GetNumber.jopInt(REF, "Lab Module " + i);
            if (options.contains(String.valueOf(choice))) {
                Method activity = CLASS.getMethod("activity" + choice, (Class<?>[]) null);
                activity.invoke(null, (Object[]) null);
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Activity" + choice + "() does not exist in Module" + i,
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
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
