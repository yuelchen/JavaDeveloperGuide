package chicken;

public class ChickenThigh implements ChickenMeat {
    private int servingSize = 1;

    public ChickenThigh(int servings){
        this.servingSize = servings;
    }

    public String getPieceName(){
        return "Chicken Thigh";
    }

    public int getServingSize(){
        return this.servingSize;
    }

    public int getCalories() {
        return 360 * servingSize;
    }

    public int getFat() {
        return 24 * servingSize;
    }

    public int getCholestrol() {
        return 65 * servingSize;
    }

    public int getSodium() {
        return 570 * servingSize;
    }

    public int getCarbohydrate() {
        return 13 * servingSize;
    }

    public int getProtein() {
        return 21 * servingSize;
    }
}