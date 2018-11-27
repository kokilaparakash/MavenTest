

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void test()throws Exception {
		String url="http://www.magento.com";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Main m=new Main(driver);
		m.clickMyac();
		Thread.sleep(2000);
		
		Login l=new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		l.typePassword("Welcome123");
		l.clickLogin();
		Thread.sleep(2000);
		
		Logout o=new Logout(driver);
		o.clickLogout();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
