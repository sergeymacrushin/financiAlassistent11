package com.company;

import javax.swing.*;

public class Cost {
    private int sumRub;
    private CategoryOfCosts category;
    public Cost(int sumRub, CategoryOfCosts category) {
        this.sumRub = sumRub;
        this.category = category;
    }
    public int getSumRub() {
        return sumRub;
    }

    public static class Main {

        public static void main(String[] args) {
            JFrame Test = new AssistentView();
            Test.setVisible(true);
        }
    }
}
