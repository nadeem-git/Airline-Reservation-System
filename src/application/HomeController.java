package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable {
	@FXML
	public AnchorPane basepane;
	public Menu hometab;
	
	
     public void registration(ActionEvent ae) {
	   FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(getClass().getResource("flight-registration.fxml"));
		try {
			basepane.getChildren().clear();
			basepane.getChildren().add(loader.load());
		}catch (IOException e){
			e.printStackTrace();
		}
	   
	   
   }
   
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
    
   
    public void flightDetails(ActionEvent ae) {
	   FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(getClass().getResource("Flight-details.fxml"));
		try {
			basepane.getChildren().clear();
			basepane.getChildren().add(loader.load());
		}catch (IOException e){
			e.printStackTrace();
		}
	   
	   
   }
   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Label homeLabel = new Label("Home");
		homeLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
		public void handle(MouseEvent arg0) {
			// TODO Auto-generated method stub
			FXMLLoader loader =  new FXMLLoader();
			loader.setLocation(getClass().getResource("Home-page.fxml"));
			try {
				basepane.getChildren().clear();
				basepane.getChildren().add(loader.load());
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
		});

	hometab.setGraphic(homeLabel);
		
	}
	public void addbus(ActionEvent ae) {
		   FXMLLoader loader =  new FXMLLoader();
			loader.setLocation(getClass().getResource("AddBus.fxml"));
			try {
				basepane.getChildren().clear();
				basepane.getChildren().add(loader.load());
			}catch (IOException e){
				e.printStackTrace();
			}
		   
		   
	}

}
