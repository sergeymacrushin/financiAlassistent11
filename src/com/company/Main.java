package com.company;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {

    public static void main(String[] args) {
        CategoryOfCosts category = new CategoryOfCosts("fun");


	Balance balance = new Balance();
	Cost cost = new Cost(10000,category);
	balance.addCost(cost);
	balance.addRevenue(new Revenue(15000,new CategoryOfRevenue("grant")));
	System.out.println(balance.getBalance());

    }
}
