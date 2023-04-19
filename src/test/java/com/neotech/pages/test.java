package com.neotech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	
		public static void main(String[] args) {
			// Using Chrome to navigate to https://www.facebook.com
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			
			//select Chrome as driver and where is the location
			System.setProperty("webdriver.chrome.driver", "C:/Users/chant/Downloads/chromedriver_win32/chromedriver.exe");
			
			//create objects of ChromeDriver
			WebDriver iDriver = new ChromeDriver(op);
			
			//navigate to Facebook URL
			String url = "http://sis.neotechacademy.com:9000/Test/";
			iDriver.get(url);
			iDriver.manage().window().maximize();
			
			System.out.println("Succefully navigate to "+url);
			
			
		}



}
