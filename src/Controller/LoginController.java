/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import View.Login;
import View.MenuPrincipal;

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
        
        //Busca Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuario da View tiver o mesmo usuario e senha que o usuario vindo do banco direcionar para o menu
        if(usuarioAutenticado != null){
        //navegar para menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
        } else {
            view.exibeMensagem("Usuario ou senha inválidos");
        }
        
    
    
    
    
    }
    
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei e fiz tarefa");
    }
    
    
    
}
