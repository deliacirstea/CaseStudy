public abstract class ShareAssets implements Asset{
    //this is redundant coding

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol, double currentPrice) {
        this.symbol = symbol;
       // this.totalCost = totalCost;
        this.currentPrice = currentPrice;
        totalCost =0.0;
    }

    //adds a cost of the given amount to this asset
    public void addCost(double cost){
        totalCost += cost;
    }

    //return the price per share of this asset
    public double getCurrentPrice() {
        return currentPrice;
    }

   public double getTotalCost() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //returns the current market value of this asset
    public abstract double getMarketValue();

    //returns the profit earned on shares of this asset
    public double getProfit(){
        //calls an abstract getMarketValue method
        return  getMarketValue() - totalCost;
    }
}
