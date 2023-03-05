/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Models.Usuario;
import View.Login;

/**
 *
 * @author leona
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view ) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema (){
        //Pegar um usuario da view
        Usuario usuario = helper.obterModelo();
    
    
    
    
    }
    
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei e fiz tarefa");
    }
    
    
    
}
