import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 24.12.16.
 */
//100 % ready
public class HashTab {
    private Map<String, Integer> hashMap = new HashMap<>();

    public HashTab() {
        insertInHashSet();
    }

    private void insertInHashSet() {
        hashMap.put("a", 65);
        hashMap.put("b", 66);
        hashMap.put("c", 67);
        hashMap.put("d", 68);
        hashMap.put("e", 69);
        hashMap.put("f", 70);
        hashMap.put("g", 71);
        hashMap.put("h", 72);
        hashMap.put("i", 73);
        hashMap.put("j", 74);
        hashMap.put("k", 75);
        hashMap.put("l", 76);
        hashMap.put("m", 77);
        hashMap.put("n", 78);
        hashMap.put("o", 79);
        hashMap.put("p", 80);
        hashMap.put("q", 81);
        hashMap.put("r", 82);
        hashMap.put("s", 83);
        hashMap.put("t", 84);
        hashMap.put("u", 85);
        hashMap.put("v", 86);
        hashMap.put("w", 87);
        hashMap.put("x", 88);
        hashMap.put("y", 89);
        hashMap.put("z", 90);
        hashMap.put("0", 48);
        hashMap.put("1", 49);
        hashMap.put("2", 50);
        hashMap.put("3", 51);
        hashMap.put("4", 52);
        hashMap.put("5", 53);
        hashMap.put("6", 54);
        hashMap.put("7", 55);
        hashMap.put("8", 56);
        hashMap.put("9", 57);
        hashMap.put(".", 46);
        hashMap.put("_", 523);
        hashMap.put(" ", 32);
        hashMap.put("-", 45);
        hashMap.put("/", 47);
    }

    public Map<String, Integer> getHashMap() {
        return hashMap;
    }
}
