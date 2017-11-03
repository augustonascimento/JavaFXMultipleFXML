package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("Central Perth Hospital");

        BorderPane bPane = new BorderPane();
        MenuBar menuBar = new MenuBar();
        bPane.setTop(menuBar);

        // --- Menu File
        Menu menuFile = new Menu("File");
        //Items
        MenuItem iLock = new MenuItem("Lock Screen");
        MenuItem iClose = new MenuItem("Close App");
        //Add Items
        menuFile.getItems().addAll(iLock, iClose);

        // --- Menu Help
        Menu menuHelp = new Menu("Help");
        MenuItem iSupport = new MenuItem("Support Center");
        //Add Item
        menuHelp.getItems().addAll(iSupport);

        menuBar.getMenus().addAll(menuFile, menuHelp);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Pane cmdPane = fxmlLoader.load();

        bPane.setCenter(cmdPane);

        Scene scene = new Scene(bPane, 800, 600);
        window.setScene(scene);
        window.show();


    }
}

