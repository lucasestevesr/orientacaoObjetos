/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.view.MostraCardapio;
import ufjf.dcc025.monitoramentoru.view.MostraCardapio;

/**
 *
 * @author arthu
 */
public class Cardapio {

    String diaSemana;
    String turno;
    String[][] cardapioCafe = new String[7][4];
    String[][] cardapioAlmoco = new String[7][8];
    String[][] cardapioJanta = new String[6][8];

    public void declarar() {

        cardapioCafe[0][0] = "Fruta: ";
        cardapioCafe[0][1] = "Bebida: ";
        cardapioCafe[0][2] = "Opção Proteica: ";
        cardapioCafe[0][3] = "Panificado: ";

        cardapioCafe[1][0] = "Banana";
        cardapioCafe[1][1] = "Café ou Chá de Canela";
        cardapioCafe[1][2] = "Leite Integral";
        cardapioCafe[1][3] = "Pão Francês";

        cardapioCafe[2][0] = "Laranja";
        cardapioCafe[2][1] = "Café ou Chá de Cidreira";
        cardapioCafe[2][2] = "Leite Integral";
        cardapioCafe[2][3] = "Pão Francês";

        cardapioCafe[3][0] = "Maça";
        cardapioCafe[3][1] = "Café ou Chá de Camomila";
        cardapioCafe[3][2] = "Leite Integral";
        cardapioCafe[3][3] = "Pão Francês";

        cardapioCafe[4][0] = "Melancia";
        cardapioCafe[4][1] = "Café ou Chá de Hortelã";
        cardapioCafe[4][2] = "Iorguete";
        cardapioCafe[4][3] = "Pão Francês";

        cardapioCafe[5][0] = "Abacaxi";
        cardapioCafe[5][1] = "Café ou Chá de Alecrim";
        cardapioCafe[5][2] = "Leite Integral";
        cardapioCafe[5][3] = "Pão Francês";

        cardapioCafe[6][0] = "Melão";
        cardapioCafe[6][1] = "Café ou Chá de Mate";
        cardapioCafe[6][2] = "Leite Integral";
        cardapioCafe[6][3] = "Pão Francês";

        // Declarando almoço
        // Colunas
        cardapioAlmoco[0][0] = "Prato Principal";
        cardapioAlmoco[0][1] = "Opção";
        cardapioAlmoco[0][2] = "Guarnição";
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

        // Declarando Jantar
        // Colunas
        cardapioJanta[0][0] = "Prato Principal: ";
        cardapioJanta[0][1] = "Opção: ";
        cardapioJanta[0][2] = "Guarnição: ";
        cardapioJanta[0][3] = "Macarrão: ";
        cardapioJanta[0][4] = "Arroz: ";
        cardapioJanta[0][5] = "Feijão: ";
        cardapioJanta[0][6] = "Sopa: ";
        cardapioJanta[0][7] = "Sobremesa: ";

        cardapioJanta[1][0] = "Carne Moída";
        cardapioJanta[1][1] = "Omelete";
        cardapioJanta[1][2] = "Polenta";
        cardapioJanta[1][3] = " - ";
        cardapioJanta[1][4] = "Branco";
        cardapioJanta[1][5] = "Preto";
        cardapioJanta[1][6] = "Batata c/ Cenoura e Frango";
        cardapioJanta[1][7] = "Mamão / Gelatina";

        cardapioJanta[2][0] = "Strogonoff de Frango";
        cardapioJanta[2][1] = "Quibe de Soja";
        cardapioJanta[2][2] = "Batata Palha";
        cardapioJanta[2][3] = " - ";
        cardapioJanta[2][4] = "Branco";
        cardapioJanta[2][5] = "Carioquinha";
        cardapioJanta[2][6] = "Fubá c/ Couve e Carne de Boi";
        cardapioJanta[2][7] = "Tangerina / Gelatina";

        cardapioJanta[3][0] = "Frango à Milanesa";
        cardapioJanta[3][1] = "Omelete";
        cardapioJanta[3][2] = "Purê de Batata";
        cardapioJanta[3][3] = " - ";
        cardapioJanta[3][4] = "Branco";
        cardapioJanta[3][5] = "Preto";
        cardapioJanta[3][6] = "Grão de Bico, Espinafre e Frango";
        cardapioJanta[3][7] = "Banana / Gelatina";

        cardapioJanta[4][0] = "Moqueca de Peixe";
        cardapioJanta[4][1] = "Bolinho de Soja";
        cardapioJanta[4][2] = "Batata Sautê";
        cardapioJanta[4][3] = " - ";
        cardapioJanta[4][4] = "Branco";
        cardapioJanta[4][5] = "Carinhoquinha batido";
        cardapioJanta[4][6] = "Cebola c/ Couve e Carne de Boi";
        cardapioJanta[4][7] = "Laranja / Gelatina";

        cardapioJanta[5][0] = "Almondega";
        cardapioJanta[5][1] = "Ovo Cozido";
        cardapioJanta[5][2] = "Quibere";
        cardapioJanta[5][3] = " - ";
        cardapioJanta[5][4] = "Branco";
        cardapioJanta[5][5] = "Preto";
        cardapioJanta[5][6] = "Inhame /c Espinafre e Frango";
        cardapioJanta[5][7] = "Maça Doce de Goiaba";

    }

