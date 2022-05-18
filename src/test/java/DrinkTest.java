import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {
    Drink drink;

    @Before
    public void before(){
        drink = new Drink("MountainDew", "Pepsi");
    }

    @Test
    public void hasName(){
        assertEquals("MountainDew", drink.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Pepsi", drink.getBrand());

    }

    @Test
    public void hasPrice(){
        assertEquals(1.00, drink.getPrice(), 0.0);
    }
}
