package chicken;

public class ChickenBreast implements ChickenMeat {
    private int servingSize = 1;

    public ChickenBreast(int servings){
        this.servingSize = servings;
    }

    public String getPieceName(){
        return "Chicken Breast";
    }

    public int getServingSize(){
        return this.servingSize;
    }

    public int getCalories() {
        return 280 * servingSize;
    }

    public int getFat() {
        return 15 * servingSize;
    }

    public int getCholestrol() {
        return 65 * servingSize;
    }

    public int getSodium() {
        return 530 * servingSize;
    }

    public int getCarbohydrate() {
        return 12 * servingSize;
    }

    public int getProtein() {
        return 26 * servingSize;
    }
}