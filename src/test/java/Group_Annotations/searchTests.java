package Group_Annotations;

import org.testng.annotations.Test;

public class searchTests
{
    @Test(groups = {"smoke"})
    public void shoesSearch()
    {
        System.out.println("shoes search successfully");
    }

    @Test(groups = {"smoke"})
    public void shirtSearch()
    {
        System.out.println("shirt search successfully");
    }


}
