package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFeatureStepDefinition {
    static WebDriver myDriver;

    @Given("^I am a Google chrome user$")
    public void i_am_a_Google_chrome_user() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\narma\\IdeaProjects\\MyFirstMavenProject\\src\\Chromedriver.exe");
        myDriver = new ChromeDriver();
    }

    @When("^I access Google website$")
    public void i_access_Google_website(){
        // Write code here that turns the phrase above into concrete actions
        myDriver.get("https://www.google.com/");
    }

    @Then("^I see Google Home page$")
    public void i_see_Google_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        myDriver.quit();
    }

}
