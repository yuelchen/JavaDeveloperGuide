package Utilities;

public class Sewage implements Utility {
    public String getName() {
        return "Sewage";
    }

    public String getDescription() {
        return "Sewage Usage Fee";
    }

    public double calculateBill() {
        return 4.95;
    }
}
