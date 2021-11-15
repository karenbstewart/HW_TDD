import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp(){
    waterBottle = new WaterBottle(100);
    }

    @Test
    public void checkStartingVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void checkDrinkFunctionReducesByTen(){
        waterBottle.drink();
        assertEquals(80,waterBottle.drink());
    }

    @Test
    public void testBottleIsEmptyABottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void testFillingWaterBottle(){
        waterBottle.drink();
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
