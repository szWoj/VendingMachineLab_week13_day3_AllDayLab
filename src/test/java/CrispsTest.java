import org.junit.Before;
import org.junit.Test;
import products.Crisps;

import static org.junit.Assert.assertEquals;

public class CrispsTest {

    Crisps crisps;

    @Before
    public void before(){
        crisps = new Crisps("Salt&Vinegar", "Walkers");
    }

    @Test
    public void hasName(){
        assertEquals("Salt&Vinegar", crisps.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Walkers", crisps.getBrand());

    }

    @Test
    public void hasPrice(){
        assertEquals(0.50, crisps.getPrice(), 0.0);
    }

}
