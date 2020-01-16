package main;

import chicken.*;

public class OrderFactory {
    //default constructor
    public OrderFactory(){}

    public ChickenMeat getChickenMeat(String part, int servings){
        if(servings == 0){
            servings = 1;
        }

        ChickenMeat chickenMeat = null;
        if(part.equalsIgnoreCase("BREAST")){
            chickenMeat = new ChickenBreast(servings);
        }
        else if(part.equalsIgnoreCase("THIGH")){
            chickenMeat = new ChickenThigh(servings);
        }
        else if(part.equalsIgnoreCase("LEG")){
            chickenMeat = new ChickenLeg(servings);
        }
        else if(part.equalsIgnoreCase("WING")){
            chickenMeat = new ChickenWing(servings);
        }

        return chickenMeat;
    }
}
