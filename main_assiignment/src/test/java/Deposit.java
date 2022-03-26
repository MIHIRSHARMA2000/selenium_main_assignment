import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deposit {
    WebDriver driver;
    By Depo = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
    By addMoney = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");

    By clickDeposit= By.xpath("//button[@class='btn btn-default']");
    /*By Withdrawal = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");
    By Transaction = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]");*/
    Deposit(WebDriver driver)
    {
        this.driver=driver;
    }
    void click_on_Deposit()
    {
        driver.findElement(Depo).click();
    }
    void enter_amount(String amount)
    {
     driver.findElement(addMoney).sendKeys(amount);
    }
    void click_on_deposit()
    {
        driver.findElement(clickDeposit).click();
    }

}
