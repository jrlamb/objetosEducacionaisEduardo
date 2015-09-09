/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcriacaoclassejava;

import javafx.scene.control.Alert;

/**
 *
 * @author Eduardo
 */
public class Mensagem {

    public void alertaErro(String titulo, String mensagem){
    
        Alert dialogoErro = new Alert(Alert.AlertType.INFORMATION);
        dialogoErro.setTitle(mensagem);
        dialogoErro.setHeaderText(titulo);
        dialogoErro.setContentText(mensagem);
        dialogoErro.showAndWait();
    
    }
    
    
}
