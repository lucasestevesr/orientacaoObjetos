/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encomendarrefeicao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class EncomendarRefeicao {
    private ArrayList <Refeicao> refeicao;
    
    EncomendarRefeicao(){
        refeicao = new ArrayList();
    }
    
    public void encomendar(Refeicao r) {
        refeicao.add(r);
    }

    public void cancelar(Refeicao r) {
        refeicao.remove(r);
    }
    
    public static void main(String[] args) {
        
        EncomendarRefeicao a = new EncomendarRefeicao();
        EncomendarRefeicao b = new EncomendarRefeicao();
        String opcoesDia[] = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
        String opcoesTurno[] = {"Café da Manhã", "Almoço", "Jantar"};
        String opcoesHorario[] = {"11:00 às 11:30", "11:30 às 12:00", "12:00 às 12:30", "12:30 às 13:00", "13:00 às 13:30", "13:30 às 14:00"};
        String opcoesTipo[] = {"Principal", "Vegetariano"};
        
        String diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        String turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
        String horario = (String) JOptionPane.showInputDialog(null, "Escolha um horario da refeicao", "Horario da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesHorario, opcoesHorario[0]);
        String tipo = (String) JOptionPane.showInputDialog(null, "Escolha um tipo da refeicao", "Tipo da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTipo, opcoesTipo[0]);
        
        a.encomendar(new Refeicao (diaSemana, turno, horario, tipo));
        
        diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
        horario = (String) JOptionPane.showInputDialog(null, "Escolha um horario da refeicao", "Horario da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesHorario, opcoesHorario[0]);
        tipo = (String) JOptionPane.showInputDialog(null, "Escolha um tipo da refeicao", "Tipo da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTipo, opcoesTipo[0]);

        b.encomendar(new Refeicao (diaSemana, turno, horario, tipo));
        
    }

}
