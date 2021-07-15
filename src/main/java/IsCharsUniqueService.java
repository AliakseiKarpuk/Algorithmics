import java.util.Locale;

public class IsCharsUniqueService {

    public static boolean text(String text) {
        text = text.toLowerCase(Locale.ROOT); //
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Are all symbols different? " + text("12345 qwerty"));
    }
    /*
            1. Отсутствует тестовое покрытие для метода
            2. Тестовое покрытие должно быть в отдельном файле в папке с именем test
            3. Что будет если ввести спецсимволы или керилицу или пустую строку
            4. В место System.out.println лучше использовать логи
            5. Отсутствует джавадок
            6. Отдельные задачи на мой взгляд лучше либо разделять на проекты либо хотябы на отдельные модули,
            не понятно какой клас с кем взоимодействует.

         */
}
