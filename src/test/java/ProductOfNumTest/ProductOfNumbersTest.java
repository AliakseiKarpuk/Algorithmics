package ProductOfNumTest;

import ProductsOfNum.ProductOfNumbersService;
import dataProvider.ProductOfNumbersDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductOfNumbersTest {

    @Test(dataProvider = "ProductOfNumbersDataProvider", dataProviderClass = ProductOfNumbersDataProvider.class)
    public void productOfNumberTest(int[] numbers, int expextedResult) {
        Assert.assertEquals(ProductOfNumbersService.productOfNumber(numbers), expextedResult);
    }
}
