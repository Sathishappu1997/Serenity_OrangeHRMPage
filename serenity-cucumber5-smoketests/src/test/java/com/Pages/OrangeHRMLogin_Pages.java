package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMLogin_Pages extends PageObject {

	public void loginTitle() {
		
		System.out.println("Login Page title is :"+ getDriver().getTitle());
	}
	
	public void enterUname(String elementuname) {
		
		$(By.id("txtUsername")).type(elementuname);
	}
	
	public void enterPwordAndLogin(String elementpword) {

		$(By.id("txtPassword")).typeAndEnter(elementpword);
	}
	
	public void gettitlepage() {
		
		System.out.println("Url Link for Dashboard Page is "+getDriver().getCurrentUrl());
	}
	
	public void teardown() {
		
		getDriver().close();
	}

}
