package com.Candidate;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginLogout {

	
	
	public static void main(String[] args) {
		
		
		
		Playwright playwright = Playwright.create();
		  
		  BrowserType browserType = playwright.chromium();
		  
		  Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		  
		 Page page = browser.newPage();
		 
		page.navigate("https://k8-qa-job-web.nextenti.ai/login");
		 
		 String title = page.title();
		 
		 System.out.println("Title is "+title);
		 
		 page.locator("#loginId").fill("2323232828");
			
			page.locator("#password").fill("Test@000");
			
			page.getByText("Login").nth(1).click();
			
			page.locator(".w-6").click();
		      
		      page.locator("xpath=//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div[2]/ul/li[2]/span").click();
		      
		      page.locator("#btn-yes-1").click();  
		      
			
			page.waitForTimeout(2000);
			 
			 page.close();
			 
			 browser.close();
			 
			 playwright.close();
		 
			System.out.println("\u001B[32m" + "Passed" + "\u001B[0m");
	}
}
