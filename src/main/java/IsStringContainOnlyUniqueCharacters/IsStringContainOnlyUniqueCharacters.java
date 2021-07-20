package IsStringContainOnlyUniqueCharacters;

public class IsStringContainOnlyUniqueCharacters {

    public static boolean isStringContainOnlyUniqueCharacters(String chars) {
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
        System.out.println("Are all symbols different? " + isStringContainOnlyUniqueCharacters("QWERTYqwerty"));
    }
}
