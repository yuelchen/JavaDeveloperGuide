public class WorldMap {
    public static void main(String[] args) {
        //loads all objects to reference
        CharacterCache.loadCharacters();

        GameCharacter characterCached1 = CharacterCache.getCharacter("Robin Hood");
        System.out.println(characterCached1.getName() + " says '" + characterCached1.speak() + "'");

        GameCharacter characterCached2 = CharacterCache.getCharacter("King Arthur");
        System.out.println(characterCached2.getName() + " says '" + characterCached2.speak() + "'");

        GameCharacter characterCached3 = CharacterCache.getCharacter("Severus Snape");
        System.out.println(characterCached3.getName() + " says '" + characterCached3.speak() + "'");
    }
}
