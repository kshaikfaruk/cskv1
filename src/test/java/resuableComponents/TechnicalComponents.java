package resuableComponents;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import config.TestSetUp;
import io.restassured.RestAssured;

public class TechnicalComponents  extends TestSetUp{
	public static WebDriver driver;


	public static  void navigateToUrl( String url) throws IOException{
		driver= getDriver();
		driver.get(url);
	}
	public static void click( WebElement element ){
		if(element.isDisplayed()){
			if(element.isEnabled()){
				element.click();

			}
		}else{
			element.click();
		}
	}
	public static void waitTill(int millseconds) throws InterruptedException{
		Thread.sleep(millseconds);
	}
	public static void selectFirstdisplayedElement(List<WebElement> element,List<WebElement> elements){
		int size=element.size()-1;
		for(int i=0;i<=size;i++){
			if(i==1){
				TechnicalComponents.click(element.get(i));
			//TechnicalComponents.click(elements.get(i));
			}
		}

	}
	public static void handleframe(WebElement element){
	driver.switchTo().frame(0);
	TechnicalComponents.click(element);

		}

	
 public static void handledropDown(List<WebElement> element){
	  for(int i=0;i<element.size()-1;i++){
		   if(i==3){
		  element.get(i).click();
		   }
		  System.out.println(element.get(i).getText());
	  }
 }
	   public  static void handleApi(){
		   RestAssured.baseURI="";
	   }
	   

	   public static  void launchApp() throws IOException{
			driver= getDriver();
			
		}



}
	   
  




