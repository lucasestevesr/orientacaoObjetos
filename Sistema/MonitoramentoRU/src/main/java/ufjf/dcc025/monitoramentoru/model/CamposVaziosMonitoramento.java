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
public class CamposVaziosMonitoramento extends Exception {
    
    String dia;
    String hora;

    public CamposVaziosMonitoramento(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return " os campos dia e/ou horário estão vazio. Preencha-os corretamente";
    }
    
    
    
}
