import drawers.Drawer;
import drawers.DrawerCode;
import org.junit.Before;
import org.junit.Test;
import products.Drink;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Sweet sweet;
    Drink drink;

    @Before
    public void before(){
        drawer = new Drawer(DrawerCode.A1);
        sweet = new Sweet("M&M's", "Mars");
        drink = new Drink("MountainDew", "Pepsi");

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

    @Test
    public void canAddProductWithPrice(){
        drawer.addProduct(sweet);
        assertEquals(1, drawer.getProducts().size());
        assertEquals(0.65, drawer.getPrice(),0.0);
    }

    @Test
    public void canNotAddProductOfDifferentType(){
        drawer.addProduct(sweet);
        drawer.addProduct(drink);
        assertEquals(1, drawer.getProducts().size());
        assertEquals(0.65, drawer.getPrice(),0.0);
    }


    @Test
    public void canRemoveProduct(){
        drawer.addProduct(sweet);
        drawer.addProduct(sweet);
        drawer.removeProduct();
        assertEquals(1, drawer.getProducts().size());
        assertEquals(0.65, drawer.getPrice(), 0.0);

    }

    @Test
    public void canSetPriceToZeroWhenDrawerEmpty(){
        drawer.addProduct(sweet);
        assertEquals(0.65, drawer.getPrice(), 0.0);
        drawer.removeProduct();
        assertEquals(0, drawer.getPrice(), 0.0);
    }

    @Test
    public void canCheckProductTypeMatchFalse(){
        drawer.addProduct(sweet);
        assertEquals(false, drawer.productsTypeMatch(drink));
    }
    @Test
    public void canCheckProductTypeMatchTrue(){
        drawer.addProduct(sweet);
        assertEquals(true, drawer.productsTypeMatch(sweet));
    }
}

