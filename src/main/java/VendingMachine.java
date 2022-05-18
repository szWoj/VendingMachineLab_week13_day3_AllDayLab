import coins.Coin;
import coins.CoinReturn;
import coins.ITotalCoins;
import drawers.Drawer;

import java.util.ArrayList;

public class VendingMachine implements ITotalCoins {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coinsEntered;
    private CoinReturn coinReturn;

    public VendingMachine(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
        this.drawers = new ArrayList<>();
        this.coinsEntered = new ArrayList<>();
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public ArrayList<Coin> getCoinsEntered() {
        return coinsEntered;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public void setCoinReturn(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
    }
    public void addCoin(Coin coin){
        coinsEntered.add(coin);

    }

    public double calculateCoinsTotal(){
    double total = 0;
    for(Coin coin: coinsEntered){
        total = Double.sum(total, coin.getCoinValue());
    }
    return total;
    }
}
