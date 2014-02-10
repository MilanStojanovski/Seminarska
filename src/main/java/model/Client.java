package model;

public class Client {

	public String name;
	public String surname;
	public String MBR;
	public String cardNum;//kreditna karticka
	public String mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMBR() {
		return MBR;
	}
	public void setMBR(String mBR) {
		MBR = mBR;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
