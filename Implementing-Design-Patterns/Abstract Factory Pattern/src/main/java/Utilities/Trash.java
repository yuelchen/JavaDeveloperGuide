package Utilities;

public class Trash implements Utility {
    public String getName() {
        return "Trash";
    }

    public String getDescription() {
        return "Trash Collection Fee";
    }

    public double calculateBill() {
        return 4.75;
    }
}
