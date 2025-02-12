import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextArea notesArea = new TextArea();
        notesArea.setPromptText("Start typing your notes...");
        VBox root = new VBox(notesArea);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Smart Notes");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}