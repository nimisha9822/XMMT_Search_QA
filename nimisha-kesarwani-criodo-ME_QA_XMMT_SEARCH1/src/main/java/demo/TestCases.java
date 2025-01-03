package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        
        WebDriverManager.chromedriver().browserVersion(" 126.0.6478.57").setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
       String currenturl=driver.getCurrentUrl();
       Thread.sleep(3000);
       if(currenturl.contains("makemytrip")){
        System.out.println("Test passed url contains makemytrip");
       }else {
        System.out.println("Test failed ");
       }
        System.out.println("end Test case: testCase01");
    }

     
    public void testCase02() throws InterruptedException {
        System.out.println("Start Test case: testCase02");
    
        // Navigate to Make My Trip website
        driver.get("https://www.makemytrip.com");
    
        // Wait for 5 seconds
        Thread.sleep(5000);
    
        // Select departure location
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("blr");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
        Thread.sleep(3000);
    
        // Select arrival location
        driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("del");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]")).click();
        Thread.sleep(2000);
    
        // date selected here
        ////*[@id="top-banner"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[5]/div
        driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[2]/div")).click();
        Thread.sleep(2000);
    
        
        driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
        Thread.sleep(5000);
    
        // Get flight price
        WebElement flightPriceElement = driver.findElement(By.xpath("(//div[contains(@class,'blackText fontSize18')])[1]"));
        String flightPrice = flightPriceElement.getText();
        System.out.println("Test Case 2 Passed: The flight price is " + flightPrice);
    
        System.out.println("End Test case: testCase02");
    }
    
    public void testCase03() throws InterruptedException {
        System.out.println("Start Test case: testCase03");
    
        // Navigate to Make My Trip website
        driver.get("https://www.makemytrip.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[5]"));
        Thread.sleep(3000);
    
    
        // Select departure location
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("ypr");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div")).click();
        ////*[@id="react-autowhatever-1-section-0-item-0"]//*[@id="react-autowhatever-1-section-0-item-0"]
        Thread.sleep(3000);
    
        // Select arrival location
        driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("ndls");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
        Thread.sleep(2000);
    
        // date selected here
        driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[5]/div")).click();
        Thread.sleep(2000);
    
        
        driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
        Thread.sleep(5000);

        
        System.out.println("end Test case: testCase03");
    
    }

}