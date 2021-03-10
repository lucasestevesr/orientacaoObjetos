/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendarrefeicao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author tawan
 */
public class AgendarRefeicao{
    
    private ArrayList <Refeicao> refeicao;
    
    AgendarRefeicao(){
        refeicao = new ArrayList();
    }
    
    public void agendar(Refeicao r) {
        refeicao.add(r);
    }

    public void cancelar(Refeicao r) {
        refeicao.remove(r);
    }
    
    public static void main(String[] args) {
        
        AgendarRefeicao a = new AgendarRefeicao();
        AgendarRefeicao b = new AgendarRefeicao();
        String opcoesDia[] = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
        String opcoesTurno[] = {"Café da Manhã", "Almoço", "Jantar"};
        String opcoesHorario[] = {"11:00 às 11:30", "11:30 às 12:00", "12:00 às 12:30", "12:30 às 13:00", "13:00 às 13:30", "13:30 às 14:00"};
        
        
        String diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        String turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
        String horario = (String) JOptionPane.showInputDialog(null, "Escolha um horario da refeicao", "Horario da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesHorario, opcoesHorario[0]);
        
        a.agendar(new Refeicao (diaSemana, turno, horario));
        
        diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
        horario = (String) JOptionPane.showInputDialog(null, "Escolha um horario da refeicao", "Horario da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesHorario, opcoesHorario[0]);
        
        b.agendar(new Refeicao (diaSemana, turno, horario));
        
    }

}
