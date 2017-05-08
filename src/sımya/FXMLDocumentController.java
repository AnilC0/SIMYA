/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sımya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;


/**
 *
 * @author ANIL
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TabPane AnaEkran;
    @FXML private GridPane GridProfilim, GridFirmalar, GridLogin;
    @FXML private SplitPane SplitAyarlar;
    @FXML private Tab Anasayfa, Profilim, İşler, Firmalar, Mesajlarım, Ayarlar, Çıkış;
    @FXML private Button btnGirisGirisyap;
    @FXML private Button btnCikisCikisyap;
        
    public void handleButtonAction(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        if(event.getSource()==btnGirisGirisyap){
            //get reference to the button's stage         
            stage=(Stage) btnGirisGirisyap.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        }
        else{
            stage=(Stage) btnCikisCikisyap.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        }
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
