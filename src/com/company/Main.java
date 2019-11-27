package com.company;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
      AssistentView view = new AssistentView();
      Balance balance = new Balance();
      Controller controller = new Controller(balance,view);
      view.setVisible(true);
    }
}
