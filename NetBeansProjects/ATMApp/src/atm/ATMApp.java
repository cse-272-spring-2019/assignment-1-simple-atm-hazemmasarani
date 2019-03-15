package atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class ATMApp extends Application {
    
    public static void main (String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ATM");
        
        
        LoginForm login = new LoginForm(primaryStage);
        Home home = new Home(primaryStage);
        Withdraw_Deposit with_Dep = new Withdraw_Deposit(primaryStage);
        Deposit deposit = new Deposit(primaryStage);
        
        login.prepareScene();
        home.prepareScene();
        with_Dep.prepareScene();
        deposit.prepareScene();
        
        login.setHome(home);
        home.setLogin(login);
        with_Dep.setHome(home);
        home.setWith_dep(with_Dep);
        home.setDeposit(deposit);
        deposit.setHome(home);
        
        
        primaryStage.setScene(login.getscene());
        primaryStage.show();
    }
}
