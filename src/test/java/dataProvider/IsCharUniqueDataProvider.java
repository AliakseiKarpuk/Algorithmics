package dataProvider;

import org.testng.annotations.DataProvider;

public class IsCharUniqueDataProvider {

    @DataProvider(name = "IsCharUniqueDataProvider")
    public static Object[][] data(){
        return new Object[][]{{"qwerty" , true},
                {"QWERTYqwerty" , true},
                {"12345", true},
                {"+_-=!,.", true},
                {"1122334455", false},
                {"qwerttyy", false},
                {"++--==", false},
                {"йцукен", true},
                {"йцйцйцйц", false},
                {"qwertйцуке", true},
                {"qwert1234", true},
                {"йцук1234", true}
        };
    }
}
