package PomPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BasePack.BaseClass;

public class TrainBooking extends BaseClass {

	public static By ClickTrain = By
			.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chTrains inactive b2b\"] ");

	public void ClickTrain() {
		driver.findElement(ClickTrain).click();
	}

	public static By clickFrom = By.xpath("//span[@data-cy=\"fromCityLabel\"]");

	public void From() throws AWTException {

		implicitWait();

		driver.findElement(clickFrom).click();

	}

	public static By EnterFrom = By.xpath("//input[@title=\"From\"]");

	public void EnterFrom() throws AWTException {

		WebElement From = driver.findElement(EnterFrom);
		From.sendKeys("Chennai");
	}

	public static By Loaction = By.xpath("//span[text()='Chennai - All Stations']");

	public void Location() {
		driver.findElement(Loaction).click();
	}

	public static By ToLoaction = By.xpath("//input[@title=\"To\"]");

	public void ToLoaction() {

		WebElement To = driver.findElement(ToLoaction);
		To.sendKeys("Chinnasalem");
	}

	public static By ClickOnStation = By.xpath("//span[text()='Chinna Salem Railway Station']");

	public void ClickOnStation() {
		driver.findElement(ClickOnStation).click();
	}

	public void date() {
		WebElement Date = driver.findElement(By.xpath("//div[@aria-label=\"Wed Sep 04 2024\"]"));
		Date.click();

	}

	public void Class() {
		WebElement Class = driver.findElement(By.xpath("//li[text()='First AC']"));
		Class.click();
	}

	public void ClickSearch() {

		WebElement ClickSearch = driver.findElement(By.xpath("//a[text()='Search']"));
		ClickSearch.click();

	}

}

