import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    Button btOk = new Button ("OK");
    Scene scene = new Scene(btOk,200,250);
    primaryStage.setTitle("My Java FX");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    Stage stage = new Stage();
    stage.setTitle("Second Stage");
    stage.setScene(new Scene(new Button("new Scene"),500,600));
    stage.show();
    
  }

}
