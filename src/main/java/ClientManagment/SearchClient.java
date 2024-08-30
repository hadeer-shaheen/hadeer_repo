package ClientManagment;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchClient
{
    private static WebDriver driver= Utilities.getDriver();

    public static void SearchForClient(String updatenamesearch)
    {

        driver.findElement(By.xpath("//a[@href ='/owner/clients/index']")).click(); //click on clients
        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).clear(); //Clear search field
        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys(updatenamesearch); //search on client
        driver.findElement(By.xpath("//button[@class='l-btn-inline l-btn--text-center ui-btn ui-btn--hover-ripple u-bg-color-secondary u-text-color-black u-text-hover-color-primary ui-filter-box-btn l-filter-box-btn']")).click(); //press on search button
    }
}
