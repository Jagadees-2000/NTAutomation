package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		Browser browser=null;
		Page page=null;
		
		String emailOrPhoneNo="2323232828";
		String password="Test@000";
		
		
		
		try {
			
			browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
			page=browser.newPage();
			page.navigate("https://k8-qa-job-web.nextenti.ai/login");
			
			page.locator("#loginId").fill(emailOrPhoneNo);
			
			page.locator("#password").fill(password);
			
			page.getByText("Login").nth(1).click();
			
			

			//Home Page------------------------------------------------------
			
//			//search jobs-----------------------------------------------------
//			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			
//			page.locator("[class='flex flex-col gap-4 items-center justify-center no-border rounded-3xl bg-biscayWhite cursor-pointer py-6 px-4']").click();
			
			page.locator("div.flex.flex-col.gap-4.items-center.justify-center.no-border.rounded-3xl.bg-biscayWhite.cursor-pointer.py-6.px-4")
	        .filter(new Locator.FilterOptions().setHasText("Search Jobs")).click();
			

			page.locator(".tab.text-lg").nth(0).click();  	// All
			page.locator(".tab.text-lg").nth(1).click(); 	// Recommended
			page.locator(".tab.text-lg").nth(2).click();   	// Saved
			page.locator(".tab.text-lg").nth(0).click(); 	// All
			
			page.locator(".relative.w-\\[25rem\\]").click();
			page.keyboard().type("Cardio in Hyd");

			page.locator(".bg-darkblue.text-white").filter(new Locator.FilterOptions().setHasText("Search")).click();;

			page.locator(".bg-lightgrey47.border.border-lightgrey47").click();

			page.locator(".css-ltz9jb").nth(0).click();
			page.keyboard().type("Nursing");
			page.keyboard().press("ArrowDown");
			page.keyboard().press("Enter");

			page.locator(".css-ltz9jb").nth(1).click();
			page.keyboard().type("Medicine");
			page.keyboard().press("ArrowDown");
			page.keyboard().press("Enter");

			page.locator(".css-ltz9jb").nth(3).click();
			page.keyboard().type("Andhra Pradesh");
			page.keyboard().press("ArrowDown");
			page.keyboard().press("Enter");
			page.waitForTimeout(1000);

			page.locator("#City").click();
			page.locator("[name='Pincode']").fill("520008");
			page.keyboard().press("Enter");

			page.locator(".bg-blueTheme.text-white").click();
			
			page.waitForTimeout(2000);
			
//		Manage prefferences------------------------------------
			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			
			page.locator(".flex.flex-col.bg-biscayWhite.cursor-pointer").nth(2).click();
//			page.locator("div.flex.flex-col.gap-4.items-center.justify-center.no-border.rounded-3xl.bg-biscayWhite.cursor-pointer.py-6.px-4")
//	        .filter(new Locator.FilterOptions().setHasText("Manage Preference")).click();
			
			page.getByPlaceholder("Organization Type").clear();
			page.getByPlaceholder("Organization Type").click();
			page.keyboard().press("Enter");
			
			page.getByPlaceholder("State").clear();
			page.getByPlaceholder("State").fill("Andhra Pradesh");
			page.keyboard().press("Enter");
			
			page.getByPlaceholder("Add your city ").clear();
			page.getByPlaceholder("Add your city ").fill("Ongole");
			page.keyboard().press("Enter");
			
			page.locator("[class='primary-btn ']").click();
			
			
//			//Create Availability--------------
//			
			
			page.locator(".flex.flex-col.bg-biscayWhite.cursor-pointer").nth(3).click();

			page.locator(".MuiFormControlLabel-label").nth(0).click();

			page.locator(".default-primary-btn").click();

			page.locator(".css-1k7o0ug-control").click();
			page.keyboard().type("card");
			page.waitForTimeout(500);
			page.keyboard().press("ArrowDown");
			page.keyboard().press("Enter");

			page.locator(".MuiOutlinedInput-input").nth(0).click();
			page.keyboard().type("05072025");
			page.waitForTimeout(500);

			page.locator(".MuiOutlinedInput-input").nth(1).click();
			page.keyboard().type("05082025");

			page.locator(".toggle-switch").click();

			page.locator(".btn-primary").click();
			
		
			
			
			
			// Edit Profile --------------------------------------------
			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			
			page.locator("div.flex.flex-col.gap-4.items-center.justify-center.no-border.rounded-3xl.bg-biscayWhite.cursor-pointer.py-6.px-4")
	        .filter(new Locator.FilterOptions().setHasText("Edit Profile")).click();
			
			page.locator(".default-primary-btn").click();
			
			 page.locator(".default-primary-btn").click();
			 
			 page.locator(".default-primary-btn").click();
			    
			    page.locator("#btn-no-1").click();
			
			
			
			
			//My Jobs-------------------------------------------------
			//Current JObs--------------------------------------------
			
			page.locator("[class='text-white font-medium']").first().click();
			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			
			page.locator("[class='text-white font-medium']").last().click();		 //Upcoming Jobs
			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			
			
			//Applied jobs  // Offered Jobs  //Declined Jobs
			page.locator("[class='text-darkblue1 font-medium text-base']").nth(0).click();
			page.locator("[class='pl-2 mb-1']").nth(0).click();
		    
			page.locator("[class='text-darkblue1 font-medium text-base']").nth(1).click();
			page.locator("[class='pl-2 mb-1']").nth(0).click();
		    
			page.locator("[class='text-darkblue1 font-medium text-base']").nth(2).click();
			page.locator("[class='pl-2 mb-1']").nth(0).click();
		    
			
			System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
			
		}

		finally {
			page.close();
			browser.close();
		}
		
	}

}
