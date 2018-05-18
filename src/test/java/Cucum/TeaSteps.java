package Cucum;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeaSteps {

    private static WebDriver driver;


       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAC\\Desktop\\chromedriver.exe");
      //  driver = new ChromeDriver();
       // driver.get("http://www.practiceselenium.com/welcome.html");

         @Given("^the web address$")
         public void the_web_address(){
            driver = new ChromeDriver();
            driver.get("http://www.practiceselenium.com/welcome.html");
        }


        @When("^I navigate to the Menu page$")
        public void I_navigate_to_the_Menu_page () {
           // driver = new ChromeDriver();
            WebElement tea = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
            tea.click();
        }
        @Then("^I can browse a list of available herbal teas products$")
        public void I_can_browse_a_list_of_available_herbal_teas_Menu_page() {
           // driver = new ChromeDriver();
            WebElement menu = driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[1]//a[@href='menu.html']/img[@alt='']"));
            menu.click();
        }
    }

