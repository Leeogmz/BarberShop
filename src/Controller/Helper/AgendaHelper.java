/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Agendamento;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leona
 */
public class AgendaHelper {

    public AgendaHelper(View.Agenda view) {
        this.view = view;
    }
    
    private final Agenda view;

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
    DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
    tableModel.setNumRows(0);
    
    
    //Percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServico().getDescricao(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getHoraFormatada(),
            agendamento.getObservacao(),
            });            
        }
    
    }
    
    
   
    
}
