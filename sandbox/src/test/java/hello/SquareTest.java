package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testArea(){
        Square s = new Square(5);
        double l =25;
        Assert.assertEquals(s.area(), l);
    }
}
