import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet("M&M's", "Mars");
    }

    @Test
    public void hasName(){
        assertEquals("M&M's", sweet.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Mars", sweet.getBrand());

    }

    @Test
    public void hasPrice(){
        assertEquals(0.65, sweet.getPrice(), 0.0);
    }



}
