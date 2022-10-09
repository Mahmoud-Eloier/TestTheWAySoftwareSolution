package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.SoftwareSolutionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareSolutionStepDefinition {
	
	private SoftwareSolutionPage softwareSolutionPage;

	public SoftwareSolutionStepDefinition() {
		this.softwareSolutionPage = new SoftwareSolutionPage();
	}
		
		
	@Given("Je me connecte sur le site TheWay")
	public void jeMeConnecteSurLeSiteTheWay() {
		softwareSolutionPage.goToUrl();
	    
	}
	@When("Je clique sur formations")
	public void jeCliqueSurFormations() {
		softwareSolutionPage.ClickOnFormation();
	    
	}
	@When("Je clique sur developpement")
	public void jeCliqueSurDeveloppement() {
		softwareSolutionPage.ClickOnDevloppement();
	    
	}
	@When("Je clique sur python")
	public void jeCliqueSurPython() {
		softwareSolutionPage.ClickOnPython();
	   
	}
	@Then("Je verifie l existance de niveau fondamentale {string}")
	public void jeVerifieLExistanceDeNiveauFondamentale(String text) {
			String message = SoftwareSolutionPage.homeMessage.getText();
			Assert.assertTrue(message.contains(text));
	    
	}




}
