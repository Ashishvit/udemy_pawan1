package Group_Annotations;

import org.testng.annotations.Test;

public class CheckoutTests
{

    @Test(groups = {"smoke", "checkout"})
    public void successfulCheckout()
    {
        System.out.println("CheckoutTests: successfulCheckout");
    }

    @Test(groups = {"regression", "checkout"})
    public void failedCheckout()
    {
        System.out.println("CheckoutTests: failedCheckout");
    }
}