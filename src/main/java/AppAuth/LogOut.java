package AppAuth;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut
{

    private static WebDriver driver= Utilities.getDriver();
    public static void LogoutApp()
    {
        driver.findElement(By.xpath("//button[@class='m-app-header-user-btn']")).click();
        driver.findElement(By.xpath("//a[@class='m-app-header-user-dropdown-menu-item u-text-color-danger u-text-hover-color-white u-bg-hover-color-danger']")).click();
    }
}
