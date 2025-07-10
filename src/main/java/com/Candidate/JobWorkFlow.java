package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JobWorkFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Browser browser=null;
		Page page=null;
		
		try {
			browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			page= browser.newPage();
			page.navigate("https://k8-qa-job-web.nextenti.ai/login"); 
			page.locator("#loginId").fill("2323232828");
			page.locator("#password").fill("Test@000");
			page.getByText("Login").nth(1).click();
			
			
			page.locator(".MuiBadge-root").click();
			
			int count = page.locator(".leading-relaxed").count();
			System.out.println(count);
			
			page.locator(".leading-relaxed").first().click();
			
		
		//	Locator locator = page.locator(".flex.text-blueTheme.font-medium.justify-center").isVisible();
			
			if(page.locator(".flex.text-blueTheme.font-medium.justify-center").isVisible()&& page.locator(".flex.text-blueTheme.font-medium.justify-center").textContent().contains("Raise Request")) {
			page.locator(".flex.text-blueTheme.font-medium.justify-center").click();
			page.locator(".rounded-full.border.border-gray-300").fill("Hai");
			page.locator(".fill-blueTheme").click();
			page.locator(".btn.btn-sm.btn-circle.bg-base-100").click();
			}
			else {
				page.locator(".flex.flex-row.ml-6").click();
				page.locator(".rounded-full.border.border-gray-300").fill("Hai");
				page.locator(".fill-blueTheme").click();
				page.locator(".btn.btn-sm.btn-circle.bg-base-100").click();
			}
			page.locator(".PrivateSwitchBase-input").click();
			page.locator(".primary-btn ").click();
			
			page.waitForTimeout(2000);
			
			
		}

		finally {
			page.close();
			browser.close();
		}
		
	}

}
