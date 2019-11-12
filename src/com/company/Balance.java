package com.company;
import java.util.ArrayList;
public class Balance {
   private ArrayList<Cost> costs;
   private ArrayList<Revenue> revenues;

    public Balance(ArrayList<Cost> costs, ArrayList<Revenue> revenues) {
        this.costs = costs;
        this.revenues = revenues;
    }

    public int getBalance()
    {
        int temp = 0;
        for (int i=0 ; i < revenues.size(); i++)
        {
            temp += revenues.get(i).getSumRub();
        }
        for (int i=0 ; i < costs.size(); i++)
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

}
