package com.pom;

import org.openqa.selenium.WebElement;

public class PomSample1 extends BaseClass {
	public static void main(String[] args) {

		

		BaseClass bs = new BaseClass();

		bs.browserLaunch();
		bs.getBrowser("https://www.facebook.com/");
		
		PomSample pm = new PomSample();
		
		WebElement findxpath = pm.getFindxpath();
		findxpath.sendKeys("mersal");

//		WebElement find = pm.getFind();
//		find.sendKeys("nbvftyuj");
	}

}
