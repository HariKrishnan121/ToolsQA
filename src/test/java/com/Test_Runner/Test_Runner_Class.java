package com.Test_Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Base_Class;
import com.POM.Pom_Class;

import utils.DataUtils;

public class Test_Runner_Class extends Base_Class {

	public static Pom_Class pom;

	@Parameters({ "browser" })
	@BeforeClass // this is for openning webbrowser
	public void browser(String browser) {
		browserLaunch(browser);
		launchUrl("https://demoqa.com/login");
	}

	@Parameters({ "userName", "password" })
	@BeforeMethod // this is for login
	public void login(String userName, String pass) {
		minimize_Screen();
		pom = new Pom_Class();
        inputValues(pom.getUserName(), userName);
		inputValues(pom.getPassword(), pass);
        clickOnWebelement(pom.getLogin());
        }
	

	@Test(dataProvider = "details", dataProviderClass = DataUtils.class)
    public void form(String data[]) throws AWTException {
		pom = new Pom_Class();
		clickOnWebelement(pom.getForm());
		clickOnWebelement(pom.getPracticeForm());
		rbt = new Robot();
        inputValues(pom.getFirstName(), data[0]);
		inputValues(pom.getLastName(), data[1]);
		inputValues(pom.getUserEmail(), data[2]);
		minimize_Screen();
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pom.getGender());
        inputValues(pom.getMobNumber(), data[3]);
		clickOnWebelement(pom.getDateOfBirth());
		Select yr = new Select(pom.getYear());
		yr.selectByVisibleText("1998");
		Select mnth = new Select(pom.getMonth());
		mnth.selectByVisibleText("May");
		clickOnWebelement(pom.getDate());
        clickOnWebelement(pom.getSubject());
		try {
			WebElement actv_Ele = driver.switchTo().activeElement();
			actv_Ele.sendKeys("maths");
			clickOnWebelement(pom.getMaths());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			WebElement actvEle = driver.switchTo().activeElement();
			actvEle.sendKeys("computer");
            clickOnWebelement(pom.getComputerSc());
		} catch (Exception e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click()", pom.getHobby());
		js.executeScript("arguments[0].click()", pom.getFile());
		rbt.delay(3000);
		StringSelection sc = new StringSelection("C:\\HARIRESUME\\HariQAImmediateJoinerExp-3.7yr.pdf");
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
        inputValues(pom.getAddress(), data[5]);
        clickOnWebelement(pom.getState());
		clickOnWebelement(pom.getStateName());
		clickOnWebelement(pom.getSelectCity());
		clickOnWebelement(pom.getCityName());
		clickOnWebelement(pom.getSubmitForm());
        fullScreenShot("screenshot.png");
		clickOnWebelement(pom.getCloseForm());
		exit();
       }

	public static void minimize_Screen() {
		try {
			rbt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 4; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_SUBTRACT);
		}
	}
}
