package com.Pom_BaseWithRunner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.pom_manager.Automation_Pageobject_Manger;
import com.utilityfiles.Utility_Files;

public class Automationpractice_With_Base extends Utility_Files {

	
	public static WebDriver driver = browser_Launch("chrome");
	
	public static Automation_Pageobject_Manger manager = new Automation_Pageobject_Manger(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		manage_Commands("maximize");

		url_Launch("http://automationpractice.com/index.php");

		waits("implicit wait", 10);

		click_On_Element(manager.getMs().getSignIn_Btn());
		
		send_Keys(manager.getLp().getEmail(), "cts@gmail.com");

		send_Keys(manager.getLp().getPassword(), "123456");

		click_On_Element(manager.getLp().getSignInBtn());

		sleep(3000);

		action(manager.getMap().getDress(), "move to element");

		click_On_Element(manager.getMap().getCasualDress());

		sleep(2000);
		
		action(manager.getCdp().getImg(), "move to element");

		click_On_Element(manager.getCdp().getQuickViewBtn());

		frame(manager.getCdp().getFr(), "frame");

		click_On_Element(manager.getCdp().getQty());

		dropDown(manager.getCdp().getSize(), "value", "2");

		click_On_Element(manager.getCdp().getAddToCart());

		click_On_Element(manager.getCdp().getProceedBtn());

		frame(null, "web page");

		sleep(2000);

		click_On_Element(manager.getOp().getProceedBtn());  

		sleep(2000);
		
		click_On_Element(manager.getAdt().getProceedBtn()); //address page

		sleep(2000);
		
		click_On_Element(manager.getSt().getTerms());

		click_On_Element(manager.getSt().getProceedBtn()); //shipping tab

		sleep(2000);

		click_On_Element(manager.getPt().getBank());

		sleep(2000);

		click_On_Element(manager.getPt().getConfrim());

		scroll(manager.getOcp().getText());

		sleep(2000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder.png");

		sleep(2000);

		click_On_Element(manager.getOcp().getBack());

		sleep(2000);
		
		scroll(manager.getOh().getText()); //order history

		sleep(2000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder1.png");

		sleep(2000);
		

		action(manager.getMap().getDress(), "move To Element");

		click_On_Element(manager.getMap().getEveningDress());

		sleep(2000);
		
		action(manager.getEdp().getImg(), "move To Element");

		click_On_Element(manager.getEdp().getQuickViewBtn());

		frame(manager.getEdp().getFr(), "frame");

		click_On_Element(manager.getEdp().getQty());

		dropDown(manager.getEdp().getSize(), "value", "2");

		click_On_Element(manager.getEdp().getAddToCart());

		click_On_Element(manager.getEdp().getColor());

		click_On_Element(manager.getEdp().getProceedBtn());

		frame(null, "web page");

		sleep(2000);
		
		click_On_Element(manager.getEop().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getAdt().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getSt().getTerms());

		click_On_Element(manager.getSt().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getPt().getBank());

		sleep(2000);

		click_On_Element(manager.getPt().getConfrim());

		scroll(manager.getOcp().getText());

		sleep(1000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder3.png");

		sleep(2000);

		click_On_Element(manager.getOcp().getBack());

		sleep(2000);

		scroll(manager.getOh().getText());

		sleep(1000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder4.png");

		sleep(2000);
		
		

		action(manager.getMap().getDress(), "move To Element");

		click_On_Element(manager.getMap().getSummerDress());

		sleep(2000);
		
		action(manager.getSdp().getImg(), "move To Element");

		click_On_Element(manager.getSdp().getQuickViewBtn());

		frame(manager.getSdp().getFr(), "frame");

		click_On_Element(manager.getSdp().getQty());

		dropDown(manager.getSdp().getSize(), "value", "2");

		click_On_Element(manager.getSdp().getColor());

		click_On_Element(manager.getSdp().getAddToCart());

		click_On_Element(manager.getSdp().getProceedBtn());

		frame(null, "web Page");

		sleep(2000);

		click_On_Element(manager.getSdop().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getAdt().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getSt().getTerms());

		click_On_Element(manager.getSt().getProceedBtn());

		sleep(2000);

		click_On_Element(manager.getPt().getBank());

		sleep(2000);

		click_On_Element(manager.getPt().getConfrim());

		scroll(manager.getOcp().getText());

		sleep(1000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder5.png");

		sleep(2000);

		click_On_Element(manager.getOcp().getBack());

		sleep(2000);

		scroll(manager.getOh().getText());

		sleep(1000);

		screenshot("C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\Screenshots\\Myorder6.png");

		sleep(2000);
		
		click_On_Element(manager.getLop().getLogout());
		
		close();

		
	}

}
