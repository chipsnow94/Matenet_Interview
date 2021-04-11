package Automation.Matanet.Pages.Login;

public class LoginPage {

	private LoginPageController act;

	private LoginPage(LoginPageController act) {
		this.act = act;
	}

	public LoginPageController act() {
		return act;
	}

	public static LoginPage getLoginPage() {
		return new LoginPage(new LoginPageController());
	}
}
