package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BookingDetails {
	
	SimpleStringProperty firstname;
	SimpleStringProperty lastname;
	SimpleStringProperty source;
	SimpleStringProperty destination;
	SimpleStringProperty flightn;
	SimpleDoubleProperty price;
	SimpleIntegerProperty passnum;
	SimpleIntegerProperty date;
	SimpleIntegerProperty flightnum;
	
	
	public BookingDetails( String firstname, String lastname,int date, String source, String destination, String flightn,int flightnum , int passnum, double price) {
		
		this.firstname = new SimpleStringProperty(firstname);
		this.lastname = new SimpleStringProperty(lastname);
		this.date = new SimpleIntegerProperty(date);
		this.source = new SimpleStringProperty(source);
		this.destination = new SimpleStringProperty(destination);
		this.flightn = new SimpleStringProperty(flightn);
		
		this.passnum = new SimpleIntegerProperty(passnum);
		this.price = new SimpleDoubleProperty(price);
		this.flightnum = new SimpleIntegerProperty(flightnum);
		
		
	}
	
	public String getfirstname() {
		return firstname.get();
	}
	
	public String getlastname() {
		return lastname.get();
	}
	
	
	public String getsource() {
		return source.get();
	}
	
	
	public String destination() {
		return destination.get();
	}
	
	
	public String getflightn() {
		return flightn.get();
	}
	
	
	public int getdate() {
		return date.get();
	}
	
	
	public int getpassnum() {
		return passnum.get();
	}
	
	
	
	public Double getprice() {
		return price.get();
	}
	
	public int flightnum() {
		return flightnum.get();
	}
	

}
