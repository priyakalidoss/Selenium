package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("demosalesmanager");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("crmsfa");
	WebElement login = driver.findElement(By.className("decorativeSubmit"));
	login.click();
	WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
	crm.click();
	WebElement lead= driver.findElement(By.linkText("Leads"));
	lead.click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PK");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalidoss");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya24");
	driver.findElement(By.name("departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead creation testing");
	driver.findElement(By.name("primaryEmail")).sendKeys("priyakalidoss24@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	if(title.contains("View Lead")) {
		
		System.out.println("Lead verified");
		
	}
	else {
		System.out.println("not verified");
	}
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Priya2412");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PriyaKali");
	driver.findElement(By.name("submitButton")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	
}	

}	