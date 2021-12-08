package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import application.BookingDetails;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import res.Values;

public class DatabaseAccess {
	
	public static void addFlightDetails(BookingDetails d) {
		try {
			Values.stmt.executeUpdate("insert into ticket1 values ('"+d.getfirstname()+"','"+d.getlastname()+"','"+d.getdate()+"','"+d.getsource()+"','"+d.destination()+"','"+d.getflightn()+"','"+d.flightnum()+"','"+d.getpassnum()+"','"+d.getprice()+"'");
			System.out.println("Data inserted successfully");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static ObservableList<BookingDetails> getAllBookingDetails() {
		ObservableList<BookingDetails> list = FXCollections.observableArrayList();
		
		
		try {
			ResultSet rs = Values.stmt.executeQuery("select * from ticket1");
			while(rs.next()) { 
				list.add(new BookingDetails(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getDouble(9)));
			}}catch(Exception ex) {
				ex.printStackTrace();
			}
		
		return list;
		
	}
	

}
