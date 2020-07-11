
package org.giancarlocifuentes.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.giancarlocifuentes.sistema.Principal;


public class MenuPrincipalController implements Initializable{
    private Principal escenarioPrincipal;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
   }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

   
}