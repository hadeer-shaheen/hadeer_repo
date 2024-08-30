package AppAuth;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
   private static WebDriver driver= Utilities.getDriver();
   public static void LoginApp()
   {

      driver.get("https://bilogih649.daftra.com/");
      driver.manage().window().maximize();
      driver.findElement(By.id("Email")).sendKeys("bilogih649@ndiety.com");
      driver.findElement(By.id("Password")).sendKeys("z5Jy!J6T-/ZaArQ");
      driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success btn-block']")).click();
   }
}
