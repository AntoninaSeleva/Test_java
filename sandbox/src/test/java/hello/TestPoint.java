package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {
    @Test
    public void testArea(){
        Point p = new Point(2.1,1.1);

        Assert.assertEquals(p.distance(), 3.2);
    }
}
