import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void costFunction1() throws Exception {
        // Arrange
        Strategy testCostFunc1 = new Strategy();
        int result, result2, result3, result4, result5;

        // Act
        result = testCostFunc1.costFunction1(0,1);
        result2 = testCostFunc1.costFunction1(1,2);
        result3 = testCostFunc1.costFunction1(2,3);
        result4 = testCostFunc1.costFunction1(3,4);
        result5 = testCostFunc1.costFunction1(4,0);

        // Assert
        Assert.assertEquals(1, result);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(200, result3);
        Assert.assertEquals(4, result4);
        Assert.assertEquals(200, result5);
    }

    @Test
    public void costFunction2() throws Exception {

        // Arrange
        Strategy testCostFunc2 = new Strategy();
        int result, result2, result3, result4, result5;

        // Act
        result = testCostFunc2.costFunction2(0,1);
        result2 = testCostFunc2.costFunction2(1,2);
        result3 = testCostFunc2.costFunction2(5,6);
        result4 = testCostFunc2.costFunction2(4,7);
        result5 = testCostFunc2.costFunction2(6,7);

        // Assert
        Assert.assertEquals(5, result);
        Assert.assertEquals(5, result2);
        Assert.assertEquals(3, result3);
        Assert.assertEquals(3, result4);
        Assert.assertEquals(11, result5);
    }

    @Test
    public void costFunction3() throws Exception{

        // Arrange
        Strategy testCostFunc3 = new Strategy();
        int result, result2, result3, result4, result5;

        // Act
        result = testCostFunc3.costFunction3(0,1);
        result2 = testCostFunc3.costFunction3(1,2);
        result3 = testCostFunc3.costFunction3(2,3);
        result4 = testCostFunc3.costFunction3(3,4);
        result5 = testCostFunc3.costFunction3(4,0);

        // Assert
        Assert.assertEquals(1, result);
        Assert.assertEquals(9, result2);
        Assert.assertEquals(25, result3);
        Assert.assertEquals(49, result4);
        Assert.assertEquals(16, result5);
    }
}