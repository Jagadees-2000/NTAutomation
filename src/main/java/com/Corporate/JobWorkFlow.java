package com.Corporate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class JobWorkFlow { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName="2312111111";
		String password="Jani@2000";
		
		Browser browser=null;
		Page page=null;
		
		
		try {
			
			browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			
			page=browser.newPage();
			
			page.navigate("https://k8-qa-job-web.nextenti.ai/login");
			
			page.locator("#loginId").fill(userName);
			
			page.locator("#password").fill(password);
			
			page.getByText("Login").nth(1).click();
			
			page.locator(".flex.items-center.justify-normal.gap-4").nth(0).click();
			
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
			
			page.locator(".MuiFormControlLabel-root.MuiFormControlLabel-labelPlacementEnd").nth(4).click();			//For ShortTerm
//			page.locator(".css-hyxlzm").nth(4).click();			//For Longterm
			
			
			page.locator(".css-ltz9jb").nth(0).click();
			page.keyboard().type("S");
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			page.locator("[name='noOfPosition']").click();
			page.keyboard().type("2");
			
			
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
			page.keyboard().type("13072025");
			
			page.locator("[name='endDate']").click();
			page.keyboard().type("13082025");
			
			
			page.locator(".toggle-switch").click();
			page.pause();
			page.locator("[name='lastDateToApply']").click();
			page.keyboard().type("12");
			
			page.locator(".flex.flex-col.items-center").nth(2).click();
			
			
			page.waitForSelector(".ql-container.ql-snow").textContent().contains("Job Title");
			
		
			page.locator(".css-1wy0on6").nth(4).click();
			page.keyboard().down("ArrowDown");
			page.keyboard().press("Enter");
			
			
			page.locator(".css-1wy0on6").nth(5).click();
			page.keyboard().type("Mo");
			page.keyboard().press("Enter");
			
			page.locator(".MuiFormControlLabel-root.MuiFormControlLabel-labelPlacementEnd").nth(5).click();   // For my Self
//			page.locator("#css-hyxlzm").nth(6).click();  //For Other
			
			
//			page.locator("#input_checkbox").click();
			
			
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
