package com.company;

import  com.company.Balance;

public class Controller {

    public int getBalance(){  return getBalance();}

    public int getValueCategoryOfCost(Balance balance, Cost cost) {
        return balance.getCostValue(cost);

    }
    public int getValueCategoryOfRevenue(Balance balance,Revenue revenue){
        return balance.getRevenueValue(revenue);
    }

    public int getValueCosts(Balance balance){
       return balance.getValueCosts();
    }

    public int getValueRevenues(Balance balance){
        return  balance.getValueRevenues();
    }

    public void setCost(Balance balance, Cost cost){
        balance.addCost(cost);
    }

    public void setRevenue(Balance balance, Revenue revenue){
        balance.addRevenue(revenue);
    }



}
