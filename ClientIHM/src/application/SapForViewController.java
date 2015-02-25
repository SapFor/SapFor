package application;

import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author scee
 */
public class SapForViewController implements Initializable {
    @FXML
    private Tab formations;
    @FXML
    private ListView<String> listUV;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnClicFormation(Event event) {
       
ObservableList<String> items =FXCollections.observableArrayList (
    "Single", "Double", "Suite", "Family App");
listUV.setItems(items);
    }
    
}