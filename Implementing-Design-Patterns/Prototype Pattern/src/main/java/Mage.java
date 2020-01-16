public class Mage extends GameCharacter {

    public Mage(){
        hp = 500;
        mp = 1000;
        range = 7;
        attack = 20;
        defence = 15;
    }

    String speak() {
        return "Knowledge grants power, power grants riches and riches grants freedom; we are free!";
    }
}
