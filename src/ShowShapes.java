import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowShapes extends Application
{

  public static void main(String[] args)
  {
    Application.launch(args);

  }

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Pane pane = new Pane();
    pane.setPadding(new Insets(5));

    Text text1 = new Text(20, 20, "Programming is Fun");
    text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    pane.getChildren().add(text1);
    
    Text text2 = new Text(60,60,"Programing is fun\n Display Text");
    pane.getChildren().add(text2);
    
    Text text3 = new Text(10,100, "Programing is fun\n Display Text");
    text3.setFill(Color.RED);
    text3.setUnderline(true);
    text3.setStrikethrough(true);
    pane.getChildren().add(text3);
    
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Show Text");
    primaryStage.setScene(scene);
    primaryStage.show();

    
    Stage stage2 = new Stage();
    Scene scene2 = new Scene(new LinePane(),200,200);
    stage2.setScene(scene2);
    stage2.setTitle("Show Line");
    stage2.show();
    
    Pane pane2 = new Pane();
    
    Rectangle r1 = new Rectangle(25,10,60,30);
    r1.setStroke(Color.BLACK);
    r1.setFill(Color.WHITE);
    pane2.getChildren().add(new Text(10,27,"r1"));
    pane2.getChildren().add(r1);
    
    Rectangle r2 = new Rectangle(25,50,60,30);
    //r2.setStroke(Color.BLACK);
    //r2.setFill(Color.WHITE);
    pane2.getChildren().add(new Text(10,67,"r2"));
    pane2.getChildren().add(r2);
    
    Rectangle r3 = new Rectangle(25,90,60,30);
    //r3.setStroke(Color.BLACK);
    //r3.setFill(Color.WHITE);
    r3.setArcWidth(15);
    r3.setArcHeight(25);
    pane2.getChildren().add(new Text(10,107,"r3"));
    pane2.getChildren().add(r3);
    
    for (int i=0;i<4;i++)
    {
      Rectangle r = new Rectangle(100,50,100,30);
      r.setRotate(i*360/8);
      r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
      r.setFill(Color.color(Math.random(), Math.random(), Math.random()));
      pane2.getChildren().add(r);
    }
      
    Stage stage3 = new Stage();
    Scene scene3 = new Scene(pane2,250,150);
    stage3.setTitle("Rectangles");
    stage3.setScene(scene3);
    stage3.show();
    
    Pane pane6 = new Pane();
    
    Polygon polygon = new Polygon();
    pane6.getChildren().add(polygon);
    polygon.setFill(Color.GREEN);
    polygon.setStroke(Color.BLACK);
    
    ObservableList<Double> list= polygon.getPoints();
    
    final double WIDTH = 200, HEIGHT = 200;
    double centerX = WIDTH/2, centerY = HEIGHT/2;
    double radius = Math.min(WIDTH, HEIGHT) * 0.4;
    
    
    for (int i=0;i<6;i++)
    {
      list.add(centerX + radius * Math.cos(2*i*Math.PI/6));
      list.add(centerY - radius * Math.sin(2*i*Math.PI/6));
    }
    
    Scene scene6 = new Scene(pane6,WIDTH,HEIGHT);
    Stage stage6 = new Stage();
    stage6.setScene(scene6);
    stage6.show();
  }

}

class LinePane extends Pane
{
  public LinePane ()
  {
    Line line1 = new Line(10,10,10,10);
    line1.endXProperty().bind(widthProperty().subtract(10));
    line1.endYProperty().bind(heightProperty().subtract(10));
    line1.setStrokeWidth(5);
    line1.setStroke(Color.GREEN);
    getChildren().add(line1);
    
    Line line2 = new Line(10,10,10,10);
    line2.startXProperty().bind(widthProperty().subtract(10));
    line2.endYProperty().bind(heightProperty().subtract(10));
    line2.setStrokeWidth(5);
    line2.setStroke(Color.GREEN);
    getChildren().add(line2);
  }
}
