package com.Corporate;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class SignINCorporate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Browser browser=null;
		Page page=null;
		
		
		String firstName="maniii";
		String lastName="Doll";
		String email="maniiidoll098@gmail.com";
		String phoneNumber="2323232729";
		
		String otp="222222";
		
		String newPassword="Test@000";
		String confirmPassword="Test@000";
		
		
		String emailOrPhoneNo="2323232729";
		String password="Test@000";
		
		String orgName=null;
		
		
		try {
			
			browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			
			page=browser.newPage();
			
			page.navigate("https://k8-qa-job-web.nextenti.ai/login");
			
			
//			page.locator("#loginId").fill(emailOrPhoneNo);
//			
//			page.locator("#password").fill(password);
//			
//			page.getByText("Login").nth(1).click();
			
			
			
			
			
			
			
			page.getByText("Sign up").click();
			
			page.getByPlaceholder("Enter your First Name").fill(firstName);
			
			page.getByPlaceholder("Enter your Last Name/ Sur Name").fill(lastName);
			
			page.getByPlaceholder("Enter your Email Id").fill(email);
			
			page.getByPlaceholder("Enter your Mobile Number").fill(phoneNumber);
			
			page.locator(".default-primary-btn").click();
			

			
			PlaywrightAssertions.assertThat(page.getByText("Enter OTP"));

			PlaywrightAssertions.assertThat(page.locator("xpath=//button[normalize-space()='Verify']")).isDisabled();
			
			page.getByPlaceholder("Enter Otp").fill(otp);
			
			page.waitForTimeout(25000);
			
			page.locator(".default-primary-btn").click();
			

			
			PlaywrightAssertions.assertThat(page.getByText("Check all folders including Spam/Junk")).containsText("Check");
			
			page.getByText("Skip For Now").click();
			
			PlaywrightAssertions.assertThat(page.locator("xpath=//h2[normalize-space()='Create New Password']")).containsText("Create");
			
			page.locator("#newPassword").fill(newPassword);
			
			page.locator("#confirmPassword").fill(confirmPassword);
			
			page.locator(".PrivateSwitchBase-input").click();
			page.locator(".default-primary-btn.w-full.mt-4 ").click();
			
			page.locator(".mt-1.text-2xl").last().click();
			
			page.getByAltText("icon-Hospital").click();
			
			//Card---------------------------------------------------------
			
			
			page.locator("#organizationName").fill("SUN Pharma");
			
			page.locator("#hospitalName").fill("Pharma");
			page.waitForTimeout(1000);
			page.locator("#sameAsOrgName").click();
			page.waitForTimeout(1000);
			page.locator("#sameAsOrgName").click();
			
		      
		    page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Type of OwnershipChoose a type$"))).locator("svg").click();
		    page.locator("#react-select-2-input").fill("Private");
		    page.locator("#react-select-2-input").press("Enter");
			
			page.locator(".css-19bb58m").nth(1).click();
			page.locator("#react-select-3-input").fill("Multi");
		    page.locator("#react-select-3-input").press("Enter");
		    
		    page.getByPlaceholder("Enter Mobile Number").fill("2323232999");
		    
		    page.getByPlaceholder("Enter your website URL").click();
		    
		    page.locator("#googleMapLocation").click();
		    
		    page.locator("#street").fill("2-144A");
		    
		    page.locator("#area").fill("nar SBI");
		    
		    
		    page.getByPlaceholder("Enter pincode").fill("520008");
		    
		    page.locator(".css-19bb58m").nth(3).click();
		    page.locator("#react-select-4-input").fill("India");
		    page.locator("#react-select-4-input").press("Enter");
		    
		   
		    page.locator(".css-19bb58m").nth(2).click();
		    page.locator("#react-select-5-input").fill("Andhra Pradesh");
		    page.locator("#react-select-5-input").press("Enter");
		    
//		    String text = page.waitForSelector("#city").inputValue();
//		     page.locator("#city").fill(text);
		     
		    page.pause();
		    
		    
		    
		     page.locator(".default-primary-btn").click();
		     
		     page.locator(".MuiFormControl-root.MuiTextField-root").nth(0).click();
		     page.locator(".MuiFormControl-root.MuiTextField-root").nth(1).click();
		     page.locator(".MuiFormControl-root.MuiTextField-root").nth(2).click();
		     page.locator(".MuiFormControl-root.MuiTextField-root").nth(3).click();
		     
		     page.locator(".default-primary-btn").click();
		     PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ")).containsText("Available Departments is required");
		     
		     page.locator(".css-ltz9jb").click();
		     page.keyboard().type("M");
		     page.keyboard().down("ArrowDown");
		     page.keyboard().press("Enter");
		     
		     page.locator(".default-primary-btn").click();
			
			
			page.locator(".default-primary-btn").click();
			page.waitForTimeout(1000);
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(0)).containsText("Name is required");
			
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(1)).containsText("Email Id is required");
		
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(2)).containsText("Phone No is required");
			
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(3)).containsText("Designation is required");
			
			
			page.locator(".MuiInputBase-input.MuiOutlinedInput-input").nth(0).fill("Jagadees");
			page.locator(".MuiInputBase-input.MuiOutlinedInput-input").nth(1).fill("jagadees098765@gmail.com");
			page.locator(".MuiInputBase-input.MuiOutlinedInput-input").nth(2).fill("2323232425");
			page.locator(".MuiInputBase-input.MuiOutlinedInput-input").nth(3).fill("CEO");
			
			page.locator(".default-primary-btn").click();
		     
			page.waitForTimeout(1000);
			page.locator(".default-primary-btn").click();
			
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ")).containsText("Billing Address is required");
			page.waitForTimeout(1000);
			page.locator(".MuiFormControl-root.MuiTextField-root").nth(0).click();
			page.locator(".MuiFormControl-root.MuiTextField-root").nth(1).click();
			page.locator(".MuiFormControl-root.MuiTextField-root").nth(2).click();
			page.locator(".MuiFormControl-root.MuiTextField-root").nth(3).click();
			
			page.locator("#sameAsRegisteredAddress").click();
			page.locator(".default-primary-btn").click();
			
			//For checking------------------
//			page.locator("#sameAsRegisteredAddress").click();
//			page.locator(".MuiFormControl-root.MuiTextField-root").nth(3).clear();
//			page.locator(".default-primary-btn").click();
//			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ")).containsText("Billing Address is required");
//			page.locator(".MuiFormControl-root.MuiTextField-root").nth(3).fill("2-1234,amalapur,520008");
//			page.locator(".default-primary-btn").click();
			
			page.locator(".default-primary-btn").nth(1).click();
		     
			   page.waitForTimeout(2000);
				System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
		}
		
		finally {
			page.close();
			browser.close();
		}
		
		
		
	}

}
