package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSample extends BaseClass {

	public PomSample() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email address or phone number']")
	private WebElement findxpath;

	@FindBy(name = "pass")
	private WebElement find;

	public WebElement getFindxpath() {
		return findxpath;
	}

	public WebElement getFind() {
		return find;
	}

	// driver.findElement(By.id("hvdfhg"));
}
