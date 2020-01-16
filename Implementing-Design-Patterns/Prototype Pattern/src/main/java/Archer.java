public class Archer extends GameCharacter {

    public Archer(){
        hp = 800;
        mp = 250;
        range = 8;
        attack = 12;
        defence = 20;
    }

    String speak() {
        return "Distance is the key to victory!";
    }
}
