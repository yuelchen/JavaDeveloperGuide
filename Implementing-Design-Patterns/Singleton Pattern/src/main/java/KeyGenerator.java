import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class KeyGenerator {
    private static KeyGenerator instance = new KeyGenerator();
    private static int instanceCount = 0;

    private static final String possibleCharacters = "abcdefghijkmnopqrstuvwxyz0123456789";
    private static final int keyLength = 16;
    private List<String> keys = new ArrayList<String>();
    private Random random = new Random();

    //private so class cannot be instantiated
    private KeyGenerator(){}

    //allow caller to get instance if it's able to.
    public static KeyGenerator getInstance() throws Exception{
        if(instanceCount == 0) {
            instanceCount = 1;
            return instance;
        }
        else
            throw new Exception();
    }

    public String getKey(){
        String newKey = "";

        do{
            newKey += possibleCharacters.charAt(random.nextInt(possibleCharacters.length()));
        }
        while(newKey.length() < this.keyLength);

        if(keys.contains(newKey)){
            newKey = this.getKey();
        }
        else
            this.keys.add(newKey);

        return newKey;
    }

    public boolean deleteKey(String key){
        boolean deleted = false;
        if(this.keys.contains(key)){
            this.keys.remove(key);
            deleted = true;
        }

        return deleted;
    }

    public boolean checkKey(String key){
        if(this.keys.contains(key)){
            return true;
        }
        else
            return false;
    }

    public void printAllKeys(){
        int counter = 1;
        for(String key: this.keys){
            System.out.println("Key [" + counter + "]: " + key);
            counter++;
        }
    }
}
