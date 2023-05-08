public class Stocks extends ShareAssets {
    private int totalShares;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }
    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }

  /*  @Override
    public double getProfit() {
        return getMarketValue()-getTotalCost();
    }*/

    public int getTotalShares() {
        return totalShares;
    }

    //records a pruchase of the given number of shares of the stock at the given price
    public void purchase(int shares, double pricePerShare ){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
