package Cucum;

import cucumber.api.java.After;
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
    public void the_web_address() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://www.practiceselenium.com/welcome.html");

    }


    @When("^I navigate to the Menu page$")
    public void I_navigate_to_the_Menu_page() throws InterruptedException {
        // driver = new ChromeDriver();
        WebElement tea = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
        tea.click();
        Thread.sleep(2000);
    }

    @Then("^I can choose the item in a list of available teas products$")
    public void I_can_choose_the_item_in_a_list_of_available_teas_products() throws InterruptedException {
        // driver = new ChromeDriver();
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span"));
        menu.click();
        driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys("123@123.com");
        driver.findElement(By.xpath("/html//input[@id='name']")).sendKeys("Vitalij");
        driver.findElement(By.xpath("/html//textarea[@id='address']")).sendKeys("IG11");
        driver.findElement(By.xpath("/html//input[@id='card_number']")).sendKeys("0000000000000000");
        driver.findElement(By.xpath("/html//input[@id='cardholder_name']")).sendKeys("Vit Kac");
        driver.findElement(By.xpath("/html//input[@id='verification_code']")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//select[@id='card_type']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"card_type\"]/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
        Thread.sleep(2000);
        driver.quit();
    }


    @When("^I navigate to the Let's Talk Tea page$")
    public void I_navigate_to_the_Lets_Talk_Tea_page() throws InterruptedException {
        WebElement letsTalk = driver.findElement(By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(4) > a"));
        letsTalk.click();
        Thread.sleep(2000);
    }

    @Then("^I can write data in to all textfields$")
    public void I_can_write_data_in_to_all_textfields() throws InterruptedException {
        // driver = new ChromeDriver();
        WebElement name = driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[@class='wsb-element-form']/div//input[@name='name']"));
        name.sendKeys("Vitalij");
        Thread.sleep(2000);


        WebElement email = driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[@class='wsb-element-form']/div//input[@name='email']"));
        email.sendKeys("123@123.com");
        Thread.sleep(2000);

        WebElement subject = driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[@class='wsb-element-form']/div//input[@name='subject']"));
        subject.sendKeys("theme");
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[4]/textarea"));
        message.sendKeys("abc123][/");
        Thread.sleep(2000);


        driver.quit();
    }

    @When("^I click on Our Passion button$")
    public void click_on_Our_Passion_button() throws InterruptedException {
        WebElement ourPassion = driver.findElement(By.xpath("//div[@id='wsb-canvas-template-container']/div[@class='wsb-element-navigation']/div//a[@href='our-passion.html']"));
        ourPassion.click();
        Thread.sleep(2000);
    }

    @Then("^I can see the Our Passion webpage$")
    public void I_can_see_the_Our_Passion_webpage() throws InterruptedException {

        WebElement ourPassion = driver.findElement(By.linkText("We're passionate about tea."));
        ourPassion.getText();
        Thread.sleep(2000);
    }
}


