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

    public abstract double pagarCafe(double valorCafe, String tipo);
    
    public abstract double pagarRefeicao(double valorRefeicao, String tipo);

}
