package Login;
import java.io.IOException;

import Before.BF_Test;
import Pages.Login_Page;

public class Login extends BF_Test {
	public Login_Page login() throws IOException {
		Login_Page obj=new Login_Page(x);
		obj.loginApplication();
		return obj;
	}
	

}
