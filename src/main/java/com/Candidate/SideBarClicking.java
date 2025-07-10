package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SideBarClicking {

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
			
			

			// Side Bar-----------------------------------------
			
			page.locator("[class='pl-2 mb-1']").nth(0).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(1).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(2).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(3).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(4).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(5).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(6).click();
			page.waitForTimeout(2000);
			page.locator("[class='pl-2 mb-1']").nth(8).click();
			
			
			   page.waitForTimeout(2000);
				System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");					// for Green Text Only
			
		}
		
		finally {
			page.close();
			browser.close();
		}

	}

}
