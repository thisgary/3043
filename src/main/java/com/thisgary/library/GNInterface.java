package com.thisgary.library;

import java.util.function.Function;

public interface GNInterface {
    public static final Function<Number, Boolean> NO_RULES = (Number n) -> true;

    String getString(String question);

    void onError(Exception e);

    default Number get(String question, Function<Number, Boolean> rules) {
        while (true) {
            String s = getString(question); // Get string input
            try {
                Number n = Double.parseDouble(s); // Try to parse to double
                if (!rules.apply(n))
                    throw new NumberFormatException(); // If rules not met, throw exception
                return n;
            } catch (NumberFormatException e) {
                onError(e); // Notify user
            }
        }
    }
}
