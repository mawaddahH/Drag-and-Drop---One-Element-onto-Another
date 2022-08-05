/**
 * @author Mawaddah Hanbali
 */
package ass2W9D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWhebDriverAss2W9D5 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */
	@BeforeTest
	public void setUp() throws InterruptedException {
		// The path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		// Open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fullcalendar.io/docs/v3/external-dragging-demo");
		Thread.sleep(2000); // To load the page
		System.out.println("Website Title: " + driver.getTitle());
	}

	/**
	 * Test Drag and Drop
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		Actions a = new Actions(driver);

		// source & target elements
		WebElement source = driver.findElement(By.xpath("//div[@id='external-events']//div[5]"));
		WebElement target = driver.findElement(By.xpath(
				"//body[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]"));
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(1000); // to see the result

		// click on "remove after drop" checkbox
		WebElement checkbix = driver.findElement(By.cssSelector("#drop-remove"));
		checkbix.click();
		Thread.sleep(1000); // to see the result

		// source & target elements
		WebElement source1 = driver.findElement(By.xpath("//div[@id='external-events']//div[1]"));
		WebElement target1 = driver.findElement(By.xpath(
				"//body[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]"));
		a.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(1000); // to see the result

		// source & target elements
		WebElement source2 = driver.findElement(By.xpath("//div[@id='external-events']//div[4]"));
		WebElement target2 = driver.findElement(By.xpath(
				"//body[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
		a.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(5000); // to see the result
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
