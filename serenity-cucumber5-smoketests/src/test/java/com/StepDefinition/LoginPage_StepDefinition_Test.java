package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Step.LoginPage_Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class LoginPage_StepDefinition_Test {

	@Steps
	LoginPage_Step Login;


	@Given("Get the login page title")
	public void get_the_login_page_title() {
		Login.loginPageTitle();
	}

	@Then("Enter username {string}")
	public void enter_username(String username) {
		Login.enterUsername(username);
	}

	@Then("Enter password {string} and click login button")
	public void enter_password_and_click_login_button(String password) {
		Login.enterPasswordAndClickLogin(password);
	}

	@Then("Get the title of the login page")
	public void get_the_title_of_the_login_page() {
		Login.titleOfTheLoginPAge();
	}

	@Then("close the browser")
	public void close_the_browser() {
		Login.closeBrowser();
	}

}
