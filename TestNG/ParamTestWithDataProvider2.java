import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider2 {
   @DataProvider(name = "test1")
   public static Object[][] provideBean() {
      return new Object[][] { { new ParamDataProviderBean("hi I am bean# 01", 111) } };
   }

   @Test(dataProvider = "test1")
   public void testMethod(ParamDataProviderBean myBean) {
      System.out.println(myBean.getVal() + " " + myBean.getI());
   }
}
