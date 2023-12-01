package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepg {
	 private WebDriver driver;
	 private By home=By.xpath("\"//*[text()='Get Started']");
	 private By dropodown=By.xpath("//div[@id='navbarCollapse']/div/div/a[@class='nav-link dropdown-toggle']");
	 private By Arrays=By.xpath("//*[text()='Arrays']");
	 private By Linkedlist=By.xpath("//*[text()='Linked List']");
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
     }
     public String dropdown_validation() {
    	 dropdownclick();
    	 String str= driver.findElement(Arrays).getText();
    	 return str;
    	 }
     public String error_msg() {
    	 dropdownclick();
    	 WebElement error=driver.findElement(Linkedlist);
    	 error.click();
    	 String error_message=error.getAttribute("error");
    	 return error_message;
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
    	 String str=data.getFirst();
    	 return str;
    	
    	 
     }
     
    
}
