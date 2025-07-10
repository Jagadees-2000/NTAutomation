package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DashBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Browser browser=null;
		Page page=null;
		String emailOrPhoneNo="2323232828";
		String password="Test@000";
		
		
		try {
			
			
			browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			
			page=browser.newPage();
			
			page.navigate("https://k8-qa-job-web.nextenti.ai/login");
			
			page.locator("#loginId").fill(emailOrPhoneNo);
			
			page.locator("#password").fill(password);
			
			page.getByText("Login").nth(1).click();
			
			
			
			//For DashBoard------------------------------------
			
			
			//Current Jobs-----------------------------------
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Current Jobs")).click();
			
			page.locator("[class='btn btn-sm btn-circle bg-base-100 absolute right-4 top-3']").click();
			
			//Upcoming Jobs---------------------------------
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Upcoming Jobs")).click();
			
			page.locator("[class='btn btn-sm btn-circle bg-base-100 absolute right-4 top-3']").click();
			
			//Completed Jobs------------------------------------
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Completed")).click();
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			
			//My Applications--------------------------------------
			//Applied----------------------------------------------
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Applied")).click();
			
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			
			//Offered ---------------------------------------------
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Offered")).click();
			
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			//Declined---------------------------------------------
			page.locator("[class='whitespace-nowrap']")
			.filter(new Locator.FilterOptions().setHasText("Declined")).click();
			
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			
			
			//Update Profile----------------------------------------
			page.locator("[class='flex items-center gap-3 ml-3 py-1 px-3 bg-white w-min rounded-md']").click();
			
			page.locator("[class='flex font-semibold text-darkblue border border-lightgrey61 px-3 py-1 rounded-3xl']").first().click();  // For Profile
			
			page.locator(".default-primary-btn").click();
			
			 page.locator(".default-primary-btn").click();
			 
			 page.locator(".default-primary-btn").click();
			    
			    page.locator("#btn-no-1").click();
			    
			    page.locator("[class='flex items-center gap-3 ml-3 py-1 px-3 bg-white w-min rounded-md']").click();
			page.locator("[class='flex font-semibold text-darkblue border border-lightgrey61 px-3 py-1 rounded-3xl']").last().click();	//For Prefference
			    page.locator("[class='primary-btn ']").click(); 
			
			    
			    
			    
			    
			    
			
			    page.waitForTimeout(2000);
				System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
		}
		
		finally {
			page.close();
			browser.close();
		}

		
		
	}

}
