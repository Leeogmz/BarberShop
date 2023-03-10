/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.ClienteDAO;
import Models.DAO.ServicoDAO;
import Models.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class AgendaController {

    public AgendaController(View.Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    
    public void atualizaTabela(){ 
        
    //Buscar lista com agendamentos do banco de dados
    AgendamentoDAO agendamentoDAO = new AgendamentoDAO(); 
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();       
        
        
        //exibir essa lista na view
       helper.preencherTabela(agendamentos);
    
    }
    
    public void atualizaCliente(){
    //Busca clientes no banco
    ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibe cliente na view
        helper.preencherClientes(clientes);
    
    }
    
    
    public void atualizaServico(){
     //Busca servico no banco
     ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibe servico na view
        helper.preencherServicos(servicos);
      
    
    } 
    
    public void atualizaValor (){
    //Obter valor do servico da tela
   Servico servico = helper.obterServico();
   helper.setarValor(servico.getValor());
        
       }
    
    public void agendar(){
    //Busca objeto agendamento da tela
    Agendamento agendamento = (Agendamento) helper.obterModelo();
    
    
    
    //Salva objeto no banco de dados
    new AgendamentoDAO().insert(agendamento);
    
    //Atualiza a tabela
    atualizaTabela();
    
    helper.limparTela();
    }

    
}
