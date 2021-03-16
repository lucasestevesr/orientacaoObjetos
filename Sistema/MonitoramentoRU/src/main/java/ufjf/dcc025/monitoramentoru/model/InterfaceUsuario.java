/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public abstract interface InterfaceUsuario {
    
    public abstract void pagarETicket(double valorCafe, double valorRefeicao, int tipo);

    //PAGAR ETICKER UM PREÇO PARA CADA USUÁRIO.
    //    public abstract void pagarETicket(int tipo) {
    //        double valorCafe, valorRefeicao;
    //        if (tipo == 2) {
    //            valorCafe = 0.5;
    //            valorRefeicao = 1.4;
    //        } else if (tipo == 1 || tipo == 3) {
    //            valorCafe = 1.64;
    //            valorRefeicao = 8.4;
    //        }
    //    }
    //CAFÉ DA MANHÃ 0.50 DISCENTE - 1.64 TAES-DOCENTES
    //Refeição(ALMOÇO E JANTAR) 1.4 DISCENTE -  8.4 TAES-DOCENTES
}
