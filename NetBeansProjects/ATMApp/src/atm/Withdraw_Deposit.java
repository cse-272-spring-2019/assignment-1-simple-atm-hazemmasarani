package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Withdraw_Deposit {
    Stage stage;
    private Scene with_Dep;
    Home home;
    AccountHandel handelAccount1 = new AccountHandel();
    
    public Withdraw_Deposit(Stage stage) {
        this.stage = stage;
    }
    
    public void prepareScene(){
        Label messagelabel = new Label(" ");
        Label displaynumlabel = new Label("");
        Button button_1 = new Button("1");
        Button button_2 = new Button("2");
        Button button_3 = new Button("3");
        Button button_4 = new Button("4");
        Button button_5 = new Button("5");
        Button button_6 = new Button("6");
        Button button_7 = new Button("7");
        Button button_8 = new Button("8");
        Button button_9 = new Button("9");
        Button button_0 = new Button("0");
        Button backbutton = new Button("Back");
        Button withdrawbutton = new Button("Withdraw");
        Button erase = new Button("C");
        
        
        GridPane with_Depgrid = new GridPane();
        
        with_Depgrid.add(messagelabel,1,0,10,1);
        with_Depgrid.add(displaynumlabel,1,1,10,1);
        with_Depgrid.add(button_1,1,2);
        with_Depgrid.add(button_2,2,2);
        with_Depgrid.add(button_3,3,2);
        with_Depgrid.add(button_4,1,3);
        with_Depgrid.add(button_5,2,3);
        with_Depgrid.add(button_6,3,3);
        with_Depgrid.add(button_7,1,4);
        with_Depgrid.add(button_8,2,4);
        with_Depgrid.add(button_9,3,4);
        with_Depgrid.add(button_0,2,5);
        with_Depgrid.add(erase,1,5);
        with_Depgrid.add(backbutton,0,6);
        with_Depgrid.add(withdrawbutton,4,6);
        
        with_Dep = new Scene(with_Depgrid,500,400);
        
        with_Depgrid.setHgap(20);
        with_Depgrid.setVgap(20);
        
        backbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                messagelabel.setText("");
                displaynumlabel.setText("");
                handelAccount1.withoutChangeHistory();
                stage.setScene(home.getscene());
            }
         });
        
        button_1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"1");
            }
         });
        button_2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"2");
            }
         });
        button_3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"3");
            }
         });
        button_4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"4");
            }
         });
        button_5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"5");
            }
         });
        button_6.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"6");
            }
         });
        button_7.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"7");
            }
         });
        button_8.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"8");
            }
         });
        button_9.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"9");
            }
         });
        button_0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String old = displaynumlabel.getText();
                displaynumlabel.setText(old+"0");
            }
         });
        
        erase.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                displaynumlabel.setText("");
            }
         });
        
        withdrawbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                int amount = Integer.parseInt(displaynumlabel.getText());
                int balance = handelAccount1.withdrawCheck();
                if(amount<balance){
                    handelAccount1.withdraw(amount);
                    messagelabel.setText("Succsessfully withdraw");
                }
                else
                    messagelabel.setText("Error you only have : " + balance);
                
                
                
            }
         });
    }
    
    
    
    public Scene getscene(){
        return with_Dep;
    }
    
    public void setHome(Home home) {
        this.home = home;
    }
}
