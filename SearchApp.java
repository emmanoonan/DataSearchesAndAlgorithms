package project230;
//All necessary imports
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class SearchApp extends Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        // User Interface Stuff
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = loader.load();

        PrimaryController controller = loader.getController();
        controller.setMainApp(this);

        TextField search = new TextField();
        
        Button searchButton = new Button("Search");
        // Originally TextArea - had to change to TextFlow to use links
        TextFlow results = new TextFlow();
        // When searchbutton is clicked, a new stage is set with all of the links that are related to the query
searchButton.setOnAction(event -> {
    controller.handleSearch();
});

        // Layout - VBox is a container puts all of its children (search, searchButton, results) in vertically
        VBox layout = new VBox(10, search, searchButton, results);
        layout.setStyle("-fx-padding: 10px;");

        scene = new Scene(root, 640,480);
        stage.setScene(scene);
        stage.setTitle("Data Searches and Algorithms");
        stage.show();
    }
//launch method
    public static void main(String[] args) {
        launch();
    }

}