package or;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuableComponents.TechnicalComponents;

public class MenOrderpage  extends TechnicalComponents{
	
	
	public  MenOrderpage(WebDriver driver) throws IOException{
		  driver=this.driver;
		  PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath="//ul[contains(@class,'sf-menu clearfix menu-content')]/li/a[contains(text(),'Women')]")
	 public WebElement womenButton;
	
	
	@FindBy(xpath="//ul[@id='ul_layered_category_0']/li//input[@name='layered_category_4']")
	 public WebElement topscheckbox;
	@FindBy(xpath="//div[@class='layered_filter']/ul[@id='ul_layered_id_attribute_group_1']/li//input[@id='layered_id_attribute_group_1']")
	 public WebElement sizecheckBox;
	@FindBy(xpath="//div[@class='product-image-container']//img")
	 public List<WebElement> listelement ;	
	
	@FindBy(xpath="//div[@class='button-container']/a/span[contains(text(),'Add to cart')]")
	 public List<WebElement> addTocartbutton ;
	@FindBy(xpath="	//p[@id='add_to_cart']/button")
	 public WebElement order_Name;
	@FindBy(xpath="//select[@id='selectProductSort']/option	")
	 public List<WebElement> handleselect;

	 public void clickWomentab(){
		 TechnicalComponents.click(womenButton);
		 }
	  public void checktops_checkbox(){
		  TechnicalComponents.click(topscheckbox);
	  }
	   public void checksize_checkbox(){
		   TechnicalComponents.click(sizecheckBox);
		    }
	   public void selectfirstone(){
		   TechnicalComponents.selectFirstdisplayedElement( listelement,addTocartbutton );
	   }
	    public void printOrderdetails(){
	    	TechnicalComponents.handleframe(order_Name);
	 
	    }
	    public void selectdropdown(){
	    	TechnicalComponents.handledropDown(handleselect);
	    }
	    @FindBy(xpath=" //a[@class='btn btn-default button button-medium']/span")
		 public WebElement checkoutButton;
	 
	     public void clickcheckoutButton(){
	    	 TechnicalComponents.click( checkoutButton);
	     }

}
