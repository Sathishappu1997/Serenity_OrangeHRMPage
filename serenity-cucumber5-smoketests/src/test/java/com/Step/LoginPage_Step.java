package com.Step;

import com.Pages.OrangeHRMLogin_Pages;

import net.thucydides.core.annotations.Step;

public class LoginPage_Step {

	OrangeHRMLogin_Pages OrangeLogin;

	@Step
	public void loginPageTitle() {
		
		OrangeLogin.open();
		OrangeLogin.loginTitle();
	}

	@Step
	public void enterUsername(String uname) {

		OrangeLogin.enterUname(uname);
	}

	@Step
	public void enterPasswordAndClickLogin(String pword) {

		OrangeLogin.enterPwordAndLogin(pword);
	}
	
	@Step
	public void titleOfTheLoginPAge() {

		OrangeLogin.gettitlepage();
	}

	@Step
	public void closeBrowser() {

		OrangeLogin.teardown();
	}

}
