package Group_Annotations;

import org.testng.annotations.Test;

    class CartTests
    {

        @Test(groups = {"smoke", "cart"}, dependsOnMethods = {"shoesSearch"})
        public void addToCart()
        {
            System.out.println("CartTests: addToCart");
        }

        @Test(groups = {"regression", "cart"})
        public void removeFromCart()
        {
            System.out.println("CartTests: removeFromCart");
        }
    }

