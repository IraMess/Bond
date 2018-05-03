package com.bond.api.dto;

public class Communications {

	String telephone;
	String skype;
	String viber;
	String whatsApp;
	String telegram;

	public Communications() {
	}

	public Communications(String telephone, String skype, String viber, String whatsApp, String telegram) {
		this.telephone = telephone;
		this.skype = skype;
		this.viber = viber;
		this.whatsApp = whatsApp;
		this.telegram = telegram;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getViber() {
		return viber;
	}

	public void setViber(String viber) {
		this.viber = viber;
	}

	public String getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}

	public String getTelegram() {
		return telegram;
	}

	public void setTelegram(String telegram) {
		this.telegram = telegram;
	}

}
