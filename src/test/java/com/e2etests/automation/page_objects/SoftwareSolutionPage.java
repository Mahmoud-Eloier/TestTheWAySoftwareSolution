package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class SoftwareSolutionPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//*[@role='button']")
	public static WebElement formations;
	@FindBy(how = How.TAG_NAME, using = "a")
	public static WebElement devloppement;
	@FindBy(how = How.TAG_NAME, using = "h2")
	public static WebElement python;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Fondamental')]")
	public static WebElement homeMessage;

	public SoftwareSolutionPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void ClickOnFormation() {
		formations.click();
	}
	
	public void ClickOnDevloppement() {
		devloppement.click();
	}
	
	public void ClickOnPython() {
		python.click();
	}
	
	

}
