package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeStandaloneTest {

	public static void main(String[] args) throws MalformedURLException {

		//RemoteWebdriver

		URL u = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(u, cap);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
