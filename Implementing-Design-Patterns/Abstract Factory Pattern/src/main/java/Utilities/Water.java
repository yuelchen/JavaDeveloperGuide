package Utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Water implements Utility{
    private final String name = "Water";
    private String description = "Fixed Water Price";
    private boolean fixed;

    private final double waterLiterRate = 0.56;
    private double litersUsed;

    public Water(){
        this.fixed = true;
    }

    public Water(double liters){
        this.fixed = false;
        this.litersUsed = liters;
        this.description = "As-per-usage Water Price";
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double calculateBill() {
        double total = 69.99;

        if(!(this.fixed)){
            total = this.litersUsed * this.waterLiterRate;
            BigDecimal bigDecimal = new BigDecimal(total);
            total = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        return total;
    }
}
