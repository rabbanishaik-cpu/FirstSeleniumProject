import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.calculator.net/");

        driver.manage().window().maximize();
        //click on math calculator
        driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
        //click on percentage calculator
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();

        // Enter value 10 in the first number of the percent Calculator
        driver.findElement(By.id("cpar1")).sendKeys("10");

        // Enter value 50 in the second number of the percent Calculator
        driver.findElement(By.id("cpar2")).sendKeys("50");

        // Click Calculate Button
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();


        // Get the Result Text based on its xpath
        String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();


        // Print a Log In message to the screen
        System.out.println(" The Result is " + result);

        //Close the Browser.
        //driver.close();

        driver.quit();
    }
}
