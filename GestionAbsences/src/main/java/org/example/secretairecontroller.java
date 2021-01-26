package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

    public class ServiceSecretaire {

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="text_area"
        private TextArea text_area; // Value injected by FXMLLoader

        @FXML // fx:id="id_email"
        private TableColumn<?, ?> id_email; // Value injected by FXMLLoader

        @FXML // fx:id="id_nom"
        private TableColumn<?, ?> id_nom; // Value injected by FXMLLoader

        @FXML // fx:id="text_type"
        private TextField text_type; // Value injected by FXMLLoader

        @FXML // fx:id="text_enr"
        private Button text_enr; // Value injected by FXMLLoader

        @FXML // fx:id="text_nom"
        private TextField text_nom; // Value injected by FXMLLoader

        @FXML // fx:id="id_type"
        private TableColumn<?, ?> id_type; // Value injected by FXMLLoader

        @FXML // fx:id="test_justification"
        private ComboBox<?> test_justification; // Value injected by FXMLLoader

        @FXML // fx:id="id_table"
        private TableView<?> id_table; // Value injected by FXMLLoader

        @FXML // fx:id="id_justification"
        private TableColumn<?, ?> id_justification; // Value injected by FXMLLoader

        @FXML // fx:id="text_email"
        private TextField text_email; // Value injected by FXMLLoader

        @FXML
        void 527fcd(ActionEvent event) {

        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert text_area != null : "fx:id=\"text_area\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert id_email != null : "fx:id=\"id_email\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert id_nom != null : "fx:id=\"id_nom\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert text_type != null : "fx:id=\"text_type\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert text_enr != null : "fx:id=\"text_enr\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert text_nom != null : "fx:id=\"text_nom\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert id_type != null : "fx:id=\"id_type\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert test_justification != null : "fx:id=\"test_justification\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert id_table != null : "fx:id=\"id_table\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert id_justification != null : "fx:id=\"id_justification\" was not injected: check your FXML file 'secretaire.fxml'.";
            assert text_email != null : "fx:id=\"text_email\" was not injected: check your FXML file 'secretaire.fxml'.";

        }
    }


}
