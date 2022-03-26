import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddDeposit {
    WebDriver driver;
    By home = By.xpath("//button[@class='btn home']");
    By custLogin = By.xpath("//button[@class='btn btn-primary btn-lg']");
    By custSelect = By.xpath("//select[@id='userSelect']");
    By login_Button = By.xpath("//button[@class='btn btn-default']");
    AddDeposit(WebDriver driver)
    {
        this.driver=driver;
    }
    void go_to_Home()
    {
        driver.findElement(home).click();

    }
    void go_to_customer_Login()
    {
        driver.findElement(custLogin).click();
    }
    void select_customer(String args)
    {
        WebElement e = driver.findElement(custSelect);
        Select s1 = new Select(e);
        s1.selectByVisibleText(args);
    }
    void click_on_login()
    {
        driver.findElement(login_Button).click();
    }
}
