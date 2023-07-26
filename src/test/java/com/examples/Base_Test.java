package com.examples;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test {
	
	public static RemoteWebDriver driver = null;
	public static final String USERNAME = "oauth-karthikkristipati123-9744f";
	public static final String ACCESS_KEY="e0eb2dd3-56ef-410f-be76-6d3afbb66154";
	public static final String URL = "https://" + USERNAME + " : " + ACCESS_KEY + " : "+ "ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	
	@Parameters({"browser","platform","version"})
	@BeforeMethod
	public static void  openBrowser(String browser, String platform, String version) throws MalformedURLException
		{
				FirefoxOptions firefoxoptions = new FirefoxOptions();
				firefoxoptions.setPlatformName(platform);
				firefoxoptions.setBrowserVersion(version);
				URL url = new URL(URL);
				
		}
	
}
