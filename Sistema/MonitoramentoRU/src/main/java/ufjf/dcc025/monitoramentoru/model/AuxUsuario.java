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
public class AuxUsuario {
    
    private static int id;
    private String nome;
    private String identificador;
    private String email;
    private String telefone;
    private String senha;
    private String confirmarSenha;
    private String tipo; 
   

    public AuxUsuario(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha, String tipo) {
        this.nome = nome;
        this.identificador = identificador;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.tipo = tipo;
        
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        AuxUsuario.id = id;
    }

    public String getNome() {
        return nome;
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
    
    

}
