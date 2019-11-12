package com.company;

public class Balance {
   private Cost[] costs;
   private Revenue[] revenues;
    public Balance(Cost[] costs, Revenue[] revenues) {
        this.costs = costs;
        this.revenues = revenues;
    }
    public double getBalance(Balance balance)
    {
        double temp = 0;
        for (int i=0; i < this.revenues.length; i++)
        {
            temp +=revenues[i].getSumRub();
        }
        return temp;
    }
}
