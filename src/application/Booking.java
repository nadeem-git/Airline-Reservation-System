package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class Booking {
	
	@FXML
	public AnchorPane basepane;
	
	
	   
	   public void Payment(ActionEvent ae) {
		   FXMLLoader loader =  new FXMLLoader();
			loader.setLocation(getClass().getResource("Payment.fxml"));
			try {
				basepane.getChildren().clear();
				basepane.getChildren().add(loader.load());
			}catch (IOException e){
				e.printStackTrace();
			}
		   
		   
	   }
	   
	   public void searchFlights(ActionEvent ae) {
		   FXMLLoader loader =  new FXMLLoader();
			loader.setLocation(getClass().getResource("Searchflights.fxml"));
			try {
				basepane.getChildren().clear();
				basepane.getChildren().add(loader.load());
			}catch (IOException e){
				e.printStackTrace();
			}
	   }


}
	   
	   