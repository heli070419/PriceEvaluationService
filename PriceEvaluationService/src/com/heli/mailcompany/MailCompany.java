package com.heli.mailcompany;

import java.util.List;

public class MailCompany {

	private String mailCompanyName;
	private String companyAddress;
	private String phoneNumber;
	private List<Rule> rules;

	public String getMailCompanyName() {
		return mailCompanyName;
	}

	public void setMailCompanyName(String mailCompanyName) {
		this.mailCompanyName = mailCompanyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

}
