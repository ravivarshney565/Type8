import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j_Demo {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("devpinoyLogger");
		
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		
		log.debug("Script execution started");
		
		ChromeDriver cd = new ChromeDriver();
		
		log.info("Chrome browser opened");
		
		cd.manage().window().maximize();
		
		log.warn("Browser window got maximizied");
		
		cd.get("https://omayo.blogspot.com");
		
		log.error("Omayo URL launched");
		
		cd.findElement(By.linkText("compendiumdev")).click();
		
		log.fatal("Clicked on the link text");
		
		cd.navigate().back();
		
		log.debug("clicked on the back button");
		
		cd.navigate().forward();
		
		log.debug("clicked on the forward button");
		
		cd.navigate().refresh();
		
		log.debug("refreshes the browser");
		
		cd.close();
		
		log.debug("closed the browser");

	}

}
