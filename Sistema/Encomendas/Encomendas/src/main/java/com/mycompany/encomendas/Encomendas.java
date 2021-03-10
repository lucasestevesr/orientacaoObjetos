/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encomendas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Encomendas {
    
    
    String tipoRefeicao;
    String turno;

    
    public static void main(String[] args) {
        
        Encomendas encomendas = new Encomendas();
        
        String diaSemana;
        String turno;
                
        String opcoesDia[] = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
        String opcoesTurno[] = {"Café da Manhã", "Almoço", "Jantar"};
        
        diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
        
    }
}
