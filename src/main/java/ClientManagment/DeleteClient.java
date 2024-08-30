package ClientManagment;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utilities.Utilities.driver;

public class DeleteClient
{
    private static WebDriver driver= Utilities.getDriver();

    public static void DeleteClient()
    {
        driver.findElement(By.xpath("(//tr//td[4]//button[@class='l-dropdown-icon ui-dropdown-icon-dots-h'])[1]")).click();  //press on dots icon
        driver.findElement(By.xpath("(//i[@class ='mdi mdi-delete u-text-color-danger'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm btn-lg']")).click();

    }

}


