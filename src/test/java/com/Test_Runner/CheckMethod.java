package com.Test_Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Base.Base_Class;

public class CheckMethod  {
	static Robot rt;

	@Test
	public void method() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		rt= new Robot();
		for(int i=0;i<=4;i++) {
			rt.keyPress(KeyEvent.VK_CONTROL);
			rt.keyPress(KeyEvent.VK_SUBTRACT);
			rt.keyRelease(KeyEvent.VK_CONTROL);
			rt.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		WebElement chooseFile =
				 driver.findElement(By.xpath("//div[@class='form-file']/input"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click()", chooseFile);
				 
				
				
				
				 rt.delay(3000);
				 StringSelection sc = new
				 StringSelection("C:\\HARIRESUME\\HariQAImmediateJoinerExp-3.7yr.pdf");
				 java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,
				 null);
				 rt.keyPress(KeyEvent.VK_CONTROL);
				 rt.keyPress(KeyEvent.VK_V);
				 rt.keyRelease(KeyEvent.VK_CONTROL);
				 rt.keyRelease(KeyEvent.VK_V);
				 rt.keyPress(KeyEvent.VK_ENTER);
				 rt.keyRelease(KeyEvent.VK_ENTER);
				 
				 
				 
				 
		
}
}