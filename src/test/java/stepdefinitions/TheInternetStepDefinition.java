package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class TheInternetStepDefinition
	 {
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I scroll and click Form Auth link in the internet$")			
            public void whenIScrollClickFormAuthLinkInTheInternet()
            {
                workFlow.scrollAndClick(0, "The Internet", "The Internet.FormAuthlinkButtonXPATH", "XPATH");
                
            }
            @When("^I copied text Elemental Selenium_link in the internet$")			
            public void whenICopiedTextElementalSeleniumlinkInTheInternet()
            {
                workFlow.copiedtext(0, "The Internet", "The Internet.ElementalSelenium_linkLinkXPATH", "XPATH");
                
            }
            @When("^I clicked browser back button back in the internet$")			
            public void whenIClickedBrowserBackButtonBackInTheInternet()
            {
                workFlow.clickedBrowserBackButton(0, "The Internet", "The Internet.backButtonXPATH", "XPATH");
                
            }
             @Then("^verify copied text not present by index ver_control in the internet as '(.*)'$")			
            public void thenVerifyCopiedTextNotPresentByIndexVercontrolInTheInternetAsvercontrol1(String  varvercontrol1)
            {
                Assertion.isTrue(workFlow.verifyCopiedTextNotPresentByIndex(varvercontrol1, 0, "The Internet", "The Internet.ver_controlTextBoxXPATH", "XPATH"), "Then verify copied text not present by index ver_control in the internet as '<ver_control1>'");
      WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I entered Username_tb in the internet as '(.*)'$")			
            public void whenIEnteredUsernametbInTheInternetAsusernametb2(String  varusernametb2)
            {
                workFlow.enterText(varusernametb2, 0, "The Internet", "The Internet.Username_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I copied text Username_tb in the internet$")			
            public void whenICopiedTextUsernametbInTheInternet()
            {
                workFlow.copiedtext(0, "The Internet", "The Internet.Username_tbTextBoxXPATH", "XPATH");
                
            }
            @When("^I copied text Login Page_label in the internet$")			
            public void whenICopiedTextLoginPagelabelInTheInternet()
            {
                workFlow.copiedtext(0, "The Internet", "The Internet.LoginPage_labelLabelXPATH", "XPATH");
                
            }
            @When("^I copied text Login_ddl in the internet$")			
            public void whenICopiedTextLoginddlInTheInternet()
            {
                workFlow.copiedtext(0, "The Internet", "The Internet.Login_ddlDropDownListXPATH", "XPATH");
                
            }
             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void thenpageIsDisplayedWithcontent(String  varpage, String varcontent)
            {
                Assertion.isTrue(workFlow.verifyDefaultpageIsdisplayed(varpage), "Then '<page>' is displayed with '<content>'");
                Assertion.isTrue(workFlow.verifymessageIsDisplayed(varcontent), "");
                
            }
    }