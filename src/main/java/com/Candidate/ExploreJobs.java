package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ExploreJobs {

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
			
			

			// Explore Jobs-----------------------------------------
			
			
			page.locator("[class='pl-2 mb-1']").nth(2).click();
			page.waitForTimeout(2000);
			
			page.locator("[class='rounded-xl border-[1px] border-lighblue px-7 py-5']").first().click();
			page.locator("[class='btn btn-primary border-red btn-sm text-white font-medium normal-case text-base !w-24 !h-9']").click();
			
			page.locator("[class='flex flex-row text-lg font-medium text-darkblue items-center gap-[0.5rem] cursor-pointer']").click();
			
			page.locator(".default-primary-btn").click();
			
			 page.locator(".default-primary-btn").click();
			 
			 page.locator(".default-primary-btn").click();
			    
			 page.locator("#btn-no-1").click();
			    
			    page.locator("[class='btn btn-primary border-red btn-sm text-white font-medium normal-case text-base !w-24 !h-9']").click();
			
			page.locator("[class='btn-gray !w-24 !h-8']").click();
			
			
			   page.waitForTimeout(2000);
				System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
		}
		
		finally {
			page.close();
			browser.close();
		}
		
		
	}

}
