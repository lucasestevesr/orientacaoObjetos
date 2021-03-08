/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru;

/**
 *
 * @author Lucas
 */
public class Usuario implements MenuInicial {

    protected String id;
    protected String nome;
    protected String email;
    protected String senha;
    protected String cargo;

    public Usuario(String id, String nome, String email, String senha, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void login() {

    }

    @Override
    public void cadastro() {

    }

    //polimorfismo de sobreposição
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ","
                + " cargo=" + cargo + '}';
    }

}
