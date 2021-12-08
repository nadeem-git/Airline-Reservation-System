package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class loginController {

	@FXML
	public TextField name;
	public TextField password;
	public AnchorPane basepane;
	
	public void signup(ActionEvent ae)
	{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Signup.fxml"));
		try {
			basepane.getChildren().clear();
			basepane.getChildren().add(loader.load());
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void signin(ActionEvent ae)
	{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Home.fxml"));
		try {
			basepane.getChildren().clear();
			basepane.getChildren().add(loader.load());
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
