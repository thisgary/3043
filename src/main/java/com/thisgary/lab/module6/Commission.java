package com.thisgary.lab.module6;

public final class Commission {
    private final String name;
    private final int megazines;

    public Commission(String name, int megazines) {
        this.name = name;
        this.megazines = megazines;
    }

    public String getName() {
        return name;
    }

    public int getMegazines() {
        return megazines;
    }

    public double getCommission() {
        return megazines * 2.5;
    }

    public String toString() {
        return "Name: " + name + ", Commission: RM2.5 * " + megazines + " = RM" + getCommission();
    }
}
