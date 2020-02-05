package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewContoller {
	
	@FXML
	private Button btTest;
	@FXML
	private Label lbTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Então toma!"); 
	}
	

}
