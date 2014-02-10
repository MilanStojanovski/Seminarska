package model;

import java.sql.Date;

public class Relacija {

	public String from;//grad na trgnuvanje
	public String to;//
	public String company;
	public Date date;//datum na trgnuvanje
	public String timeD;//vreme na trganje
	public String timeA;//
	public int priceOne;//cena edna nasoka
	public int priceReturn;//cena povraten
	public boolean direct;//direkten?
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTimeD() {
		return timeD;
	}
	public void setTimeD(String timeD) {
		this.timeD = timeD;
	}
	public String getTimeA() {
		return timeA;
	}
	public void setTimeA(String timeA) {
		this.timeA = timeA;
	}
	public int getPriceOne() {
		return priceOne;
	}
	public void setPriceOne(int priceOne) {
		this.priceOne = priceOne;
	}
	public int getPriceReturn() {
		return priceReturn;
	}
	public void setPriceReturn(int priceReturn) {
		this.priceReturn = priceReturn;
	}
	public boolean isDirect() {
		return direct;
	}
	public void setDirect(boolean direct) {
		this.direct = direct;
	}
	
	
}
