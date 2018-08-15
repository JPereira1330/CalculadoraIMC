package view;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ImcController {
	
	@FXML TextField txNome;
	@FXML TextField txPeso;
	@FXML TextField txAltura;
	@FXML TextField txResultado;
	@FXML RadioButton rdMasc;
	@FXML RadioButton rdFemi;
	
	@FXML
	public void calculaIMC(){
		
		String text;
		double peso = Double.parseDouble(txPeso.getText());
		double altura = Double.parseDouble(txAltura.getText());
		double imc = peso / ( altura * altura );
		
		if (rdMasc.isSelected()) 
			text = "Senhor "+txNome.getText()+" seu IMC é de: ";
		else
			text = "Senhora "+txNome.getText()+" seu IMC é de: ";
			
		txResultado.setText(text+imc);
	
	}
	
	@FXML
	public void limparTela() {
		txPeso.setText("");
		txAltura.setText("");
		txResultado.setText("");
		txNome.setText("");
	}
}
