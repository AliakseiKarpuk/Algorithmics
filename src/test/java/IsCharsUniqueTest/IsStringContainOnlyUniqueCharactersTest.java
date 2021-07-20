package IsCharsUniqueTest;

import IsStringContainOnlyUniqueCharacters.IsStringContainOnlyUniqueCharacters;
import dataProvider.IsCharUniqueDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsStringContainOnlyUniqueCharactersTest {

   @Test(dataProvider = "IsCharUniqueDataProvider", dataProviderClass = IsCharUniqueDataProvider.class)
    public void  isStringContainOnlyUniqueCharactersTest(String chars, boolean value){
        Assert.assertEquals(IsStringContainOnlyUniqueCharacters.isStringContainOnlyUniqueCharacters(chars), value);
   }
}
