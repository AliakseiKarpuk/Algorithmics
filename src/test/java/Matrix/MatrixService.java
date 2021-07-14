package Matrix;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MatrixService {

    public static String readFromFile(){
        String file = "";
        try {
            file = new String(Files.readAllBytes(Paths.get("src/test/java/Matrix/MatrixTxt")));
        } catch (IOException e) {
            System.out.println("Не найден файл");
        }
        return file;
    }

    public static int fileStringList() {
        List<String> lines = new ArrayList<>();
        Path layout = Paths.get("src/test/java/Matrix/MatrixTxt");
            try {
                lines = Files.readAllLines(layout);

            } catch (IOException e) {
                System.out.println("Не найдены строки");;
            }
        return lines.size();
    }

    @Test
    public void fileIsNotEmpty(){
        Assert.assertFalse(readFromFile().isEmpty());
    }

    @Test
    public void fileStringListNotNull(){
        Assert.assertTrue(fileStringList() != 0);
    }
}
