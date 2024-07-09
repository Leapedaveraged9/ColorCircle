import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleColorChange extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, Color.WHITE);

        circle.setOnMousePressed(event -> handleMousePressed(event, circle));
        circle.setOnMouseReleased(event -> handleMouseReleased(event, circle));

        StackPane root = new StackPane(circle);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleMousePressed(MouseEvent event, Circle circle) {
        circle.setFill(Color.BLACK);
    }

    private void handleMouseReleased(MouseEvent event, Circle circle) {
        circle.setFill(Color.WHITE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
