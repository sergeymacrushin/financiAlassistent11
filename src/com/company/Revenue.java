package com.company;

public class Revenue {
    private double sumRub;
    private CategoryOfRevenue category;

    public Revenue(double sumRub, CategoryOfRevenue category) {
        this.sumRub = sumRub;
        this.category = category;

    }

    public double getSumRub() {
        return sumRub;
    }
}