    public void acessar(String diaSemana, String turno) {

        int dia = 0;
        int t = 0;

        if ("Segunda-feira".equals(diaSemana)) {
            dia = 1;
        }
        if ("Terça-feira".equals(diaSemana)) {
            dia = 2;
        }
        if ("Quarta-feira".equals(diaSemana)) {
            dia = 3;
        }
        if ("Quinta-feira".equals(diaSemana)) {
            dia = 4;
        }
        if ("Sexta-feira".equals(diaSemana)) {
            dia = 5;
        }
        if ("Sábado".equals(diaSemana)) {
            dia = 6;
        }

        MostraCardapio mostracardapio = new MostraCardapio();

        if ("Almoço".equals(turno)) {
            mostracardapio.jLabelDiaSemana.setText("Dia da Semana: ");
            mostracardapio.jLabelTurno.setText("Turno: ");
            mostracardapio.jLabelOpcaoPrincipal.setText("Prato Principal: ");
            mostracardapio.jLabelOpcaoVegetariana.setText("Opção Vegetariana: ");
            mostracardapio.jLabelGuarnicao.setText("Guarnição: ");
            mostracardapio.jLabelMacarrao.setText("Macarrão: ");
            mostracardapio.jLabelArroz.setText("Arroz: ");
            mostracardapio.jLabelFeijao.setText("Feijão: ");
            mostracardapio.jLabelSopa.setText("Sopa: ");
            mostracardapio.jLabelSobremesa.setText("Sobremesa: ");
            
            mostracardapio.jLabelRespDiaSemana.setText(diaSemana);
            mostracardapio.jLabelRespTurno.setText(turno);
            mostracardapio.jLabelRespPrincipal.setText(cardapioAlmoco[dia][0]);
            mostracardapio.jLabelRespVegetariano.setText(cardapioAlmoco[dia][1]);
            mostracardapio.jLabelRespGuarnicao.setText(cardapioAlmoco[dia][2]);
            mostracardapio.jLabelRespMacarrao.setText(cardapioAlmoco[dia][3]);
            mostracardapio.jLabelRespArroz.setText(cardapioAlmoco[dia][4]);
            mostracardapio.jLabelRespFeijao.setText(cardapioAlmoco[dia][5]);
            mostracardapio.jLabelRespSopa.setText(cardapioAlmoco[dia][6]);
            mostracardapio.jLabelRespSobremesa.setText(cardapioAlmoco[dia][7]);

            mostracardapio.setVisible(true);
        }
        
        if ("Jantar".equals(turno)) {
            if (dia == 6) {
                JOptionPane.showMessageDialog(null, "Não haverá janta neste dia");
            } else {
                mostracardapio.jLabelDiaSemana.setText("Dia da Semana: ");
                mostracardapio.jLabelTurno.setText("Turno: ");
                mostracardapio.jLabelOpcaoPrincipal.setText("Prato Principal: ");
                mostracardapio.jLabelOpcaoVegetariana.setText("Opção Vegetariana: ");
                mostracardapio.jLabelGuarnicao.setText("Guarnição: ");
                mostracardapio.jLabelMacarrao.setText("Macarrão: ");
                mostracardapio.jLabelArroz.setText("Arroz: ");
                mostracardapio.jLabelFeijao.setText("Feijão: ");
                mostracardapio.jLabelSopa.setText("Sopa: ");
                mostracardapio.jLabelSobremesa.setText("Sobremesa: ");

                mostracardapio.jLabelRespDiaSemana.setText(diaSemana);
                mostracardapio.jLabelRespTurno.setText(turno);
                mostracardapio.jLabelRespPrincipal.setText(cardapioJanta[dia][0]);
                mostracardapio.jLabelRespVegetariano.setText(cardapioJanta[dia][1]);
                mostracardapio.jLabelRespGuarnicao.setText(cardapioJanta[dia][2]);
                mostracardapio.jLabelRespMacarrao.setText(cardapioJanta[dia][3]);
                mostracardapio.jLabelRespArroz.setText(cardapioJanta[dia][4]);
                mostracardapio.jLabelRespFeijao.setText(cardapioJanta[dia][5]);
                mostracardapio.jLabelRespSopa.setText(cardapioJanta[dia][6]);
                mostracardapio.jLabelRespSobremesa.setText(cardapioJanta[dia][7]);

                mostracardapio.setVisible(true);
            }
        }
        
        if ("Café da Manhã".equals(turno)) {
            mostracardapio.jLabelDiaSemana.setText("Dia da Semana: ");
            mostracardapio.jLabelTurno.setText("Turno: ");
            mostracardapio.jLabelOpcaoPrincipal.setText("Fruta: ");
            mostracardapio.jLabelOpcaoVegetariana.setText("Bebida: ");
            mostracardapio.jLabelGuarnicao.setText("Opção Proteica: ");
            mostracardapio.jLabelMacarrao.setText("Panificado: ");
            mostracardapio.jLabelArroz.setVisible(false);
            mostracardapio.jLabelFeijao.setVisible(false);
            mostracardapio.jLabelSopa.setVisible(false);
            mostracardapio.jLabelSobremesa.setVisible(false);
            
            mostracardapio.jLabelRespDiaSemana.setText(diaSemana);
            mostracardapio.jLabelRespTurno.setText(turno);
            mostracardapio.jLabelRespPrincipal.setText(cardapioCafe[dia][0]);
            mostracardapio.jLabelRespVegetariano.setText(cardapioCafe[dia][1]);
            mostracardapio.jLabelRespGuarnicao.setText(cardapioCafe[dia][2]);
            mostracardapio.jLabelRespMacarrao.setText(cardapioCafe[dia][3]);
            mostracardapio.jLabelRespArroz.setVisible(false);
            mostracardapio.jLabelRespFeijao.setVisible(false);
            mostracardapio.jLabelRespSopa.setVisible(false);
            mostracardapio.jLabelRespSobremesa.setVisible(false);

            mostracardapio.setVisible(true);
        }
//                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        if ("Café da Manhã".equals(turno)) {
////            JOptionPane.showMessageDialog(null, "Cadápio do " + (turno) + " de " + diaSemana + "\n\n"
////                    + cardapioCafe[0][0] + ":                         " + cardapioCafe[dia][0] + "\n"
////                    + cardapioCafe[0][1] + ":                      " + cardapioCafe[dia][1] + "\n"
////                    + cardapioCafe[0][2] + ":        " + cardapioCafe[dia][2] + "\n"
////                    + cardapioCafe[0][3] + ":                " + cardapioCafe[dia][3] );
//
//        }
//        if ("Almoço".equals(turno)) {
////            JOptionPane.showMessageDialog(null, "Cadápio do " + (turno) + " de " + diaSemana + "\n\n"
////                    + cardapioAlmoco[0][0] + ":          " + cardapioAlmoco[dia][0] + "\n"
////                    + cardapioAlmoco[0][1] + ":                         " + cardapioAlmoco[dia][1] + "\n"
////                    + cardapioAlmoco[0][2] + ":                  " + cardapioAlmoco[dia][2] + "\n"
////                    + cardapioAlmoco[0][3] + ":                    " + cardapioAlmoco[dia][3] + "\n"
////                    + cardapioAlmoco[0][4] + ":                           " + cardapioAlmoco[dia][4] + "\n"
////                    + cardapioAlmoco[0][5] + ":                          " + cardapioAlmoco[dia][5] + "\n"
////                    + cardapioAlmoco[0][6] + ":                           " + cardapioAlmoco[dia][6] + "\n"
////                    + cardapioAlmoco[0][7] + ":                " + cardapioAlmoco[dia][7] + "\n");
//        }
//
//        if ("Jantar".equals(turno)) {
////            if (dia == 6) {
////                JOptionPane.showMessageDialog(null, "Não haverá janta neste dia");
////            } else {
////                JOptionPane.showMessageDialog(null, "Cadápio do " + (turno) + " de " + diaSemana + "\n\n"
////                        + cardapioJanta[0][0] + ":          " + cardapioJanta[dia][0] + "\n"
////                        + cardapioJanta[0][1] + ":                         " + cardapioJanta[dia][1] + "\n"
////                        + cardapioJanta[0][2] + ":                  " + cardapioJanta[dia][2] + "\n"
////                        + cardapioJanta[0][3] + ":                    " + cardapioJanta[dia][3] + "\n"
////                        + cardapioJanta[0][4] + ":                           " + cardapioJanta[dia][4] + "\n"
////                        + cardapioJanta[0][5] + ":                          " + cardapioJanta[dia][5] + "\n"
////                        + cardapioJanta[0][6] + ":                           " + cardapioJanta[dia][6] + "\n"
////                        + cardapioJanta[0][7] + ":                " + cardapioJanta[dia][7] + "\n");
////            }
//        }

    }

//    public static void main(String[] args) {
//        
//        Cardapio cardapio = new Cardapio();
//        
//        String diaSemana;
//        String turno;
//        
//        cardapio.declarar();
//        
//        String opcoesDia[] = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
//        String opcoesTurno[] = {"Café da Manhã", "Almoço", "Jantar"};
//        
//        diaSemana = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Dia da semana", JOptionPane.INFORMATION_MESSAGE, null,opcoesDia, opcoesDia[0]);
//        turno = (String) JOptionPane.showInputDialog(null, "Escolha o turno da refeicao", "Turno da refeicao", JOptionPane.INFORMATION_MESSAGE, null,opcoesTurno, opcoesTurno[0]);
//
//        cardapio.acessar(diaSemana, turno);
//        
//    }
    public void acessar(JComboBox<String> diaSemana, JComboBox<String> turno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
