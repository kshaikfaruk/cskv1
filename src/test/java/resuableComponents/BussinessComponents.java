package resuableComponents;

import java.io.IOException;

import or.MenOrderpage;

public class BussinessComponents extends TechnicalComponents{
	 MenOrderpage mop;

public void launchUrl(String url) throws IOException{
	  TechnicalComponents.navigateToUrl(url);
  }
 public void clickWomenTab() throws IOException{
	 mop= new MenOrderpage(driver);
	 mop.clickWomentab();
 }
  public void checktopsCheckbox() throws IOException{
	  mop= new MenOrderpage(driver);
	  mop.checktops_checkbox();
	  
  }
  public void checkSizeCheckbox() throws IOException{
	  mop= new MenOrderpage(driver);
	  mop.checksize_checkbox();
	  
  }
   public void selectelement() throws IOException{
	   mop= new MenOrderpage(driver);
	   mop.selectdropdown();
   }
   public void selectinGridFirstOne() throws IOException{
	   mop= new MenOrderpage(driver);
	   mop.selectfirstone();
	   
   }
   public void orderDetails() throws IOException{
	   mop= new MenOrderpage(driver);
	   mop.printOrderdetails();	
	   mop.clickcheckoutButton();
	   
}
}