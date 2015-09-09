/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcriacaoclassejava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo
 */
public class JavaFXCriacaoClasseJava extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        stage.getIcons().add(new Image("/img/logo.png"));
        
        stage.centerOnScreen();
        stage.resizableProperty().set(false);
        stage.setTitle("UTFPR - Ilustrador de classes na linguagem Java");
        stage.show();
        
        Mensagem msg = new Mensagem();
        msg.alertaErro("Seja bem vindo(a)!","Olá! Seja bem vindo(a) ao ilustrador de classes na linguagem java."
                + " Este aplicativo, tem como objetivo, auxiliar o aprendizado da criação de classes em java junto ao seu respectivo diagrama de classes.");
        
        
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
