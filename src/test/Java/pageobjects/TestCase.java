package pageobjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by dell on 9/28/2017.
 */
public class TestCase {

    public WebDriver driver = null;
    TestPageObject po = new TestPageObject();


    @Given("^I am open Calculator app or clear date$")
    public void i_am_open_Calculator_app_or_clear_date() throws Throwable {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.VERSION, "6.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4622/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.get("Calculator");

        TestPageObject testcase = new TestPageObject();

        //   System.out.println(driver.findElement(By.xpath(testcase.resultBox)));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @When("^I click on Addition$")
    public void i_click_on_Addition() throws Throwable {
        po.clickOnAddButton(driver);

    }

    @Then("^(.*) should be displayed$")
    public void should_be_displayed(String arg1) throws Throwable {
        po.clickOnEqualButton(driver);
        Assert.assertTrue(po.getResult(driver).equals(arg1));

    }

    @When("^I click on multiply$")
    public void i_click_on_multiply() throws Throwable {
        po.clickOnMultiplyButton(driver);
    }


    @When("^I click on devide$")
    public void i_click_on_devide() throws Throwable {
        po.clickOnDevideButton(driver);
    }


    @When("^I enter (.*)$")
    public void i_enter(String arg1) throws Throwable {
        po.clickOnElement("" + arg1, driver);
    }

    @When("^I click on subtract")
    public void i_click_on_delete() throws Throwable {
        po.clickOnDeleteButton(driver);

    }

    @Then("^Close the calculator$")
    public void close_the_calculator() throws Throwable {
        driver.close();
    }


}
