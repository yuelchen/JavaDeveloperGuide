package Utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Electric implements Utility {
    private final String name = "Electric";
    private String description = "Fixed Electricity Price";
    private boolean fixed;

    private final double kiloWattRate = 0.12;
    private double kiloWattUsage;
    private double hoursUsed;

    public Electric(){
        this.fixed = true;
    }

    public Electric(double wattUsage, double hours){
        this.fixed = false;
        this.kiloWattUsage = wattUsage;
        this.hoursUsed = hours;
        this.description = "As-per-usage Electricity Price";
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double calculateBill() {
        double total = 99.99;

        if(!(this.fixed)){
            total = ((this.kiloWattUsage * this.hoursUsed) / 1000) * this.kiloWattRate;
            BigDecimal bigDecimal = new BigDecimal(total);
            total = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        return total;
    }
}
