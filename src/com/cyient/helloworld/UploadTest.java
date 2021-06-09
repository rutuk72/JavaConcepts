package com.cyient.helloworld;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.get("https://www.naukri.com/");
		
		
	
		File file=new File("files\\profile.docx");
		String profilepath=file.getAbsolutePath();
		//getting absolute path
		System.out.println(profilepath);
		
		driver.findElement(By.id("file_upload")).sendKeys(profilepath);
	}

}
