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
    private String id;
    private String diaSemana;
    private String turnoRefeicao;
    private String horario;
    String tipo;

    public Refeicao(String id, String diaSemana, String turnoRefeicao, String horario) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.turnoRefeicao = turnoRefeicao;
        this.horario = horario;
    }
    
    public void editaRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario){
        System.out.println("Editando Refeicao do tipo " + tipo);
        this.diaSemana = diaSemana;
        this.turnoRefeicao = turnoRefeicao;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    
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
    
    public void cadastrarRefeicao(Refeicao refeicao){}   
    
    @Override
    public String toString() {
        return "Refeicao{" + "Dia da Semana" + diaSemana + ", turno=" + turnoRefeicao + ", horario=" + horario + ", tipo=" + tipo + '}';
    }
}
