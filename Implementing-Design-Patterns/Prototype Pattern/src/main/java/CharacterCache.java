import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class CharacterCache {
    private static Map<String, GameCharacter> characters = new HashMap<String, GameCharacter>();

    public static GameCharacter getCharacter(String name){
        if(characters.containsKey(name)) {
            return characters.get(name);
        }
        else
            throw new NoSuchElementException();
    }

    public static void loadCharacters() {
        Archer archer = new Archer();
        archer.setName("Robin Hood");
        characters.put("Robin Hood", archer);

        Warrior warrior = new Warrior();
        warrior.setName("King Arthur");
        characters.put("King Arthur", warrior);

        Mage mage = new Mage();
        mage.setName("Severus Snape");
        characters.put("Severus Snape", mage);
    }
}