package TestNG_Package;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Day1
{
    @Test
    public void demo()
    {
        System.out.println("Hello");
    }
    @Test
    public void secondTest()

    {
        System.out.println("Bye");
    }

@BeforeMethod
public void beforemethod()
{
    System.out.println("i ama ashish");

}
    @AfterSuite
    public void afteresuite()
    {
        System.out.println("i am at last");
    }
}