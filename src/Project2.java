import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Project2 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement( By.name( "firstname" ) ).sendKeys( "Daulet" );

        driver.findElement( By.name( "lastname" ) ).sendKeys( "Saurbekov" );

        WebElement maleRadioBtn = driver.findElement (By.id("sex-0"));
        maleRadioBtn.click();

        WebElement yearsOfExp = driver.findElement (By.id("exp-1"));
        yearsOfExp.click();

        driver.findElement(By.id("datepicker")).sendKeys("12/16/2019");

        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("tool-2")).click();

        WebElement select = driver.findElement(By.name("continents"));
        //select for dropdown
        Select dropdown=new Select(select);
        dropdown.selectByVisibleText("North America");


        Select seleniumCommands =new Select(driver.findElement(By.id("selenium_commands")));

        List<WebElement> option = seleniumCommands.getOptions();

        for(int i=0;i<option.size();i++) {

            option.get( i ).click();

        }


    }
}
