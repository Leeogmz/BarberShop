/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.DAO.AgendamentoDAO;
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
    
}
