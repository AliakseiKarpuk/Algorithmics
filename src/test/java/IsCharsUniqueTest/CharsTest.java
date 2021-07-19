package IsCharsUniqueTest;

import IsCharsUniq.IsCharsUniqueService;
import dataProvider.IsCharUniqueDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CharsTest {

   @Test(dataProvider = "IsCharUniqueDataProvider", dataProviderClass = IsCharUniqueDataProvider.class)
    public void charsWithDifferentDataTest(String chars, boolean value){
        Assert.assertEquals(IsCharsUniqueService.chars(chars), value);
   }
}
