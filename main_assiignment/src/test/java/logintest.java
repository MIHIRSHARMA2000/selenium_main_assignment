import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class logintest {

        WebDriver driver;
        By BMLogin=By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button");
        By getStarted= By.xpath("//*[@id='signupModalButton']");

        public logintest(WebDriver driver) {
            this.driver=driver;
        }

        /*public void veryHeader() {
            String getheadertext=driver.findElement(Header).getText();
            assertEquals("App & Browser Testing Made Easy", getheadertext);
        }*/
        public void clickOnGetStarted() {
            driver.findElement(BMLogin).click();
        }

}
