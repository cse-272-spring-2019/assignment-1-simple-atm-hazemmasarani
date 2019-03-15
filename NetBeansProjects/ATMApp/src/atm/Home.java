package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Home {
    Stage stage;
    private Scene homescene;
    LoginForm login;
    Withdraw_Deposit with_dep;
    Deposit deposit;
    AccountHandel handelAccount1 = new AccountHandel();
    
    public Home(Stage stage) {
        this.stage = stage;
    }

    public void prepareScene(){
        Label balancelabel = new Label("");
        Label historylabel = new Label("");
        Button withdrawbutton = new Button("Withdraw");
        Button depositbutton = new Button("Deposit");
        Button balancebutton = new Button("BalanceInequity");
        Button forwordbutton = new Button("Forword");
        Button backwordbutton = new Button("Backword");
        Button logoutbutton = new Button("Logout");
        
        GridPane homegrid = new GridPane();
        
        homegrid.add(withdrawbutton,1,0);
        homegrid.add(depositbutton,1,1);
        homegrid.add(balancebutton,1,2);
        homegrid.add(forwordbutton,2,3);
        homegrid.add(backwordbutton,0,3);
        homegrid.add(balancelabel,2,2);
        homegrid.add(historylabel,1,3);
        homegrid.add(logoutbutton,0,0);
        
        homegrid.setHgap(100);
        homegrid.setVgap(100);
        
        homescene = new Scene(homegrid,500,400);
        
        backwordbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                historylabel.setText(handelAccount1.getOldHistoryBack());
            }
         });
        
        forwordbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                historylabel.setText(handelAccount1.getOldHistoryFor());
            }
         });
        
        
         logoutbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                balancelabel.setText("");
                stage.setScene(login.getscene());
            }
         });
         
         withdrawbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                balancelabel.setText("");
                stage.setScene(with_dep.getscene());
            }
         });
         
         depositbutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                balancelabel.setText("");
                stage.setScene(deposit.getscene());
            }
         });
         
         
         balancebutton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                balancelabel.setText("Balance is : " + handelAccount1.balanceinequity());
            }
         });
    }
    
    public Scene getscene(){
        return this.homescene;
    }
    
    public void setLogin(LoginForm login) {
        this.login = login;
    }

    public void setWith_dep(Withdraw_Deposit with_dep) {
        this.with_dep = with_dep;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }
    
    
}
