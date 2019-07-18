package testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="E:\\adt\\Selenium\\drivers\\gecko driver\\geckodriver-v0.24.0-win64\\geckodriver.exe"; 
		System.setProperty("webdriver.gecko.driver",path );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.piraiinfo.com");
		
		
		String home_url = "http://www.piraiinfo.com/home";
		driver.navigate().to(home_url);
		
		
		String aboutus_url = "https://piraiinfo.com/about-us/";
		driver.navigate().to(aboutus_url);
		
		driver.navigate().back();
		
		String data_service_url = "https://piraiinfo.com/data-services/";
		driver.navigate().to(data_service_url);
		
		String cloud_service_url = "https://piraiinfo.com/cloud-services/";
		driver.navigate().to(cloud_service_url);
		
		String devop_service_url = "https://piraiinfo.com/devops-service/";
		driver.navigate().to(devop_service_url);
		
		String contact_url = "https://piraiinfo.com/contact-us/";
		driver.navigate().to(contact_url);
		driver.findElement(By.name("text-136")).sendKeys("Haritha");
		driver.findElement(By.name("email-485")).sendKeys("haritha9298@gmail.com");
		driver.findElement(By.name("tel-23")).sendKeys("9812368425");
		driver.findElement(By.name("textarea-112")).sendKeys("share the location to my mail");
		driver.findElement(By.className("wpcf7-form-control wpcf7-submit send-btn sub-but")).click();
		System.out.println("submitted");
		
	
	
		
		

	}

}
