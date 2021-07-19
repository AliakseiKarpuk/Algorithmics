package IsCharsUniq;

public class IsCharsUniqueService {

    public static boolean chars(String chars) {
        for (int i = 0; i < chars.length(); i++) {
            for (int j = 0; j < chars.length(); j++) {
                if (chars.charAt(i) == chars.charAt(j) && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Are all symbols different? " + chars("QWERTYqwerty"));
    }
}
