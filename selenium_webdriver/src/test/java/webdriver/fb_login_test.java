package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class fb_login_test {

    public static void main(String[] args)
    {
        WebElement username,passwd,button_click,SignUp;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        username=driver.findElement(By.id("email"));
        username.sendKeys("shijuabraham@yahoo.com");
        passwd=driver.findElement(By.id("pass"));
        passwd.sendKeys("!990fersh");
        button_click=driver.findElement(By.name("login"));
        button_click.click();
        driver.get("https://www.facebook.com/login/");
        SignUp = driver.findElement(By.partialLinkText("Create new")); SignUp.click();
        driver.close();
    }
}
