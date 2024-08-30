package ClientManagment;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientActions
{
    private static WebDriver driver= Utilities.getDriver();

    public static void editClient(String updatenamesearch)
    {
        driver.findElement(By.xpath("(//tr//td[4]//button[@class='l-dropdown-icon ui-dropdown-icon-dots-h'])[1]")).click();  //press on dots icon
        driver.findElement(By.xpath("//i[@class='mdi mdi-pencil u-text-color-subprimary']")).click();  //press on edit button
        WebElement Edit = driver.findElement(By.id("ClientBusinessName"));
        Edit.clear();
        Edit.sendKeys(updatenamesearch);
        driver.findElement(By.id("submitBtn")).click();
        //driver.findElement(By.xpath("//a[@href ='/owner/clients/index']")).click(); //click on clients
        //WebElement Clearsearch= driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]"));

    }

    public static void viewClient()
    {

    }

    public static void deleteClient()
    {

    }
}
