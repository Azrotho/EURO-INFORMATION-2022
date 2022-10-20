import java.util.HashMap;

public class one {
public static void main(String[] args) {
    HashMap<String, Boolean> alreadySeen = new HashMap<String, Boolean>();
    String line = "azazaaza";
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (alreadySeen.containsKey(String.valueOf(c))) {
            continue;
        }
        alreadySeen.put(String.valueOf(c), true);
        count++;
    }
}
}
