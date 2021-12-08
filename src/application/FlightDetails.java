package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DatabaseAccess;


public class FlightDetails implements Initializable { 
		
		@FXML
		public TableView< BookingDetails> outputTV;
		public TableColumn<BookingDetails, String> fnameTC;
		public TableColumn<BookingDetails, String> lnameTC;
		public TableColumn<BookingDetails, String> sourceTC;
		public TableColumn<BookingDetails, String> destinationTC;
		public TableColumn<BookingDetails, String> flightnTC;
		public TableColumn<BookingDetails, Integer> flightnoTC;
		public TableColumn<BookingDetails, Integer> dobTC;
		public TableColumn<BookingDetails, Integer> passnoTC;
		public TableColumn<BookingDetails, Double> priceTC;
		
		
		public void getAllData(ActionEvent ae) {
			outputTV.setItems(DatabaseAccess.getAllBookingDetails());
		}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			fnameTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,String>("Firstname"));
			lnameTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,String>("Lastname"));
			sourceTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,String>("Dource"));
			destinationTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,String>("Destination"));
			flightnTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,String>("Flight Name"));
			flightnoTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,Integer>("Flight No."));
			dobTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,Integer>("DOB"));
			passnoTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,Integer>("Passport no"));
			priceTC.setCellValueFactory(new PropertyValueFactory<BookingDetails,Double>("Price"));
		
		}

	}

