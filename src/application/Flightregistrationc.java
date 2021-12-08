package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.DatabaseAccess;


public class Flightregistrationc {
	
	@FXML
	public TextField firstnametf;
	public TextField lastnametf;
	public TextField sourcetf;
	public TextField destinationtf;
	public TextField flightntf;
	public TextField dobtf;
	public TextField flightnumtf;
	public TextField pricetf;
	public TextField passnumtf;
	
	public void setBtn(ActionEvent ae) {
		BookingDetails d = new BookingDetails(firstnametf.getText(), lastnametf.getText(),Integer.parseInt(dobtf.getText()), sourcetf.getText(), destinationtf.getText(), flightntf.getText(),Integer.parseInt(flightnumtf.getText()),  Integer.parseInt(passnumtf.getText()),    Double.parseDouble(pricetf.getText()));
		DatabaseAccess.addFlightDetails(d);
	}

	

}
