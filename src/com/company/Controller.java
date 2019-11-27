package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                int costPrice, revenuePrice;
                try
                {
                    balance.getBalance();
                }
            }
        });
    }


}
