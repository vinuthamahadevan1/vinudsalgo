package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepg {
	 private WebDriver driver;
	 private By home=By.xpath("//*[text()='Get Started']");
	 private By dropodown=By.xpath("//*[@id='navbarCollapse']/div[1]/div/a");
	 private By Arrays=By.xpath("//*[text()='Arrays']");
	 private By Linkedlist=By.xpath("//*[@id='navbarCollapse']/div[1]/div/div/a[2]");
	 private By Stack=By.xpath("//*[text()='Stack']");
	 private By Queue=By.xpath("//*[text()='Queue']");
	 private By Tree=By.xpath("//*[text()='Tree']");
	 private By Graph=By.xpath("//*[text()='Graph']");
	 private By signin=By.xpath("//*[text()='Sign in']");
	 private By register=By.xpath("//ul/a[2]");
	 private By login=By.xpath("//ul/a[3]");
	 private By collection_getstart=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	 //constructor of the homepg
	 public homepg (WebDriver driver) {
		 this.driver=driver;
	 }
	 //page actions:fetaures(behavior) of the page the form of methods
	 public void click_home() {
		 driver.findElement(home).click();
		 
	 }
     public void dropdownclick() {
     driver.findElement(dropodown).click();
 
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     ///html/body/div[2]
    	
    	 
     }
     public String dropdown_validation() {
    	 
    	 String str= driver.findElement(Arrays).getText();
    	 System.out.println("dropdown data"+str);
    	 return str;
    	 }
     public String error_msg() {
    	 driver.findElement(Stack).click();
    	 String errodata=driver.findElement(By.xpath("/html/body/div[2]")).getText();
    	 System.out.println("error message"+errodata);
    	 return errodata ;
    	 }
     public void signin() {
    	 WebElement Signin=driver.findElement(signin);
    	 Signin.click();
    	 Signin.getScreenshotAs(null);
     }
     public void Register() {
    	 WebElement REgister=driver.findElement(register);
    	 REgister.click();
    	 }
     public String collection() {
    	 WebElement collectionvalidation=driver.findElement(collection_getstart);
    	 collectionvalidation.click();
    	 String validation=collectionvalidation.getAttribute("validation");
    	 return validation;
     }
     public String dropdowndata() {
    	 dropdownclick();
    	ArrayList<String> data=new ArrayList<>();
    	 data.add("Arrays");
    	 data.add("Linkelist");
    	 data.add("Stack");
    	 data.add("Queue");
    	 data.add("Tree");
    	 data.add("Graph");
    	 String str = null;
    	 for(String str1:data) {
    		 str=str1;
    		 System.out.println("data in dropdown"+str);
    		 
    	 }
    	 
       /*List<WebElement> strele= driver.findElements(dropodown);
       for(WebElement data1:strele) {
    	   if(data1.getText().equals("Stack")) {
    		   data1.click();
    	   }
    	   
       }
    	 */
    	 /*Actions action=new Actions(driver);
    	 action.moveToElement("Stack").click();*/
    	 /*Random random=new Random();
    	 char strele=random.toString().charAt(3);
    	 System.out.println(strele);*/
    	 
    	 return str;
    	
    	 
     }
	public void dropdowndataclick() {
		dropdownclick();
	
		
	}
    
}
