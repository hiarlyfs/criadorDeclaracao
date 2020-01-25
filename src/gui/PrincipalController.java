package gui;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.json.simple.JSONObject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class PrincipalController implements Initializable {
	JSONObject obj = new JSONObject();

	@FXML
	private TextField nomeAluno;

	@FXML
	private TextField dataNascimento;

	@FXML
	private TextField nomePai;

	@FXML
	private TextField nomeMae;

	@FXML
	private Button gerarDeclaracao;

	@FXML
	private ComboBox<String> serieCursou;

	public void onBtAction(ActionEvent event) throws IOException {
		obj.put("nomeAluno", nomeAluno.getText());
		obj.put("dataNascimento", dataNascimento.getText());
		obj.put("nomePai", nomePai.getText());
		obj.put("nomeMae", nomeMae.getText());
		obj.put("serieCursou", serieCursou.getValue());
		FileWriter file = new FileWriter("arquivo.json");
		file.write(obj.toJSONString());
		file.flush();
		file.close();
		Runtime.getRuntime().exec("python3 main.py");
		Runtime.getRuntime().exec("libreoffice " + nomeAluno.getText().toUpperCase().replaceAll(" ",  "_") + ".docx");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<String> series = new ArrayList<String>();
		series.add("PRÉ I");
		series.add("PRÉ II");
		series.add("1º Ano do Ensino Fundamental I");
		series.add("2º Ano do Ensino Fundamental I");
		series.add("3º Ano do Ensino Fundamental I");
		series.add("4º Ano do Ensino Fundamental I");
		series.add("5º Ano do Ensino Fundamental I");
		serieCursou.setStyle("-fx-font: 16px \"Calibre\";");
		serieCursou.setStyle("-fx-font-weight: bold");
		ObservableList<String> listSeries = FXCollections.observableArrayList(series);
		serieCursou.getItems().addAll(listSeries);
	}
}
