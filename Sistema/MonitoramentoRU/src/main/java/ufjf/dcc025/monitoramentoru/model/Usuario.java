/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import java.util.Objects;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;
import ufjf.dcc025.monitoramentoru.view.TelaPrincipal;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public abstract class Usuario {

    private static int id;
    private String nome;
    private String identificador;
    private String email;
    private String telefone;
    private String senha;
    private String confirmarSenha;
    String tipo;
    private int total = 1;
    private SemanaHorarios horariosUsuario;

    public Usuario(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {

        Usuario.id = total++;
        this.nome = nome;
        this.identificador = identificador;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.horariosUsuario = horariosUsuario;
        System.out.println("Foi realizado o cadastro do usúario identificado pelo email: " + this.email + " e pelo identificador: " + this.identificador);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public SemanaHorarios getHorariosUsuario() {
        return horariosUsuario;
    }

    public void setHorariosUsuario(SemanaHorarios horariosUsuario) {
        this.horariosUsuario = horariosUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", identificador=" + identificador + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + ", confirmarSenha=" + confirmarSenha + ", tipo=" + tipo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
}
