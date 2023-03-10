/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;

/**
 *
 * @author leona
 */
public class Main {
    
    public static void main(String[] args) {
        Servico servico = new Servico(1,"Barba",20); 
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente = new Cliente (1, "Leonardo", "Rua teste","1234545");
        
        System.out.println(cliente.getNome());
        
        
        Usuario usuario = new Usuario(2, "Barbeiro", "1234", "2");
        
                System.out.println(usuario.getNome());
                
                
                
        Agendamento agendamento = new Agendamento (1, cliente, servico, 30, "06/03/2023 11:17" , "Obeservacao");        
        
        
        System.out.println(agendamento.getCliente().getNome());

        
    }
    
}
