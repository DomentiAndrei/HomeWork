package Luma.LumaAuto;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Boss {

	protected static WebDriver driver;
	protected static Logger log = Logger.getLogger(Boss.class);

	@BeforeTest(description = "Browser Opened")
	public void stepsBefore() throws MalformedURLException {
		//PropertyConfigurator.configure("..\\Lume\\Log4j.properties"); 

		Reporter.log("==Testing is starting==", true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// driver = new RemoteWebDriver(new URL(remote_url_chrome), options); // in case
		// if need to run on local machine change to
		driver = new ChromeDriver();

		log.info("Chrome has been opened");

		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		log.info("website opened");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest(description = "Browser Closed")
	public void stepsAfter() throws IOException {
		screens();
		driver.close();
	}

	public void screens() throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "..\\Luma\\Screens\\";
		FileUtils.copyFile(src, new File(path + "" + driver.getClass().getSimpleName() + ""
				+ this.getClass().getSimpleName() + "" + time() + ".png"));

	}

	public String time() {
		return new SimpleDateFormat("dd-MM-yyyy HH-dd-ss").format(new Date());
	}

	public void createLogFileForEachTest() throws IOException {

		File src = null;
		String path = "";
		FileUtils.copyFile(src, new File(path + "" + driver.getClass().getSimpleName() + ""
				+ this.getClass().getSimpleName() + "" + time() + ".log"));

	}
}
