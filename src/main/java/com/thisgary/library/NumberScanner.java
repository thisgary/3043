package com.thisgary.library;

import java.util.Scanner;
import java.util.function.Function;

// An attempt to modularize GetNumber.scan()
public class NumberScanner implements GNInterface {
    public String question = "Input? ";
    public String onError = "Invalid input!";
    public Function<Number, Boolean> rules = NO_RULES;

    Scanner s = new Scanner(System.in);

    public NumberScanner() {
    }

    public NumberScanner(String onError, Function<Number, Boolean> rules) {
        this.onError = onError;
        this.rules = rules;
    }

    public NumberScanner(String question, String onError, Function<Number, Boolean> rules) {
        this.question = question;
        this.onError = onError;
        this.rules = rules;
    }

    public String getString() {
        System.out.print(this.question);
        return s.nextLine();
    }

    public String getString(String question) {
        System.out.print(question);
        return s.nextLine();
    }

    public void onError(Exception e) {
        System.out.println(onError);
    }

    public Number get() {
        return get(this.question, this.rules);
    }

    public Number get(String question) {
        return get(question, this.rules);
    }

    public Integer getInt() {
        Function<Number, Boolean> rules = (n) -> n.intValue() == n.doubleValue() && this.rules.apply(n);
        return get(this.question, rules).intValue();
    }

    public Integer getInt(String question) {
        Function<Number, Boolean> rules = (n) -> n.intValue() == n.doubleValue() && this.rules.apply(n);
        return get(question, rules).intValue();
    }
}