package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import static javax.swing.text.html.HTML.Tag.SELECT;

public class Controller {
    private Balance balance;
    private AssistentView view;
    public Controller(Balance balance, AssistentView view) {
        this.balance = balance;
        this.view = view;
        this.view.addCostListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    balance.addCost(new Cost(view.getReturnIntegerCost(), new CategoryOfCosts(view.getCategoryCost())));
            }
        });
        this.view.addRevenueListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balance.addRevenue(new Revenue(view.getReturnIntegerRevenue(), new CategoryOfRevenue(view.getCategoryRevenue())));
            }
        });
        this.view.addBalanceListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setBalanceResult(balance.getBalance());
            }
        });
    }
    public static void writeData(Balance balance, Writer out) {
        PrintWriter outData = new PrintWriter(out);
        ArrayList<Revenue> revenues = balance.getRevenues();
        ArrayList<Cost> costs = balance.getCosts();
        outData.println(balance.getBalance());
        outData.println(revenues.size());
        for (int i = 0; i < revenues.size(); i++) {
            outData.println(revenues.get(i).getCategory().toString());
            outData.println(revenues.get(i).getSumRub());
        }
        outData.println(costs.size());
        for (int i = 0; i < costs.size(); i++) {
            outData.println(costs.get(i).getCategory().toString());
            outData.println(costs.get(i).getSumRub());
        }
        outData.flush();
    }

    public static Balance readerData(Reader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        int sum = 0;
        String category = null;
        int sumBalance = Integer.parseInt(reader.readLine());
        int size = Integer.parseInt(reader.readLine());
        ArrayList<Revenue> revenues = new ArrayList<>();
        CategoryOfRevenue cateReven = null;
        Revenue revenue = null;
        for (int i = 0; i < size; i++) {
            category = reader.readLine();
            cateReven = new CategoryOfRevenue(category);
            sum = Integer.parseInt(reader.readLine());
            revenue = new Revenue(sum, cateReven);
            revenues.add(revenue);
        }
        size = Integer.parseInt(reader.readLine());
        ArrayList<Cost> costs = new ArrayList<>();
        CategoryOfCosts cateCost = null;
        Cost cost = null;
        for (int i = 0; i < size; i++) {
            category = reader.readLine();
            cateCost = new CategoryOfCosts(category);
            sum = Integer.parseInt(reader.readLine());
            cost = new Cost(sum, cateCost);
            costs.add(cost);
        }
        Balance balance = new Balance(costs, revenues);

        return balance;
    }

}




























































