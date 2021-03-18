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
public class Horarios {
    
    private boolean[][] horariosUsuario;

    
        public boolean[][] getHorariosUsuario() {
        return horariosUsuario;
    }

    public void setHorariosUsuario(boolean[][] horariosUsuario) {
        this.horariosUsuario = horariosUsuario;
    }

    public Horarios() {
        this.horariosUsuario = new boolean[6][14];
    }
    
}
