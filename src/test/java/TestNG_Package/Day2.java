package TestNG_Package;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Day2
{
    @Test(dataProvider = "loginData")
public void ploan(String username, String password)

{
    System.out.println("Class day_2 good");
    System.out.println(username);
    System.out.println(password);
}

@BeforeTest
public void prerequiste()
{
    System.out.println("I will execute first");
}
@Test
    public void myloan()
{
    System.out.println("my  loan");

}
    @DataProvider(name = "loginData")
public Object[][] getData()
{
    //1st combination username password
    Object[][] data = new Object[3][2]; // 3 row 2 cloumn row means set of data // cloun means two parameter
    //1st set
    data[0][0] = "firstusername";
    data[0][1] = "firstpassword";
    //2nd set
    data[1][0] = "secondusername";
    data[1][1] = "secondpassword";
    //3rd set
    data[2][0] = "thirdusername";
    data[2][1] = "thirdpassword";
    return  data;
}
}