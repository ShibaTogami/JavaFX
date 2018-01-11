import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MyJavaFx extends Application
{



  public static void main(String[] args)
  {
    Application.launch(args);
  }

   
  @Override
  public void start(Stage primaryStage) throws Exception
  {
        
    StackPane pane = new StackPane();
    Button bt = new Button("StackPane");
    pane.getChildren().add(bt);
    bt.rotateProperty().bind(pane.widthProperty());
    Scene scene = new Scene(pane,200,50);
    primaryStage.setTitle("StackPane Demo");
    primaryStage.setScene(scene);;
    primaryStage.show();
    
    Stage stage = new Stage();
    stage.setTitle("Second Stage");
    stage.setScene(new Scene(new Button("new Scene"),500,600));
    stage.show();
    
    Pane pane1 = new Pane();
    Stage stage2 = new Stage();
    Circle circle = new Circle();
    circle.centerXProperty().bind(pane1.widthProperty().divide(2));
    circle.centerYProperty().bind(pane1.heightProperty().divide(2));
    circle.radiusProperty().bind(pane1.heightProperty().multiply(0.4));
    circle.setStyle("-fx-stroke: lightpink; -fx-fill: lightblue;");
    
    Font font1 = Font.font("Times New Roman",FontWeight.BOLD, 12);
    Font font3 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC,12.5);
    
    Label label = new Label("JavaFX");
    label.setFont(font3);
     
    
    pane1.getChildren().addAll(circle,label);
    Scene scene2 = new Scene(pane1,200,200);
    stage2.setTitle("Show Circle");
    stage2.setScene(scene2);
    stage2.show();
    
    Stage stage3 = new Stage();
    Pane pane5 = new HBox(10);
    pane5.setPadding(new Insets(5,5,5,5));
    Image image = new Image("https://yt3.ggpht.com/-VYqN65R4ICs/AAAAAAAAAAI/AAAAAAAAAAA/a-x5yyDzCJU/s100-c-k-no-mo-rj-c0xffffff/photo.jpg");
    pane5.getChildren().add(new ImageView(image));
    
    ImageView imageView2 = new ImageView(image);
    imageView2.setFitHeight(70);
    imageView2.setFitWidth(70);
    pane5.getChildren().add(imageView2);
    
    ImageView imageView3 = new ImageView(image);
    imageView3.setRotate(90);
    pane5.getChildren().add(imageView3);
    
    Scene scene6 = new Scene(pane5);
    stage3.setTitle("Show Image");
    stage3.setScene(scene6);
    stage3.show();
    
  }

}
