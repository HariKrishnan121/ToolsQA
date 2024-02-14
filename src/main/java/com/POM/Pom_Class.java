package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Pom_Class extends Base_Class{

	public Pom_Class() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userName")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//*[text()='Forms']")
	private WebElement form;
	public WebElement getForm() {
		return form;
	}
	
	@FindBy(xpath="//span[text()='Practice Form']")
	private WebElement practiceForm;
	public WebElement getPracticeForm() {
		return practiceForm;
	}
	
	@FindBy(id="firstName")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="lastName")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="userEmail")
	private WebElement userEmail;
	public WebElement getUserEmail() {
		return userEmail;
	}
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mobNumber;
	public WebElement getMobNumber() {
		return mobNumber;
	}
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dateOfBirth;
	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;
	public WebElement getYear() {
		return year;
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//div[@class='react-datepicker__week']//div[text()='23']")
	private WebElement date;
	public WebElement getDate() {
		return date;
	}
	
	@FindBy(xpath="//*[@id='subjectsContainer']/div/div[1]")
	private WebElement subject;
	public WebElement getSubject() {
		return subject;
	}
	
	@FindBy(xpath="//div[text()='Maths']")
	private WebElement maths;
	public WebElement getMaths() {
		return maths;
	}
	
	@FindBy(xpath="//div[text()='Computer Science']")
	private WebElement computerScience;
	public WebElement getComputerSc() {
		return computerScience;
	}
	
	@FindBy(xpath="//div[@id='hobbiesWrapper']//input[@id='hobbies-checkbox-1']")
	private WebElement hobby;
	public WebElement getHobby() {
		return hobby;
	}
	
	@FindBy(xpath="//div[@class='form-file']/input")
	private WebElement chooseFile;
	public WebElement getFile() {
		return chooseFile;
	}
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath="//div[text()='Select State']")
	private WebElement selectState;
	public WebElement getState() {
		return selectState;
	}
	
	@FindBy(xpath="//div[text()='NCR']")
	private WebElement stateName;
	public WebElement getStateName() {
		return stateName;
	}
	
	@FindBy(xpath="//div[text()='Select City']")
	private WebElement selectCity;
	public WebElement getSelectCity() {
		return selectCity;
	}
	
	@FindBy(xpath="//div[text()='Delhi']")
	private WebElement cityName;
	public WebElement getCityName() {
		return cityName;
	}
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitForm;
	public WebElement getSubmitForm() {
		return submitForm;
	}
	
	@FindBy(xpath="//button[@id='closeLargeModal']")
	private WebElement closeForm;
	public WebElement getCloseForm() {
		return closeForm;
	}
}

