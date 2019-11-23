package MyPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

    private WebDriver driver;
    @Given("^user opens application$")
    public void user_opens_application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        //setProperty("webdriver.gecko.driver","/Users/usamahahmed_ahmed/downloads/geckodriver");
        driver = new ChromeDriver();

        driver.get("https://acme-qa.everreal.co/app/tenant/viewings/47500516-7852-4cb8-9f99-fd6e9ea78307");

//        WebElement elm3 = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/div/div/div/div[2]/div/div/form/button/span[1]/span"));
//        elm3.click();
//        Thread.sleep(30000);


        // throw new PendingException();
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        WebElement elm1 = driver.findElement(By.id("username"));
        elm1.sendKeys("theusamah@gmail.com");
        WebElement elm2 = driver.findElement(By.id("password"));
        elm2.sendKeys("Test@123");

    }

    @Then("^user logs in successfully$")
    public void user_logs_in_successfully() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        WebElement elm3 = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/div/div/div/div[2]/div/div/form/button/span[1]/span"));
        elm3.click();
        //Thread.sleep(10000);

//        WebElement elm5 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div/div[2]/div[4]/div"));
//        elm5.click();
    }

}