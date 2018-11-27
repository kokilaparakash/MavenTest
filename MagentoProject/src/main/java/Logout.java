

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;

	public Logout(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By logout=By.linkText("Log Out");
	
	public void clickLogout()
	{
		driver.findElement(logout).click();
	}
	

}
