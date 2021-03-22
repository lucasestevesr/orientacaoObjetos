/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author arthu
 */
public class Prioridade {

    private boolean prioridade = false;

    public Prioridade() {
        this.prioridade = prioridade;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public void VerificaPrioridade(String turno) {

        for (int i = 0; i < BancoDeDadosUsuario.getHorarios().size(); i++) {

            switch (turno) {

                case ("Almoço"): {
                    if (BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH11() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH12() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH13()) 
                        if (BancoDeDadosUsuario.getHorarios().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) 
                            JOptionPane.showMessageDialog(null, BancoDeDadosUsuario.getHorarios().get(i).getId() + " tem prioridade!");
                        
                    break;
                }
                case ("Café da Manhã"): {
                    if (BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH7() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH8() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH9()) 
                        if (BancoDeDadosUsuario.getHorarios().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) 
                            JOptionPane.showMessageDialog(null, BancoDeDadosUsuario.getHorarios().get(i).getId() + " tem prioridade!");
                        
                    break;
                }
                case ("Janta"): {

                    if (BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH17() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH18() || BancoDeDadosUsuario.getHorarios().get(i).getSegundafeira().isH19()) 
                        if (BancoDeDadosUsuario.getHorarios().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) 
                            JOptionPane.showMessageDialog(null, BancoDeDadosUsuario.getHorarios().get(i).getId() + " tem prioridade!");
                        
                    break;
                }
                default: {
                        System.out.println("Turno da refeição inválido.");
                    }
            }
        }
    }
}
