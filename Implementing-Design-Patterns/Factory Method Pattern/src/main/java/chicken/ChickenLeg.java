package chicken;

public class ChickenLeg implements ChickenMeat {
    private int servingSize = 1;

    public ChickenLeg(int servings){
        this.servingSize = servings;
    }

    public String getPieceName(){
        return "Chicken Leg";
    }

    public int getServingSize(){
        return this.servingSize;
    }

    public int getCalories() {
        return 290 * servingSize;
    }

    public int getFat() {
        return 16 * servingSize;
    }

    public int getCholestrol() {
        return 50 * servingSize;
    }

    public int getSodium() {
        return 540 * servingSize;
    }

    public int getCarbohydrate() {
        return 9 * servingSize;
    }

    public int getProtein() {
        return 26 * servingSize;
    }
}