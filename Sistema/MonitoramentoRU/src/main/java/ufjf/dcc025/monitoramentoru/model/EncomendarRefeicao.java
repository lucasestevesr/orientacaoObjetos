/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author tawan
 */
public class EncomendarRefeicao extends Refeicao{
    
    private final String tipo = "Encomenda";
    
    public EncomendarRefeicao(String diaSemana, String turnoRefeicao, String horario){
        super(diaSemana, turnoRefeicao, horario);
        super.tipo = this.tipo;
        
        System.out.println("Foi criado uma encomenda de refeição");
    }
    
    @Override
    public void editaRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario) {
        super.editaRefeicao(this.tipo, diaSemana, turnoRefeicao, horario);
    }
}
