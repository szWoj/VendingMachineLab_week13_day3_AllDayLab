package coins;

import java.util.ArrayList;


public class CoinReturn implements ITotalCoins{
    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<>();
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public void addCoin(Coin coin){
        coins.add(coin);
    }

    public double calculateCoinsTotal(){
        double total = 0;
        for(Coin coin: coins){
            total = Double.sum(total, coin.getCoinValue());
        }
        return total;
    }
}
