package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm {
    Stage stage;
    private final int id = 5584;
    private Scene loginscene;
    Home home;

    public LoginForm(Stage stage) {
        this.stage = stage;
    }
    
    
    
    public void prepareScene(){
        Label passwordlabel = new Label("Enter your ID : ");
        Label outputlabel = new Label();
        PasswordField idpassowrdfield = new PasswordField();
        Button loginbutton = new Button("Login");
        
        GridPane logingrid = new GridPane();
        
        logingrid.add(passwordlabel,0, 0);
        logingrid.add(idpassowrdfield, 1, 0);
        logingrid.add(outputlabel, 1, 1);
        logingrid.add(loginbutton, 1, 2);
        
        logingrid.setHgap(10);
        logingrid.setVgap(10);
        
        loginscene = new Scene(logingrid,500,400);
        
        loginbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                int writtenid = Integer.parseInt(idpassowrdfield.getText());
                idpassowrdfield.setText("");
                if(writtenid == id){
                    outputlabel.setText("welcome");
                    stage.setScene(home.getscene());
                }
                else
                    outputlabel.setText("You Entered Wrong ID Number");
            }
            
        });
    }
    public Scene getscene(){
        return this.loginscene;
    }
   
    public void setHome(Home home) {
        this.home = home;
    }
    
    
    
}
