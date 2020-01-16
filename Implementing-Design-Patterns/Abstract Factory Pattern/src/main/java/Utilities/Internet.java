package Utilities;

public class Internet implements Utility {
    private final String name = "Internet";
    private String description = "Regular Internet Plan";
    private boolean cable;
    private boolean telephone;

    //default constructor
    public Internet(){
        this.cable = false;
        this.telephone = false;
    }

    public Internet(boolean cable, boolean telephone){
        this.cable = cable;
        this.telephone = telephone;

        if(this.cable && this.telephone){
            this.description = "Internet Plan Deluxe Choice - Internet, Cable and Telephone";
        }
        else if(this.cable){
            this.description = "Internet Plan Premium Choice 1 - Internet and Cable";
        }
        else if(this.telephone){
            this.description = "Internet Plan Premium Choice 2 - Internet and Telephone";
        }
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double calculateBill() {
        if(this.cable && this.telephone)
            return 155.60;
        else if(this.cable)
            return 123.00;
        else if(this.telephone)
            return 105.10;
        else
            return 89.99;
    }
}
