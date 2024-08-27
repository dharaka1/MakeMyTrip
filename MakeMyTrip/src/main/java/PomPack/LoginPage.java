package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class LoginPage extends BaseClass {

	public static By Login = By.xpath("//li[text()='MyBiz Account']  ");
	

	public void Login() {

		driver.findElement(Login).click();
	}
	
	public static By Email=By.xpath("//input[@placeholder=\"Enter your work email id\"]");

	public void Email() {
		

		driver.findElement(Email).sendKeys("dharaka389@gmail.com");
	}
	
	public static By Clickcontinue=By.xpath("//span[text()='CONTINUE']");


	public void Clickcontinue() {
		implicitWait();
		
		driver.findElement(Clickcontinue).click();
	}
	
	public static By Password=By.xpath("//input[@placeholder=\"Enter a password\"]");


	public void Password() {
		implicitWait();
 
		driver.findElement(Password).sendKeys("GayaSun123@");
	}
	public static By ClickLogin=By.xpath("//button[text()='LOGIN']");


	public void ClickLogin() {
		
		implicitWait();
 
		driver.findElement(ClickLogin).click();
	}
}
