public class Warrior extends GameCharacter {

    public Warrior(){
        hp = 1000;
        mp = 100;
        range = 2;
        attack = 15;
        defence = 25;
    }

    String speak() {
        return "The warrior's way is the path least taken but the most honorable of them all!";
    }
}
