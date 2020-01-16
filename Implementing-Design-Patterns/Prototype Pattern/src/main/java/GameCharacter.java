public abstract class GameCharacter implements Cloneable{
    private String name;
    protected int hp;
    protected int mp;
    protected int range;
    protected int attack;
    protected int defence;

    abstract String speak();

    public String getName(){
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public int getRange() {
        return this.range;
    }

    public int getAttachDamage() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setName(String name){
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
