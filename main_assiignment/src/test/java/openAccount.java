import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class openAccount {
    WebDriver driver;
    By openAccountNew = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]");
   By nameCustomer = By.xpath("//select[@id='userSelect']");
    By selectCurrency = By.xpath("//select[@id='currency']");
    By proceed = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");
    /*WebElement sort = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
sort.click();
Thread.sleep(3000);
    WebElement HighToLow = driver.findElement(By.xpath("//*[@id='header_container']//select/option[4]"));
HighToLow.click();
Thread.sleep(3000);*/


    openAccount(WebDriver driver)
    {
        this.driver=driver;
    }
    void open()
    {
        driver.findElement(openAccountNew).click();
    }
    void selectName(String arg)
    {
       //WebElement e=driver.findElement(By.xpath("//select[@id='userSelect']"));
        WebElement e = driver.findElement(nameCustomer);
       Select select = new Select(e);
       select.selectByVisibleText(arg);





    }
    void selectC(String args)
    {
        WebElement curr= driver.findElement(selectCurrency);
        Select s1 = new Select(curr);
        s1.selectByVisibleText(args);
    }
    void process()
    {
        driver.findElement(proceed).click();
    }


}
