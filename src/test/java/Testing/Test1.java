package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class Test1 {


    public static WebDriver driver;
    @Test
    public void H(){


        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://ww.google.com");

   }
}
