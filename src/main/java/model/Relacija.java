package model;

import java.sql.Date;
import java.util.List;

public class Relacija {

	public String from;//grad na trgnuvanje
	public String to;//
	
	public Date date;//datum na trgnuvanje
	
	public int priceOne;//cena edna nasoka
	public int priceReturn;//cena povraten
	public boolean direct;//direkten?
	
	public List<String> goesThrough;//niz koi gradovi vrvi
	
	public List<String> getGoesThrough() {
		return goesThrough;
	}
	public void setGoesThrough(List<String> goesThrough) {
		this.goesThrough = goesThrough;
	}
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
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
