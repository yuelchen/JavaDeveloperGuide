package main;

import chicken.ChickenMeat;
import java.util.ArrayList;
import java.util.List;

public class ChickenStore {
    public static final String CUSTOMER_NAME = "Yue";
    public static final int CUSTOMER_ORDER_NUMBER = 888;

    public static void main(String[] args){
        System.out.println("\n===================================\n");
        System.out.println("Order Number: " + CUSTOMER_ORDER_NUMBER);
        System.out.println("Name: " + CUSTOMER_NAME);
        System.out.println("\n===================================\n");

        OrderFactory orderFactory = new OrderFactory();
        List<ChickenMeat> chickenOrders = new ArrayList<ChickenMeat>();

        chickenOrders.add(orderFactory.getChickenMeat("breast", 2));
        chickenOrders.add(orderFactory.getChickenMeat("thigh", 3));
        chickenOrders.add(orderFactory.getChickenMeat("leg", 5));
        chickenOrders.add(orderFactory.getChickenMeat("wing", 8));

        //output nutrition for each order
        int counter = 1;
        for(ChickenMeat order : chickenOrders){
            System.out.println("Order [Section " + counter + "] for " + order.getServingSize() + " " + order.getPieceName() + ":");
            System.out.println("\tOrder Calories:\t\t" + order.getCalories());
            System.out.println("\tOrder Fat:\t\t\t" + order.getFat() + " g");
            System.out.println("\tOrder Cholesterol: \t" + order.getCholestrol() + " mg");
            System.out.println("\tOrder Sodium:\t\t" + order.getSodium() + " mg");
            System.out.println("\tOrder Carbohydrate:\t" + order.getCarbohydrate() + " g");
            System.out.println("\tOrder Protein:\t\t" + order.getProtein() + " g\n");
            counter++;
        }
    }
}
