package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sysite"                                
               , summary=""
               , page="Sysite"
               , namespacePrefix="rstk"
               , object="rstk__sysite__c"
               , connection="qarsf"
     )             
public class rstk__Sysite {

	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_Main:j_id114:sysite_site__c:j_id116:j_id122")
	public WebElement siteNumber;
	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_Main:j_id128:sysite_descr__c:j_id130:j_id136")
	public WebElement description;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
