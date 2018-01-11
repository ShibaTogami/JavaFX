import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowPanes extends Application
{

  public static void main(String[] args)
  {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    pane.setHgap(5);
    pane.setVgap(5);

    pane.getChildren().addAll(new Label("First Name"), new TextField(), new Label("MI: "));
    TextField tfMi = new TextField();
    tfMi.setPrefColumnCount(1);
    pane.getChildren().addAll(tfMi, new Label("Last Name"), new TextField());

    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Show Flow Pane");
    primaryStage.show();

    GridPane pane1 = new GridPane();
    Stage stage1 = new Stage();
    pane1.setAlignment(Pos.CENTER);
    pane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane1.setHgap(5.5);
    pane1.setVgap(5.5);

    pane1.add(new Label("First Name"), 0, 0);
    pane1.add(new TextField(), 1, 0);
    pane1.add(new Label("Mi"), 0, 1);
    pane1.add(new TextField(), 1, 1);
    pane1.add(new Label("Last Name"), 0, 2);
    pane1.add(new TextField(), 1, 2);
    Button btAdd = new Button("Add Name");
    pane1.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);

    Scene scene1 = new Scene(pane1, 200, 250);
    stage1.setTitle("Show Grid Pane");
    stage1.setScene(scene1);
    stage1.show();

    Stage stage3 = new Stage();
    BorderPane bpane = new BorderPane();

    bpane.setTop(getHBox());
    bpane.setLeft(getVBox());
    
    Scene scene4 = new Scene(bpane);
    stage3.setTitle("Show HBox VBox");
    stage3.setScene(scene4);
    stage3.show();
  }

  private HBox getHBox()
  {
    HBox hbox = new HBox(15);
    hbox.setPadding(new Insets(15));
    hbox.setStyle("-fx-background-color: gold");
    hbox.getChildren().add(new Button("Computer Science"));
    hbox.getChildren().add(new Button("Chemistry"));
    ImageView imageView = new ImageView(new Image(
        "https://yt3.ggpht.com/-VYqN65R4ICs/AAAAAAAAAAI/AAAAAAAAAAA/a-x5yyDzCJU/s100-c-k-no-mo-rj-c0xffffff/photo.jpg"));
    hbox.getChildren().add(imageView);
    return hbox;
  }

  private VBox getVBox()
  {
    VBox vbox = new VBox(15);
    vbox.setPadding(new Insets(15,5,5,5));
    vbox.getChildren().add(new Label("Courses: "));
    
    Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};
    for (Label course:courses)
    {
      VBox.setMargin(course, new Insets(0,0,0,15));
      vbox.getChildren().add(course);
    }
    
    return vbox;
  }
}
