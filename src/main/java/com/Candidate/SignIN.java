package com.Candidate;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

public class SignIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Browser browser=null;
		Page page=null;
		
		String firstName="mani";
		String lastName="ch";
		String email="manich0987@gmail.com";
		String phoneNumber="2323233329";
		
		String otp="222222";
		
		String newPassword="Test@000";
		String confirmPassword="Test@000";
		
		String graduation="MBBS";
		
		
		
		String jobType="card";
		String dateOfBirth="07/06/1999";
		String gender="male";
		String pinCode="523346";
		String department="Sur";
		String startDate="07/2023";
		String skills="Nursing";
		String jobPinCode="520008";
		String orgName="Hospital";
		String state="Andhra Pradesh";
		String city="Prakasam";

		
		
		
		try {
			
			browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			
			page = browser.newPage();
			
			page.navigate("https://k8-qa-job-web.nextenti.ai/login") ;
			
			String title = page.title();
			
			System.out.println(title);
			
			PlaywrightAssertions.assertThat(page).hasTitle("NextEnti");
			
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
			
			page.locator("[class='PrivateSwitchBase-input css-1m9pwf3']").click();
			

			
			page.locator("[class='default-primary-btn w-full mt-4 disabled:text-white']").click();
			
			
			PlaywrightAssertions.assertThat(page.locator("xpath=//legend[@class='text-center text-darkblue font-medium text-xl px-2']")).containsText("Nextenti");
			
			page.locator("xpath=//h2[normalize-space()='Personal']").click();
			
			page.getByAltText("icon-Doctor").click();
			
			PlaywrightAssertions.assertThat(page.locator("xpath=//p[@class='text-xl font-medium text-center text-darkblue mb-4']")).containsText("Education");
			
			page.getByPlaceholder("Enter your Graduation").fill(graduation);
			
			page.locator(".default-primary-btn").click();
			
			page.locator(".PrivateSwitchBase-input").nth(1).click();
			
			page.locator("xpath=//*[@id=\"root\"]/div[2]/div[2]/div/form/section/section/button[2]").click();
			
			page.locator("xpath=//*[@id=\"root\"]/div[3]/div/div/form/div[1]/div/div/div[1]/div[2]").click();
			
			page.keyboard().type("cardio");
			
			page.keyboard().down("ArrowDown");
			
//			page.keyboard().down("ArrowDown");
			
//			page.keyboard().down("ArrowDown");
			
			page.keyboard().press("Enter");
			
			page.locator("#btn-yes-1").click();
			
			
			page.getByText("Agree and Continue").click();
			
			
			
			
			// for Search jobs --------------------------------------
			
//			page.locator("#btn-yes-1").click();						
//			
//			Locator navLinks = page.locator("xpath=//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/ul/li");
//		      
//		    PlaywrightAssertions.assertThat(navLinks.nth(0)).containsText("Home");
			
			
		      
		    //for Complete Profile------------------------------------
			
			page.locator("#btn-no-1").click();						
			
	        PlaywrightAssertions.assertThat(page.locator("[class='px-10 text-darkblue']")).containsText("Personal Details");
	        
	        page.locator("#dob").click();
	        
	     
	      
	        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("DD/MM/YYYY")).fill(dateOfBirth);
	        
	        page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Choose your gender$"))).nth(1).click();
	        page.locator("#react-select-3-input").fill(gender);
	        page.locator("#react-select-3-input").press("Enter");
			 
			
////			  			// For female
///			page.keyboard().down("ArrowDown");
//			page.keyboard().press("Enter");
		      
			page.getByPlaceholder("Enter pincode").fill(pinCode);
			
		    
		      
			page.waitForTimeout(2000);
			page.locator(".default-primary-btn").click();
			
			page.waitForTimeout(2000);
			
//			page.locator("[id='react-select-21-placeholder']").fill("M");
//			page.waitForTimeout(1000);
			
			page.locator("#react-select-8-input").press("Enter");
			 page.locator("#react-select-8-input").fill(department);
		      page.locator("#react-select-8-input").press("ArrowDown");
		      page.locator("#react-select-8-input").press("Enter");
////			page.keyboard().down("ArrowDown");
////			page.keyboard().press("Enter");
//		      
//		      page.locator("[id='react-select-18-input']").press("Enter");
//		      page.locator("[id='react-select-18-input']").fill("M");
//		      page.locator("[id='react-select-18-input']").press("ArrowDown");
//		      page.locator("[id='react-select-18-input']").press("Enter");
//			
			
			page.locator("[name='experience.0.startDate']").fill(startDate);
	
			page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Your Skills")).click();
		    page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Your Skills")).fill(skills);
		    page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select Your Skills")).press("Enter");
			
		    page.locator("[name='experience.0.pincode']").fill(jobPinCode);
		    
		    page.locator(".default-primary-btn").click();
		    
		    page.locator(".default-primary-btn").click();
		    
		    page.locator(".default-primary-btn").click();
		    
		    page.locator("[id='btn-no-1']").click();
		    
		    page.locator(".default-primary-btn").click();
		    
		    page.locator("#btn-no-1").click();
		    
		    page.locator("[class='pl-2 mb-1']").nth(2).click();
			
			page.getByText("Recommended").click();
			
			page.locator("[class='inline-flex items-center gap-3 font-semibold justify-center text-darkblue cursor-pointer']").click();
			
			page.getByPlaceholder("Organization Type").fill(orgName);
			page.keyboard().press("Enter");
			
			page.getByPlaceholder("State").fill(state);
			page.keyboard().press("Enter");
			
			page.getByPlaceholder("Add your city ").fill(city);
			page.keyboard().press("Enter");
			
			page.locator("[class='primary-btn ']").click();
		    
		    page.waitForTimeout(2000);
		      
		    
		    
		      
		      
//		      for log out:    ----------------------------------------
			
		      page.locator(".w-6").click();
		      
		      page.locator("xpath=//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div[2]/ul/li[2]/span").click();
		      
		      page.locator("#btn-yes-1").click();  
		      
			
			page.waitForTimeout(2000);
			
}
		
		
		
		finally {
			page.close();
			browser.close();
		
		}

	}

}
