/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;
import ufjf.dcc025.monitoramentoru.model.AgendarRefeicao;
import ufjf.dcc025.monitoramentoru.model.EncomendarRefeicao;
import ufjf.dcc025.monitoramentoru.model.Prioridade;
import ufjf.dcc025.monitoramentoru.model.Refeicao;

/**
 *
 * @author tawan
 */
public class RefeicaoController {
    
//    public static LinkedList<Refeicao> refeicoes = new LinkedList();

    public boolean cadastrarRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario){
        if (diaSemana != null && turnoRefeicao != null && horario != null) {
            
            switch (tipo) {
                case ("Agendamento") -> {
                    Refeicao agendarRefeicao = new AgendarRefeicao(diaSemana, turnoRefeicao, horario);
                    BancoDeDadosUsuario.getRefeicoes().add(agendarRefeicao);
                    JOptionPane.showMessageDialog(null, BancoDeDadosUsuario.getRefeicoes().size() + " refeições agendadas");
                    Prioridade prioridade = new Prioridade();
                    prioridade.VerificaPrioridade();
                    
                    
                }
                case ("Encomenda") -> {
                    Refeicao encomendarRefeicao = new EncomendarRefeicao(diaSemana, turnoRefeicao, horario);
                    BancoDeDadosUsuario.getRefeicao().add(encomendarRefeicao);
                }
                default -> {
                    System.out.println("Tipo de Usuário inválido.");
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
}
