package dad.primertrimestre.imc;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Cajas extends Application {
	// inicializamos campos de texto
	private TextField heightText;
	private TextField weightText;

	// inicializamos labels
	private Label heightl1;
	private Label heightl2;
	private Label weightl1;
	private Label weightl2;
	private Label weightoutcomel;
	private Label imcl1;
	private Label imcl2;

	// inicializamos las caracteristicas
	private Caracteristicas caracteristicas = new Caracteristicas();

	public void start(Stage primaryStage) throws Exception {

		// intanciamos HBOX

		HBox weightbox = new HBox();
		weightbox.setAlignment(Pos.BASELINE_CENTER);
		weightbox.setSpacing(6);

		// instanciamos las etiquetas

		weightl1 = new Label("Peso:");
		weightl1.setAlignment(Pos.CENTER_LEFT);
		weightText = new TextField();
		weightText.setPrefColumnCount(6);
		weightl2 = new Label("kg");
		weightl2.setAlignment(Pos.CENTER_RIGHT);

		// llenamos el hbox con los elementos

		weightbox.getChildren().addAll(weightl1, weightText, weightl2);

		// inicializamos hbox de la altura

		HBox heighthox = new HBox();
		heighthox.setAlignment(Pos.BASELINE_CENTER);
		heighthox.setSpacing(6);

		// etiquetas de la altura

		heightl1 = new Label("Altura:");
		heightl1.setAlignment(Pos.CENTER_LEFT);
		heightText = new TextField();
		heightText.setPrefColumnCount(6);
		heightl2 = new Label("cm");
		heightl2.setAlignment(Pos.CENTER_LEFT);

		// llenamos la hbox de la altura con las respectivas etiquetas
		heighthox.getChildren().addAll(heightl1, heightText, heightl2);

		// label imc
		imcl1 = new Label("IMC: ");
		imcl2 = new Label("Esperando que introduzcas tu peso y tu altura");

		// HBOX imc resultado
		HBox resultnumbox = new HBox(imcl1, imcl2);
		resultnumbox.setAlignment(Pos.BASELINE_CENTER);
		// resultnumbox.getChildren().addAll(imcl1, imcl2);

		// label peso
		weightoutcomel = new Label("Bajo Peso | Normal | Sobrepeso | Obeso");

		// HBOX resultado 
		HBox weightoutcome = new HBox(weightoutcomel);
		weightoutcome.setAlignment(Pos.BASELINE_CENTER);

		// ventana madre
		VBox root = new VBox(weightbox, heighthox, resultnumbox, weightoutcome);
		root.setSpacing(6);
		root.setAlignment(Pos.CENTER);
		// root.getChildren().addAll(weightbox, heighthox, resultnumbox, weightoutcome);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Calcular IMC");
		primaryStage.show();

		
	}

	public static void main(String[] args) {
		launch(args);
	}
}


