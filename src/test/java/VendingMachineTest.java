import coins.Coin;
import coins.CoinReturn;
import coins.CoinType;
import drawers.Drawer;
import org.junit.Before;
import org.junit.Test;
import sun.invoke.empty.Empty;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin;
    Coin coin2;
    CoinReturn coinReturn;




    @Before
    public void before(){
        coin = new Coin(CoinType.P100);
        coin2 = new Coin(CoinType.P10);
        coinReturn = new CoinReturn();
        vendingMachine = new VendingMachine(coinReturn);

    }

    @Test
    public void hasEmptyDrawerArrayList(){
        assertEquals(0, vendingMachine.getDrawers().size());
    }

    @Test
    public void hasCoinsEnteredArrayList(){
        assertEquals(0, vendingMachine.getCoinsEntered().size());
    }

    @Test
    public void hasCoinReturned(){
        assertEquals(coinReturn, vendingMachine.getCoinReturn());
    }

    @Test
    public void canAddCoin(){
        vendingMachine.addCoin(coin);
        assertEquals(1, vendingMachine.getCoinsEntered().size());
    }

    @Test
    public void canCalculateCoinsTotal(){
        vendingMachine.addCoin(coin);
        vendingMachine.addCoin(coin2);
        assertEquals(1.1, vendingMachine.calculateCoinsTotal(), 0.0);
    }


}
