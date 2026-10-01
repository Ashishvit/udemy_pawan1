package Group_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest
{

    @Parameters({"username", "password"})
    public void validLogin(String username, String password)
    {
        System.out.println("username: " + username);
        System.out.println("Password: " + password);
    }
        @Test(groups = {"regression", "login"})
        public void invalidLogin()
        {
            System.out.println("LoginTests: invalidLogin");
        }
    }



