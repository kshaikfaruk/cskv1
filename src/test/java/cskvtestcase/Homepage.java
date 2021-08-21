package cskvtestcase;

import java.io.IOException;


import org.testng.annotations.Test;


import resuableComponents.BussinessComponents;
import resuableComponents.TechnicalComponents;

public class Homepage  extends BussinessComponents{

	@Test
	public void verifysearchOrder() throws IOException, InterruptedException{
		 launchUrl(properties.getProperty("enviroment_url"));
		 TechnicalComponents.waitTill(50);
		 clickWomenTab();
		 checktopsCheckbox();
		 checkSizeCheckbox();
		// selectelement();
		 selectinGridFirstOne();
		 TechnicalComponents.waitTill(100);
		 orderDetails();
		 
	}

}
