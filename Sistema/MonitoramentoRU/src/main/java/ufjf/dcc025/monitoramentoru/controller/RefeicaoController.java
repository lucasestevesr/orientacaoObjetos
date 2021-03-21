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
    
    public boolean cadastrarRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario){
        if (diaSemana != null && turnoRefeicao != null && horario != null) {
            
            switch (tipo) {
                case ("Agendamento"): {
                    Refeicao agendarRefeicao = new AgendarRefeicao(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador(), diaSemana, turnoRefeicao, horario);
//                    BancoDeDadosUsuario.getRefeicoes().add(agendarRefeicao);
                    agendarRefeicao.adcLista(agendarRefeicao);
                    
                    int contRefeicoesUsuario = 0;
                    for (int i = 0; i < BancoDeDadosUsuario.getRefeicoes().size(); i++) {
                        if (BancoDeDadosUsuario.getRefeicoes().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())){
                            contRefeicoesUsuario++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Voce tem " + contRefeicoesUsuario + " refeições agendadas");
                    
                    Prioridade prioridade = new Prioridade();
                    prioridade.VerificaPrioridade();
                    break;
                }
                 
                case ("Encomenda"): {
                    Refeicao encomendarRefeicao = new EncomendarRefeicao(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador(), diaSemana, turnoRefeicao, horario);
                    encomendarRefeicao.adcLista(encomendarRefeicao);
                    
                    int contEncomendasUsuario = 0;
                    for (int i = 0; i < BancoDeDadosUsuario.getRefeicoes().size(); i++) {
                        if (BancoDeDadosUsuario.getEncomendas().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) {
                            contEncomendasUsuario++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Voce tem " + contEncomendasUsuario + " encomendas registradas");
                    break;
                }
                default: {
                    System.out.println("Tipo de Usuário inválido.");
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
}
