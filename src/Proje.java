import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Proje {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.google.com/" );

        WebElement element=driver.findElement(By.name("q"));

        element.sendKeys("Techno Study");
        element.submit();



        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int i = 0;
        for (WebElement link : allLinks) {
            if (link.getAttribute("href")!= null){

                if (link.getAttribute("href").startsWith("https://www.techno.study/")) {
                    System.out.println(link.getText() + " - " + link.getAttribute("href"));

                    i++;
                }
            }
        }
        System.out.println(i);

        driver.quit();
    }
}
