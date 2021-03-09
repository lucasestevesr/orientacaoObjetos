/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardapio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class Cardapio {
           
    String diaSemana;
    String turno;
    String[][] cardapioCafe = new String[5][5];
    String[][] cardapioAlmoco = new String[7][8];
    String[][] cardapioJanta = new String[5][5];
    
    
    public void declarar() {
        
        // Declarando almoço
        // Colunas
        cardapioAlmoco[0][0] = "Prato Principal";
        cardapioAlmoco[0][1] = "Opcao";
        cardapioAlmoco[0][2] = "Guarnicao";
        cardapioAlmoco[0][3] = "Macarrão";
        cardapioAlmoco[0][4] = "Arroz";
        cardapioAlmoco[0][5] = "Feijão";
        cardapioAlmoco[0][6] = "Sopa";
        cardapioAlmoco[0][7] = "Sobremesa";

        // Segunda
        cardapioAlmoco[1][0] = "Strogonoff de Frango";
        cardapioAlmoco[1][1] = "Croquete de Lentiha";
        cardapioAlmoco[1][2] = "Batata Palha";
        cardapioAlmoco[1][3] = "Ervas";
        cardapioAlmoco[1][4] = "Branco e Integral";
        cardapioAlmoco[1][5] = "Preto";
        cardapioAlmoco[1][6] = "Caldo Verde";
        cardapioAlmoco[1][7] = "Gelatina/Melancia";

        // Terça
        cardapioAlmoco[2][0] = "Strogonoff de Frango";
        cardapioAlmoco[2][1] = "Croquete de Lentiha";
        cardapioAlmoco[2][2] = "Batata Palha";
        cardapioAlmoco[2][3] = "Ervas";
        cardapioAlmoco[2][4] = "Branco e Integral";
        cardapioAlmoco[2][5] = "Preto";
        cardapioAlmoco[2][6] = "Caldo Verde";
        cardapioAlmoco[2][7] = "Gelatina/Melancia";

        // Quarta
        cardapioAlmoco[3][0] = "Strogonoff de Frango";
        cardapioAlmoco[3][1] = "Croquete de Lentiha";
        cardapioAlmoco[3][2] = "Batata Palha";
        cardapioAlmoco[3][3] = "Ervas";
        cardapioAlmoco[3][4] = "Branco e Integral";
        cardapioAlmoco[3][5] = "Preto";
        cardapioAlmoco[3][6] = "Caldo Verde";
        cardapioAlmoco[3][7] = "Gelatina/Melancia";

        // Quinta
        cardapioAlmoco[4][0] = "Strogonoff de Frango";
        cardapioAlmoco[4][1] = "Croquete de Lentiha";
        cardapioAlmoco[4][2] = "Batata Palha";
        cardapioAlmoco[4][3] = "Ervas";
        cardapioAlmoco[4][4] = "Branco e Integral";
        cardapioAlmoco[4][5] = "Preto";
        cardapioAlmoco[4][6] = "Caldo Verde";
        cardapioAlmoco[4][7] = "Gelatina/Melancia";

        // Sexta
        cardapioAlmoco[5][0] = "Strogonoff de Frango";
        cardapioAlmoco[5][1] = "Croquete de Lentiha";
        cardapioAlmoco[5][2] = "Batata Palha";
        cardapioAlmoco[5][3] = "Ervas";
        cardapioAlmoco[5][4] = "Branco e Integral";
        cardapioAlmoco[5][5] = "Preto";
        cardapioAlmoco[5][6] = "Caldo Verde";
        cardapioAlmoco[5][7] = "Gelatina/Melancia";
        
        // Sábado
        cardapioAlmoco[6][0] = "Strogonoff de Frango";
        cardapioAlmoco[6][1] = "Croquete de Lentiha";
        cardapioAlmoco[6][2] = "Batata Palha";
        cardapioAlmoco[6][3] = "Ervas";
        cardapioAlmoco[6][4] = "Branco e Integral";
        cardapioAlmoco[6][5] = "Preto";
        cardapioAlmoco[6][6] = "Caldo Verde";
        cardapioAlmoco[6][7] = "Gelatina/Melancia";

    }
    
    public void acessar(String diaSemana, String turno ){
        
        int dia = 0;
        int t = 0;
        
        if ("Segunda-feira".equals(diaSemana)) 
            dia = 1;
        if ("Terça-feira".equals(diaSemana)) 
            dia = 2;
        if ("Quarta-feira".equals(diaSemana)) 
            dia = 3;
        if ("Quinta-feira".equals(diaSemana)) 
            dia = 4;
        if ("Sexta-feira".equals(diaSemana)) 
            dia = 5;
        if ("Sábado-feira".equals(diaSemana)) 
            dia = 6;
      
        
        if ("Almoço".equals(turno)) {
            for (int i = 0; i < 7; i++) {
                System.out.println(cardapioAlmoco[0][i] +  ": " + cardapioAlmoco[dia][i]);
            }
        }   
        if ("Café da Manhã".equals(turno)) {
            for (int i = 0; i < 7; i++) {
                System.out.println(cardapioAlmoco[0][i] +  ": " + cardapioCafe[dia][i]);
            }
        }   
        if ("Jantar".equals(turno)) {
            for (int i = 0; i < 7; i++) {
                System.out.println(cardapioAlmoco[0][i] +  ": " + cardapioJanta[dia][i]);
            }
        }   
    }
    

    public static void main(String[] args) {
        
        Cardapio cardapio = new Cardapio();
        
        String diaSemana;
        String turno;
        
        cardapio.declarar();
        
        String opcoesDia[] = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
        String opcoesTurno[] = {"Café da Manhã", "Almoço", "Jantar"};
        
        diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
        turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);

        cardapio.acessar(diaSemana, turno);
        
    }
    
}
