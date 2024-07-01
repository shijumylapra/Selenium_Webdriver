package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test_run {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver wdriver = new ChromeDriver();
        WebElement buttonclick, user_name,passwd;
        wdriver.get("https://simplilearn.com/");
        wdriver.manage().window().maximize();
        wdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        buttonclick = wdriver.findElement(By.linkText("Log in"));
        buttonclick.click();
        user_name = wdriver.findElement(By.name("user_login"));
        user_name.sendKeys("emailid@gmail.com");
        passwd = wdriver.findElement(By.id("password"));
        passwd.sendKeys("@33Ssaddds@");
        buttonclick = wdriver.findElement(By.id("remember-me"));
        buttonclick.click();
        buttonclick = wdriver.findElement(By.name("btn_login"));
        buttonclick.click();
        System.out.println(wdriver.getTitle());
        System.out.println(wdriver.getCurrentUrl());

    }

}
