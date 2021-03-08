package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("User is on Adactin login page.")
	public void user_is_on_Adactin_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Vineetha Official\\New Pkg\\Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	    	}

	@When("User enters the valid {string} and {string}.")
	public void user_enters_the_valid_and(String string, String string2) {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(string);

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(string2);

	   	}

	@Then("User should click on login button.")
	public void user_should_click_on_login_button() {
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	
	   }

}
