import coins.CoinReturn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;

    @Before
    public void before(){
        coinReturn = new CoinReturn();
    }

    @Test
    public void hasAnEmptyCoinsReturned(){
        assertEquals(0, coinReturn.getCoins().size());
    }
}
