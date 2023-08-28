package sel.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class browser {
	
	public static void main( String[] args ) throws InterruptedException
	    {
	       // browser setup
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\kbhadragond\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions co=new ChromeOptions();
	        co.setBinary("C:\\Users\\kbhadragond\\Downloads\\chrome-win64\\chrome.exe");

	       //Chrome driver object

	       WebDriver driver=new ChromeDriver(co);
	       driver.navigate().to("https://google.co.in");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       
	       //Opening globalsqa
	       driver.get("https://www.globalsqa.com/");
	       driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("selenium",Keys.ENTER);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[2]/ol/li[2]/div/h3/a")).click();
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        jse.executeScript("window.scrollBy(0,-10000)");
	       Thread.sleep(3000);
	       //
	       driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a")).click();
	       driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1")).click();
	       
	       String name = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[2]/h1")).getText();
	       System.out.println(name);
	       
	       driver.close();
	       
	       
	      // driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[1]/a")).click();
	       //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3")).click();
	      // driver.findElement(By.xpath("//*[@id=\"banner-slide-carousel\"]/div[1]/div/div[4]/div/div/div[3]/div/div[5]/a")).click();
	     //  driver.findElement(By.name("q")).sendKeys("https://www.trekpanda.in/about-us",Keys.ENTER);
	    }

	}	


