package StepPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import BasePack.BaseClass;
import PomPack.LoginPage;
import PomPack.TrainBooking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {
	LoginPage lp = new LoginPage();
	TrainBooking tn = new TrainBooking();

	@Given("User launch the {string} Browser")
	public void user_launch_the_browser(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {
			System.out.println("No browsers were found");
		}

		driver.manage().window().maximize();
		implicitWait();

	}

	@When("User Launch Url")
	public void user_launch_url() {

		geturl("https://www.makemytrip.com/");
	}

	@When("Click MyBizAcc")
	public void click_my_biz_acc() {
		lp.Login();
	}

	@When("Userone {string}")
	public void userone(String string) {

		lp.Email();

	}

	@When("Click Continue")
	public void click_continue() {

		lp.Clickcontinue();
	}

	@When("Usertwo Enter {string}")
	public void usertwo_enter(String string) {

		lp.Password();
	}

	@When("UserThree Click Login")
	public void user_three_click_login() {

		lp.ClickLogin();
	}

	@When("Click on Train Booking")
	public void click_on_train_booking() {

		tn.ClickTrain();
	}

	@When("Click From")
	public void click_from() throws AWTException {
		tn.From();
	}

	@When("User Enterfour {string}")
	public void user_enterfour(String From) throws AWTException {

		tn.EnterFrom();

		tn.Location();

	}

	@When("EnterFive To {string}")
	public void enter_five_to(String To) {

		tn.ToLoaction();
		tn.ClickOnStation();
	}

	@When("Selectone Travel Date")
	public void selectone_travel_date() {

		tn.date();

	}

	@When("Selecttwo class")
	public void selecttwo_class() {

		tn.Class();
	}

	@When("Selectthree Your Station")
	public void selectthree_your_station() {

		tn.ClickSearch();
	}
}
