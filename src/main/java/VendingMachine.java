import coins.Coin;
import coins.CoinReturn;
import coins.ITotalCoins;
import drawers.Drawer;
import drawers.DrawerCode;
import products.Product;
import java.lang.Double;

import java.util.ArrayList;

import static java.lang.Double.compare;

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

    public boolean checkCoinValid(Coin coin){
        return coin.getCoinType().isValid();
    }

    public void insertCoin(Coin coin){
        if(checkCoinValid(coin)){
            addCoin(coin);
        }else{
            getCoinReturn().addCoin(coin);
        }
    }

    public double getPriceFromCode(DrawerCode code){
        for(Drawer drawer: drawers){
            if(drawer.getCode() == code){
                return drawer.getPrice();
            }
        }
        return 0;
    }

    public Drawer getDrawerFromCode(DrawerCode code){

        for(Drawer drawer: drawers){
            if(drawer.getCode() == code){
                return drawer;
            }
        }
        return null;
    }

    public double calculateChangeToReturn(double price){
        return calculateCoinsTotal() - price;
    }

//    public ArrayList<Coin> allocateCoinsToReturn(){
//
//    }

    public Product buyProduct(DrawerCode code){
        Drawer drawer = getDrawerFromCode(code);
        double price = getPriceFromCode(code);
        if(compare(calculateCoinsTotal(), price) > 0  && price > 0){ //
            double change = calculateChangeToReturn(price);
            coinsEntered.clear();
            return drawer.removeProduct();
        } else{
            System.out.println("Please insert more coins to the value of GBP " + (price-calculateCoinsTotal()));
            return null;
        }



    }

}
