package IsCharsUniqueTest;

import IsCharsUniq.IsCharsUniqueService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CharsTest {

    @Test
    public void charsTrueTest(){
        Assert.assertTrue(IsCharsUniqueService.text("QWERTYqwerty"));
    }

    @Test
    public void charsFalseTest(){
        Assert.assertFalse(IsCharsUniqueService.text("qwerqwer"));
    }
}
