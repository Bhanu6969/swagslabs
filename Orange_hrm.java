package Mvnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_hrm {
public WebDriver driver;
@Test
public void case1() {
	System.setProperty("webdriver.chrome.deriver","C:\\Prideautomation\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
}
@Test
public void case2() {
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
@Test
public void case3() {
driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"]")).click();
}
@Test
public void case4() {
driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).click();
}
@Test
public void case5() {
	driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).click();
}
}
