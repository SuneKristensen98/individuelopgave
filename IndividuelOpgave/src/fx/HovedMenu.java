package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.Properties;
import logic.PropertiesImpl;
import logic.PropertiesFactory;


public class HovedMenu extends Application {
	Label response;
	TextField tf;
	Stage window;
	Scene Hovedmenu;

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		Label label0 = new Label("Individuel Opgave");
		Button btnGem = new Button("Gem");
		
		Label label1 = new Label("Key : ");
		TextField tfKey = new TextField();
		tfKey.setMaxWidth(200);
		Label label2 = new Label("Value : ");
		TextField tfValue = new TextField();
		tfValue.setMaxWidth(200);
		btnGem.setPrefSize(100, 20);

		Button btnSlet = new Button("Slet");
		btnSlet.setPrefSize(100, 20);

		Button btnHent = new Button("Hent");
		btnHent.setPrefSize(100, 20);
		
		
		Label hentProperty = new Label("");
		VBox layout0 = new VBox(20);
		layout0.setAlignment(Pos.CENTER);
		layout0.getChildren().addAll(label0, label1, tfKey, label2, tfValue, hentProperty, btnGem, btnSlet, btnHent);
		Hovedmenu = new Scene(layout0, 800, 600);
		window.setScene(Hovedmenu);
		window.show();

		btnGem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				new PropertiesFactory();
				Properties property = PropertiesFactory.makeProperties();
				getProperty(tfKey);
				Properties property = property.hent(tfKey.getProperty());
				if (ven != null) {
					hentProperty.setProperty(property.toString());
				} else
					hentProperty.setText("Prøv igen");

			}
		});

		btnHent.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				new PropertiesFactory();
				Properties property = PropertiesFactory.makeProperties();
				getProperty(tfKey);
				Properties property = property.hent(tfKey.getProperty());
				if (ven != null) {
					hentProperty.setProperty(Property.toString());
				} else
					hentProperty.setText("Prøv igen");

			}
		});
		
		btnSlet.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				new PropertiesFactory();
				Properties property = PropertiesFactory.makeProperties();
				getProperty(tfKey);
				Properties property = property.hent(tfKey.getProperty());
				if (ven != null) {
					hentPerson.setText(ven.toString());
				} else
					hentPerson.setText("Prøv igen");

			}
		});
		
		
		
		
		
	}
}
