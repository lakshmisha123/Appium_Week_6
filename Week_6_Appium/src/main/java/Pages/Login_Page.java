package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Common_Methods.Wait_For_Element;

public class Login_Page extends Wait_For_Element{
	
	
	WebDriver x;
	public Login_Page(WebDriver wd) {
		super(wd);
		//initialization
		this.x=wd;
		PageFactory.initElements(x, this);
	}
	//Login Locator
	By langugeSelection = By.xpath("(//*[@text='English'])");
	By Lan_Coun= By.xpath("(//*[@text='CONTINUE'])");
	By Phon_Num_En= By.xpath("(//*[@text='090606 12973'])");
	By Phon_Num_Coun= By.xpath("(//*[@text='Continue'])");
	
	
	By Mail_Enter= By.xpath("(//*[@text='lakshmishahr@gmail.com'])");
	By Mail_coun= By.xpath("(//*[@text='Continue'])");
	By Cancel_All = By.xpath("(//*[@text='CANCEL'])");
	By Account = By.xpath("(//*[@text='Account'])");
	By Logout = By.xpath("//*[@type='submit']");
	
	
	public void loginApplication() {
		wait_For_Element_ToAppear_And_Click(langugeSelection);
		wait_For_Element_ToAppear_And_Click(Lan_Coun);
		wait_For_Element_ToAppear_And_Click(Phon_Num_En);
		wait_For_Element_ToAppear_And_Click(Phon_Num_Coun);
		wait_For_Element_ToAppear_And_Click(Mail_Enter);
		wait_For_Element_ToAppear_And_Click(Mail_coun);
		wait_For_Element_ToAppear_And_Click(Cancel_All);
		wait_For_Element_ToAppear_And_Click(Account);
	}


}
