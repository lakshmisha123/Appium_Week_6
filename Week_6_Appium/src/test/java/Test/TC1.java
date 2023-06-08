package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Login.Login;

public class TC1 extends Login {
	@Test(enabled=true, priority=0) 
	public void Adding_New_User_In_Addmin_Section() throws IOException {
		login();
	}
}
