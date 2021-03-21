/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author arthu
 */
public abstract interface Estudante {
    
    public final double TICKETCAFE = 0.5;
    public final double TICKETREFEICAO = 1.4;
    
    public abstract void pagar(String turnorefeicao);
    
    
}
