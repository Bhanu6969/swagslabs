package Mvnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automation_practice {

	
    public WebDriver driver;
    @Test
    public void case1() {
    System.setProperty("webdriver.chrome.deriver","C:\\Prideautomation\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://ultimateqa.com/automation/");
    }
    @Test
    public void case2() {	
    driver.findElement(By.xpath("//a[@href=\"../complicated-page\"]")).click();
    }
    @Test
    public void case3() {
    driver.findElement(By.xpath("//a[@class=\"et_pb_button et_pb_button_1 et_pb_bg_layout_light\"]")).click();
    }
    @Test
    public void case4() {
    driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
    }
    @Test
    public void case5() {
    driver.findElement(By.xpath("//input[@id=\"et_pb_contact_email_0\"]")).click();
    }
    @Test
    public void case6() {
    driver.findElement(By.xpath("//textarea[@id=\"et_pb_contact_message_0\"]")).click();
    }
    @Test
    public void case7() {
    driver.findElement(By.xpath("//input[@id=\"user_login_665298b31adba\"]")).click();
    driver.close();
	}

}
