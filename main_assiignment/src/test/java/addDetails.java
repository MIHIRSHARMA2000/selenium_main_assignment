import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addDetails {
    WebDriver driver;


          By firstName = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input");
          By lastName = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input");
          By code = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input");
          By add =By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");
    addDetails(WebDriver driver)
    {
        this.driver=driver;
    }
    void addFirstName(String arg)
    {
        driver.findElement(firstName).sendKeys(arg);
    }
    void addLastName(String arg)
    {
        driver.findElement(lastName).sendKeys(arg);
    }
    void addCode(String arg)
    {
        driver.findElement(code).sendKeys(arg);
    }
    void addButton()
    {
      driver.findElement(add).click();
    }



}
