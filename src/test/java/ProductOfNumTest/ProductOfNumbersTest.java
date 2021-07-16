package ProductOfNumTest;

import ProductsOfNum.ProductOfNumbersService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductOfNumbersTest {

    @Test
    public void emptyArrayTest(){
        Assert.assertEquals(ProductOfNumbersService.productOfNumber(new int[]{}), 0);
    }

    @Test
    public void productOfNumberTest(){
        Assert.assertEquals(ProductOfNumbersService.productOfNumber(new int[]{-10, 5, 8, -10, 3}), 800);
    }
}
