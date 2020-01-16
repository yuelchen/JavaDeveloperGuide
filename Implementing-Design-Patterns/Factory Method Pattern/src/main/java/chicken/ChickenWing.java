package chicken;

public class ChickenWing implements ChickenMeat {
    private int servingSize = 1;

    public ChickenWing(int servings){
        this.servingSize = servings;
    }

    public String getPieceName(){
        return "Chicken Wing";
    }

    public int getServingSize(){
        return this.servingSize;
    }

    public int getCalories() {
        return 390 * servingSize;
    }

    public int getFat() {
        return 25 * servingSize;
    }

    public int getCholestrol() {
        return 80 * servingSize;
    }

    public int getSodium() {
        return 650 * servingSize;
    }

    public int getCarbohydrate() {
        return 17 * servingSize;
    }

    public int getProtein() {
        return 23 * servingSize;
    }
}