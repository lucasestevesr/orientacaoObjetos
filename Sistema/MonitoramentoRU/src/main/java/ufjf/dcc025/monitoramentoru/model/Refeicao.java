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
public abstract class Refeicao {
    private String diaSemana;
    private String turnoRefeicao;
    private String horario;
    String tipo;
    
    public Refeicao(String tipo, String diaSemana, String turnoRefeicao, String horario){
        this.diaSemana = diaSemana;
        this.turnoRefeicao = turnoRefeicao;
        this.horario = horario;
        this.tipo = tipo;
        System.out.println("Foi feito um cadastro de refeição do tipo " + this.tipo + " no dia " + this.diaSemana + " às "
        + this.horario);
    }
    
//    public void opcoesDiaSemana(){
//        String [] opcoes = {"Segunda-feira", "Terça-feira", "Quarta-feira","Quinta-feira","Sexta-feira","Sábado"};
//    }
    
    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getTurnoRefeicao() {
        return turnoRefeicao;
    }

    public void setTurnoRefeicao(String turnoRefeicao) {
        this.turnoRefeicao = turnoRefeicao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
