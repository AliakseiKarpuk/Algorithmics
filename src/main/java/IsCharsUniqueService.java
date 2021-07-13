import java.util.Locale;

public class IsCharsUniqueService {

    public static boolean text(String text){
        text = text.toLowerCase(Locale.ROOT);
        for(int i = 0; i < text.length(); i++){
           for(int j = 0; j < text.length(); j++){
               if(text.charAt(i) == text.charAt(j) && i != j){
                   return false;
               }
           }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Are all symbols different? " + text("12345 qwerty"));
    }
}
