import AppAuth.Login;
import ClientManagment.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utilities.Utilities.driver;

public class TestAddingClient
{
 @BeforeMethod
     public static void login()
 {
     Login.LoginApp();
 }
@Test (priority = 1,dataProvider = "test_data")
    public static void TestValidData1(String ClientName,String updatenamesearch)
{
//    String ClientName= "Ahmed";
//    String updatenamesearch="Ahmed Mohamed";
    AddClient.AddNewCustomer(ClientName);
    SearchClient.SearchForClient(ClientName);
    ClientActions.editClient(updatenamesearch);
    SearchClient.SearchForClient(updatenamesearch);

}

    @Test (priority = 2)
    public static void Blancdata()
    {
        driver.findElement(By.xpath("//i[@class='mdi mdi-account-plus d-block fs-36 mb-2 text-navy-s2020']")).click();
        driver.findElement(By.id("submitBtn")).click();
        WebElement errormsg = driver.findElement(By.cssSelector("div[class=\"error-message\"]"));
        Assert.assertTrue(errormsg.isDisplayed());
    }

    @Test(priority = 3)

    public static void ViewCustomer()
    {
        String ClientName= "Ahmed";
        SearchClient.SearchForClient(ClientName);
        ViewClient.ViewTheCustomer();
    }

    @Test( priority = 4)
    public static void CloneCustomer()

    {
        String ClientName= "Ahmed";
        SearchClient.SearchForClient(ClientName);
        CloneClient.cloneCustomer();
    }

    @Test (priority = 5)

    public static void deletecustomer()
    {
        String ClientName= "Ahmed";
        SearchClient.SearchForClient(ClientName);
        DeleteClient.DeleteClient();
       WebElement errormsg = driver.findElement(By.cssSelector("div[class=\"ui-flash-message-body-text\"]"));
          Assert.assertTrue(errormsg.isDisplayed());

    }
//    public static void logout()
//{
//    LogOut.LogoutApp();
//}
    @DataProvider

    public String [][] test_data()
    {
        return  new String[][]
                {
                        {"Ahmed","Ahmed Mohamed"}
                };
    }
}
