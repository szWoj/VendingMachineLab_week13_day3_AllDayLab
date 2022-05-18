import coins.Coin;
import coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;
    Coin coin2;

    @Before
    public void before(){
        coin = new Coin(CoinType.P5);
        coin2 = new Coin(CoinType.P1);


    }

    @Test
    public void hasName(){
        assertEquals("5p", coin.getCoinType().getName());
    }

    @Test
    public void isValid(){
        assertEquals(true, coin.getCoinType().isValid());
    }

    @Test
    public void isNotValid(){
        assertEquals(false, coin2.getCoinType().isValid());
    }

    @Test
    public void hasValue(){
        assertEquals(0.05, coin.getCoinType().getValue(), 0.0);
    }





}
