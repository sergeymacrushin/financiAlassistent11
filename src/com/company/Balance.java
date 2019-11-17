package com.company;
import java.util.ArrayList;

public class Balance {
   private ArrayList<Cost> costs;
   private ArrayList<Revenue> revenues;

    public Balance(ArrayList<Cost> costs, ArrayList<Revenue> revenues) {
        this.costs = costs;
        this.revenues = revenues;
    }
    public Balance()
    {
        this.costs = new ArrayList<>(0);
        this.revenues = new ArrayList<>(0);
    }

    public int getBalance()
    {
        int temp = 0;
        for (int i=0 ; i < revenues.size(); i++)
        {
            temp += revenues.get(i).getSumRub();
        }
        for (int i=0 ; i < revenues.size(); i++)
        {
            temp -= costs.get(i).getSumRub();
        }
        return temp;

    }
    public void addCost(Cost cost)
    {
        this.costs.add(cost);
    }
    public void addRevenue(Revenue revenue)
    {
        this.revenues.add(revenue);
    }



    public int getCostValue(Cost cost){
        int i = costs.indexOf(cost);
        int temp=costs.get(i).getSumRub();
        return temp;
    }

    public int getRevenueValue(Revenue revenue){
        int i = revenues.indexOf(revenue);
        int temp=revenues.get(i).getSumRub();
        return temp;
    }

    public int getValueCosts(){
        int temp=0;
         for (int i=0 ; i < costs.size(); i++) {
             temp += costs.get(i).getSumRub();
         }
         return  temp;
    }

    public int getValueRevenues(){
        int temp=0;
        for (int i=0 ; i < revenues.size(); i++) {
            temp += revenues.get(i).getSumRub();
        }
        return  temp;
    }

}
