import drawers.Drawer;
import drawers.DrawerCode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;

    @Before
    public void before(){
        drawer = new Drawer(DrawerCode.A1);

    }

    @Test
    public void hasCode(){
        assertEquals(DrawerCode.A1, drawer.getCode());
    }

    @Test
    public void hasPrice(){
        assertEquals(0.0, drawer.getPrice(), 0.0);
    }

    @Test public void hasEmptyArrayList(){
        assertEquals(0, drawer.getProducts().size());
    }
}

