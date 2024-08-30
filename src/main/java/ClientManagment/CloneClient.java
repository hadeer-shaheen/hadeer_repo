package ClientManagment;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloneClient
{
    private static WebDriver driver= Utilities.getDriver();

    public static void cloneCustomer()
    {
        driver.findElement(By.xpath("(//tr//td[4]//button[@class='l-dropdown-icon ui-dropdown-icon-dots-h'])[1]")).click();  //press on dots icon
        driver.findElement(By.xpath("(//i[@class='mdi mdi-content-copy u-text-color-subprimary'])[1]")).click();
        driver.findElement(By.id("submitBtn")).click();
    }

}

