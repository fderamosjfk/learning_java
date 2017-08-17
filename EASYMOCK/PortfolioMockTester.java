import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

public class PortfolioMockTester {
   Portfolio portfolio;	
   StockService stockService;

   public static void main(String[] args){
      PortfolioMockTester tester = new PortfolioMockTester();
      tester.setUp();
      System.out.println(tester.testMarketValue() ? "pass" : "fail");
   }

   public void setUp(){
      //Create a portfolio object which is to be tested		
      portfolio = new Portfolio();		
      
      //Create the mock object of stock service
      stockService = EasyMock.createMock(StockService.class);		
      
      //set the stockService to the portfolio
      portfolio.setStockService(stockService);
   }

   public boolean testMarketValue(){
   
      //Creates a list of stocks to be added to the portfolio
      List<Stock> stocks = new ArrayList<Stock>();
      Stock googleStock = new Stock("1","Google", 10);
      Stock microsoftStock = new Stock("2","Microsoft",100);	
      
      stocks.add(googleStock);
      stocks.add(microsoftStock);

      //add stocks to the portfolio
      portfolio.setStocks(stocks);

      // mock the behavior of stock service to return the value of various stocks
      EasyMock.expect(stockService.getPrice(googleStock)).andReturn(50.00);
      EasyMock.expect(stockService.getPrice(microsoftStock)).andReturn(1000.00);		
      EasyMock.expect(stockService.getMaxPrice(googleStock)).andReturn(75.00);
      EasyMock.expect(stockService.getMaxPrice(microsoftStock)).andReturn(1100.00);		

      EasyMock.expect(stockService.getMinPrice(googleStock)).andReturn(25.00);
      EasyMock.expect(stockService.getMinPrice(microsoftStock)).andReturn(900.00);		


      // activate the mock
      EasyMock.replay(stockService);		

      System.out.println("Minimum values:");
      double[] minValues = new double[stocks.size()];
      minValues=  portfolio.getMinimumValues();
      System.out.println(minValues[0]);
      System.out.println(minValues[1]);

      System.out.println("Maximum values:");
      double[] maxValues = new double[stocks.size()];
      maxValues=  portfolio.getMaximumValues();
      System.out.println(maxValues[0]);
      System.out.println(maxValues[1]);

      double marketValue = portfolio.getMarketValue();		
      return marketValue == 100500.0;
   }
}
