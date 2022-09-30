import java.util.HashMap;

public class CharacterManager {
    private HashMap<String, Character> map;

    // Begin Singleton:
    private static CharacterManager instance = null;

    private CharacterManager() {
        map = new HashMap<String, Character>();
    }

    public static CharacterManager getInstance() {
        if (instance == null) {
            instance = new CharacterManager();
        }
        return instance;
    }
    // End Singleton:

    public void registerCharacter(Character character) {
        map.put(character.getName(), character);
    }

    public Character getCharacter(String characterName) {
        return map.get(characterName);
    }

    public void removeCharacter(Character character) {
        map.remove(character);
    }
}