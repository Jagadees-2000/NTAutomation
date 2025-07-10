package com.Corporate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		Browser browser=null;
		Page page=null;
		String emailOrPhoneNo="2323232727";
		String password="Test@000";
		
		
		
		try {
			
	browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			
			page=browser.newPage();
			
			page.navigate("https://k8-qa-job-web.nextenti.ai/login");
			
			page.locator("#loginId").fill(emailOrPhoneNo);
			
			page.locator("#password").fill(password);
			
			page.getByText("Login").nth(1).click();
			
			
			page.locator(".flex.flex-col.gap-4.items-center.justify-center").nth(0).click();
			
			
//			//For checking all mandatory feilds------------------------------------------
						
			page.locator(".default-primary-btn").click();
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(0)).containsText("Profession is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(1)).containsText("Job Title is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(2)).containsText("Experience is required");			
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(3)).containsText("Job Duration is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(4)).containsText("Department is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(5)).containsText("No of Positions is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(6)).containsText("Job Start Date is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(7)).containsText("Job End Date is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(8)).containsText("Job Start Time is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(9)).containsText("Last Date to Apply is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(10)).containsText("Job Description is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(11)).containsText("Qualification is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(12)).containsText("Salary Type is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(13)).containsText("Recruiter is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(14)).containsText("Recruiter Name is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(15)).containsText("Recruiter phone number is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(16)).containsText("Recruiter Mail Id is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(17)).containsText("Name is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(18)).containsText("Phone number is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(19)).containsText("Mail Id is required");
			
		
		
			
			page.locator(".css-1wy0on6").nth(0).click();
			page.keyboard().type("Doctor");
			page.keyboard().press("Enter");
			
			page.locator(".MuiFormControlLabel-root.MuiFormControlLabel-labelPlacementEnd").nth(0).click();			//for partTime
//			page.locator(".css-hyxlzm").nth(1).click();			// For FullTime
			
			page.locator(".css-1wy0on6").nth(1).click();
			page.keyboard().type("Abdominal Surgeon");
			page.keyboard().press("Enter");
			
			page.locator(".css-1wy0on6").nth(2).click();
		//	page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator(".MuiFormControlLabel-root.MuiFormControlLabel-labelPlacementEnd").nth(3).click();			//For ShortTerm
//			page.locator(".css-hyxlzm").nth(4).click();			//For Longterm
			
			
			page.locator(".css-ltz9jb").nth(0).click();
			page.keyboard().type("S");
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator("#noOfPosition").fill("2");
			
			
			page.locator(".css-ltz9jb").nth(1).click();
			page.keyboard().type("S");
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator(".css-ltz9jb").nth(2).click();
			page.keyboard().type("S");
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator(".css-ltz9jb").nth(3).click();
			page.keyboard().type("MBBS");
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator(".css-1wy0on6").nth(3).click();
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator("[name='fromDate']").click();
			page.keyboard().type("10072025");
			
			page.locator("[name='endDate']").click();
			page.keyboard().type("10082025");
			
			
			page.locator(".toggle-switch").click();
			
			page.locator("[name='lastDateToApply']").click();
			page.keyboard().type("09");
			
			page.locator("#jobDescription").fill("need Surgeon");
			
		
			page.locator(".css-1wy0on6").nth(4).click();
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			
			page.locator(".css-1wy0on6").nth(5).click();
			page.keyboard().type("Mo");
			page.keyboard().press("Enter");
			
			page.locator(".MuiFormControlLabel-root.MuiFormControlLabel-labelPlacementEnd").nth(5).click();   // For my Self
//			page.locator("#css-hyxlzm").nth(6).click();  //For Other
			
			
			page.locator("#input_checkbox").click();
			
			
			page.locator(".default-primary-btn").click();
			
			page.waitForTimeout(2000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			   page.waitForTimeout(2000);
				System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
		}
		
		finally {
			page.close();
			browser.close();
		}
		
		
		
	}

}
