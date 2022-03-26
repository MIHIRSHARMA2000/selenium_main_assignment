import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class setUp {
    WebDriver driver;
    logintest objBrowserStackHomePage;
    signuppage objBrowserStackSignUpPage;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mihirsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void navigate_to_homepage_click_on_getstarted() {
        objBrowserStackHomePage = new logintest(driver);
        //objBrowserStackHomePage.veryHeader();
        objBrowserStackHomePage.clickOnGetStarted();
    }

    @Test(priority = 2)
    public void enter_userDetails() throws InterruptedException {
        objBrowserStackSignUpPage = new signuppage(driver);
        //objBrowserStackSignUpPage.veryHeader();
        objBrowserStackSignUpPage.addC();
        //Thread.sleep(5000);
        /*objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
        Thread.sleep(5000);
        objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");*/
    }
    @Test (priority = 3)
    public void add_Customer_Details() throws InterruptedException {
        addDetails addCT= new addDetails(driver);
        addCT.addFirstName("Mihir");
       // Thread.sleep(5000);
        addCT.addLastName("Sharma");
        //Thread.sleep(5000);
        addCT.addCode("201005");
        //Thread.sleep(5000);
        addCT.addButton();
        //Thread.sleep(3000);




    }
    @Test(priority = 4)
    void handleAlert()
    {
        driver.switchTo().alert().accept();


    }
    @Test(priority = 5)
    void openAccountNewCustomer() throws InterruptedException {
        openAccount op = new openAccount(driver);
        op.open();
        Thread.sleep(5000);
        op.selectName("Mihir Sharma");
        op.selectC("Dollar");
        Thread.sleep(3000);

        op.process();
        driver.switchTo().alert().accept();


    }
    @Test(priority = 6)
    void customer_Login_And_Add_Deposit() throws InterruptedException {
        AddDeposit ad  =new AddDeposit(driver);
        ad.go_to_Home();
        ad.go_to_customer_Login();
        //Thread.sleep(2000);
        ad.select_customer("Mihir Sharma");
        //Thread.sleep(3000);
        ad.click_on_login();
    }
    @Test(priority = 7)
    void add_Money_To_New_Account() throws InterruptedException {
        Deposit dd = new Deposit(driver);
        dd.click_on_deposit();
        Thread.sleep(2000);
        dd.enter_amount("1000");
        Thread.sleep(2000);
        dd.click_on_Deposit();

    }
    @AfterTest
    void closeBrowser()
    {
        driver.close();
    }
}


