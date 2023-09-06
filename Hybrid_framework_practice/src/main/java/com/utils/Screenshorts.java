package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class Screenshorts extends BaseClass {
	
	public static String screen_capture(String name) {
		
		TakesScreenshot screen= ((TakesScreenshot)driver);
		 File file =screen.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Hybrid_framework_practice\\screenshort"+name+".png";
		try {
			FileUtils.copyFile(file, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
	}

}
