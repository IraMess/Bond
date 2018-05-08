package com.bond.сrud.entities;

import com.bond.api.dto.common.*;

public class CommunicationsCrud {

	String telephone;
	String skype;
	String viber;
	String whatsApp;
	String telegram;

	public CommunicationsCrud() {
	}

	public CommunicationsCrud(CommunicationsDto communications) {
		this.telephone = communications.getTelephone();
		this.skype = communications.getSkype();
		this.viber = communications.getViber();
		this.whatsApp = communications.getWhatsApp();
		this.telegram = communications.getTelegram();
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
