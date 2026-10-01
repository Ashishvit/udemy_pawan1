package TestNG_Package;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class Day3
{
    @Test
  public void   WebLogInCarLoan()
    {
       System.out.println("WebLogInCarLoan");
    }
    @Test
    public void mobileLogInCarloan()

    {
       System.out.println("mobileLogCarLoan");
    }
    @Test
    public void apiLogInCarLoan()

    {
     System.out.println("apiLoanCarLoan");
    }
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("i am at top");
    }
}

