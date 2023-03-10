/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author leona
 */
public class AgendaHelper implements IHelper {

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

    public void preencherClientes (ArrayList<Cliente> clientes) {
    DefaultComboBoxModel comboBox = (DefaultComboBoxModel) view.getTextCliente().getModel();
    
        for (Cliente cliente : clientes) {
            comboBox.addElement(cliente);
        }
    
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxServico = (DefaultComboBoxModel) view.getTextServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxServico.addElement(servico);            
        }          
    }
    
    public Cliente obterCliente(){
    return (Cliente) view.getTextCliente().getSelectedItem();
    
    }
    
    public Servico obterServico(){
    return (Servico) view.getTextServico().getSelectedItem();
    
    }

    public void setarValor(float valor) {
     view.getTextValor().setText(valor + "");
    }

    @Override
    public Object obterModelo() {
        
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        
        Cliente cliente = obterCliente();
        
        Servico servico = obterServico();
        
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();        
        String dataHora = data + " " + hora;
        
        String observacao = view.getTextObservacao().getText();       
                  
        Agendamento agendamento = new Agendamento (id, cliente, servico, valor, dataHora, observacao);
        
        return agendamento;
    
    
    }

    @Override
    public void limparTela() {
        
      view.getTextId().setText("0");      
      view.getTextValor().setText("");     
      view.getTextFormatedData().setText("");
      view.getTextFormatedHora().setText("");        
      view.getTextObservacao().setText("");
        
        
    }
    
    
    
}
