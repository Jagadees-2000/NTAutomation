package com.Corporate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class SideBar {

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
			
			
			page.locator(".pl-2.mb-1").nth(0).click();
			page.locator(".pl-2.mb-1").nth(1).click();
			
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("Active")).click();
			page.locator(".pl-2.mb-1").nth(1).click();
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("Open")).click();
			page.locator(".btn.btn-sm.btn-circle").click();
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("Hired")).click();
			page.locator(".btn.btn-sm.btn-circle").click();
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("Completed")).click();
			page.locator(".btn.btn-sm.btn-circle").click();
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("In Progress")).click();
			page.locator(".btn.btn-sm.btn-circle").click();
			page.locator(".text-center.flex.items-center") 
			.filter(new Locator.FilterOptions().setHasText("Absent")).click();
			page.locator(".btn.btn-sm.btn-circle").click();
			
			page.locator(".pl-2.mb-1").nth(2).click();
			page.locator(".tab.text-lg.rounded-xl.p-0").nth(1).click();
			page.locator(".tab.text-lg.rounded-xl.p-0").nth(2).click();
			page.locator(".tab.text-lg.rounded-xl.p-0").nth(3).click();
			page.locator(".tab.text-lg.rounded-xl.p-0").nth(0).click();
			
			page.locator(".mt-1.ml-1").nth(1).click();
			page.locator(".mt-1.ml-1").nth(2).click();
						
			page.locator(".pl-2.mb-1").nth(3).click();
			page.getByText("Timesheet Logs").click();
			page.locator(".rmdp-input").click();
			page.locator(".sd ").first().click();
			page.locator(".sd ").last().click();
			
			page.getByText("timesheet approval").click();
			
			page.locator(".pl-2.mb-1").nth(5).click();
			page.locator(".default-primary-btn").click();
			
			page.locator(".btn-primary.border-red").click();
			
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(0)).containsText("First Name is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(1)).containsText("Last Name is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(2)).containsText("Job Title/Specialization is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(3)).containsText("User Role is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(4)).containsText("Mobile Number is required");
			PlaywrightAssertions.assertThat(page.locator(".mt-1.text-sm.text-error ").nth(5)).containsText("Email Address is required");
			
			page.locator("#firstName").fill("Jagedees");
			page.locator("#lastName").fill("Doll");
			page.locator("#profession").fill("Manager");
			page.locator("#roles").click();
			page.keyboard().type("Admin");
			page.keyboard().press("Enter");
			
			page.locator("#phoneNo").fill("2326262635");
			
			page.locator("#emailId").fill("jagadeesdoll0098@gmail.com");
			
			page.locator(".btn-primary.border-red").click();
			
			System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");
			
			
			
		}
		
		
		
		finally {
	
			page.close();
			browser.close();
		}

		
		
		
	}

}
