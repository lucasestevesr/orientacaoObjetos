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
public abstract interface Eticket {

    public final double TICKETCAFE = 0.5;
    public final double TICKETREFEICAO = 1.9;

    public abstract double pagarRefeicao(String turnorefeicao);

    public abstract void pagar();

}
