package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.Automation_POM.classs.Address_Tab;
import com.Automation_POM.classs.Casualdress_Page;
import com.Automation_POM.classs.Eveningdress_Order_Page;
import com.Automation_POM.classs.Eveningdress_Page;
import com.Automation_POM.classs.Loginn_Page;
import com.Automation_POM.classs.Logout_Page;
import com.Automation_POM.classs.Myaccount_Page;
import com.Automation_POM.classs.Mystore_Page;
import com.Automation_POM.classs.Order_Confrim_Page;
import com.Automation_POM.classs.Order_History;
import com.Automation_POM.classs.Order_Page;
import com.Automation_POM.classs.Payment_Tab;
import com.Automation_POM.classs.Shipping_Tab;
import com.Automation_POM.classs.Summerdress_Order_Page;
import com.Automation_POM.classs.Summerdress_Page;

public class Automation_Pageobject_Manger {

	public WebDriver driver;

	private Mystore_Page ms;
	private Loginn_Page lp;
	private Myaccount_Page map;
	private Casualdress_Page cdp;
	private Order_Page op;
	private Address_Tab adt;
	private Shipping_Tab st;
	private Payment_Tab pt;
	private Order_Confrim_Page ocp;
	private Order_History oh;
	private Eveningdress_Page edp;
	private Eveningdress_Order_Page eop;
	private Summerdress_Page sdp;
	private Summerdress_Order_Page sdop;
	private Logout_Page lop;

	public Automation_Pageobject_Manger(WebDriver driver) {

		this.driver = driver;
	}

	public Mystore_Page getMs() {

		if (ms == null) {
			ms = new Mystore_Page(driver);
		}
		return ms;
	}

	public Loginn_Page getLp() {

		if (lp == null) {
			lp = new Loginn_Page(driver);
		}
		return lp;
	}

	public Myaccount_Page getMap() {

		if (map == null) {
			map = new Myaccount_Page(driver);
		}
		return map;
	}

	public Casualdress_Page getCdp() {

		if (cdp == null) {
			cdp = new Casualdress_Page(driver);
		}
		return cdp;
	}

	public Order_Page getOp() {

		if (op == null) {
			op = new Order_Page(driver);
		}
		return op;
	}

	public Address_Tab getAdt() {

		if (adt == null) {
			adt = new Address_Tab(driver);
		}
		return adt;
	}

	public Shipping_Tab getSt() {

		if (st == null) {
			st = new Shipping_Tab(driver);
		}
		return st;
	}

	public Payment_Tab getPt() {

		if (pt == null) {
			pt = new Payment_Tab(driver);
		}
		return pt;
	}

	public Order_Confrim_Page getOcp() {

		if (ocp == null) {
			ocp = new Order_Confrim_Page(driver);
		}
		return ocp;
	}

	public Order_History getOh() {

		if (oh == null) {
			oh = new Order_History(driver);
		}
		return oh;
	}

	public Eveningdress_Page getEdp() {

		if (edp == null) {
			edp = new Eveningdress_Page(driver);
		}
		return edp;
	}

	public Eveningdress_Order_Page getEop() {

		if (eop == null) {
			eop = new Eveningdress_Order_Page(driver);
		}
		return eop;
	}

	public Summerdress_Page getSdp() {

		if (sdp == null) {
			sdp = new Summerdress_Page(driver);
		}
		return sdp;
	}

	public Summerdress_Order_Page getSdop() {

		if (sdop == null) {
			sdop = new Summerdress_Order_Page(driver);
		}
		return sdop;
	}

	public Logout_Page getLop() {

		if (lop == null) {
			lop = new Logout_Page(driver);
		}
		return lop;
	}

}
