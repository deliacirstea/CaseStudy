public class CodeTest {
    public static void main(String[] args){
        //1 - Classes: Stocks, DividendStocks, MutualFunds, Cash
        //2 - Relations. DividendStock is-a Stock
        //3 - Because different assets compute their market values in different ways:
        //We use Interface: getMarket Value and getProfit
        //4 - Similarities between mutual funds and stocks
        //both store assets that are based on shares



    Asset asset = new MutualFunds("AMZ", 300);
    asset.getMarketValue();
    System.out.println(asset.getMarketValue());




    }

}
