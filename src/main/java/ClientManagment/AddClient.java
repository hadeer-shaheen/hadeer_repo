package ClientManagment;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddClient
{
    private static WebDriver driver= Utilities.getDriver();

    public static void AddNewCustomer(String ClientName)
    {
        driver.findElement(By.xpath("//i[@class='mdi mdi-account-plus d-block fs-36 mb-2 text-navy-s2020']")).click();
        WebElement Searchfield = driver.findElement(By.id("ClientBusinessName"));
        Searchfield.sendKeys(ClientName);
        driver.findElement(By.id("submitBtn")).click();
    }
}
