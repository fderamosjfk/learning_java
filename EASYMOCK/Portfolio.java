import java.util.List;

public class Portfolio {
   private StockService stockService;
   private List<Stock> stocks;

   public StockService getStockService() {
      return stockService;
   }
   
   public void setStockService(StockService stockService) {
      this.stockService = stockService;
   }

   public List<Stock> getStocks() {
      return stocks;
   }

   public void setStocks(List<Stock> stocks) {
      this.stocks = stocks;
   }

   public double getMarketValue(){
      double marketValue = 0.0;
      
      for(Stock stock:stocks){
         marketValue += stockService.getPrice(stock) * stock.getQuantity();
      }
      return marketValue;
   }

   public double[] getMinimumValues() {
      int stocksLength = stocks.size();
      double[] minimumValues = new double[stocksLength];

      int i = 0;
      for(Stock stock:stocks){
         minimumValues[i++] = stockService.getMinPrice(stock);
      }
      return minimumValues;
   }

   public double[] getMaximumValues() {
      int stocksLength = stocks.size();
      double[] maximumValues = new double[stocksLength];

      int i = 0;
      for(Stock stock:stocks){
         maximumValues[i++] = stockService.getMaxPrice(stock);
      }
      return maximumValues;
   }
}
