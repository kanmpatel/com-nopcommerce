package browsertestingwithnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailAndPasswordWithFireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //launch URL method
        driver.get(baseUrl);
        //print currentUrl
        System.out.println("current Url = "+ driver.getCurrentUrl());
        //get the title of browser
        String title = driver.getTitle();
        System.out.println("url title is = "+ title);
        //find the email field element
        WebElement Email = driver.findElement(By.id("Email"));
        //sending email to email field elements
        Email.sendKeys("Prime123@gmail.com");
        //find the password field element
        WebElement password = driver.findElement(By.id("Password"));
        //sending password to password field elements
        password.sendKeys("1235prime");
        //print the page source
        System.out.println(driver.getPageSource());
        //close the browser
        driver.close();

    }
}
