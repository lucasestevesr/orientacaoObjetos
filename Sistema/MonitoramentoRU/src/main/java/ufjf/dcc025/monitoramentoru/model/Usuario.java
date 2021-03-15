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
public abstract class Usuario {

    private int id;
    private String nome;
    private String identificador;
    private String email;
    private String telefone;
    private String senha;
    private String confirmarSenha;
    int tipo;

    public Usuario(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha) {      
      
        this.nome = nome;
        this.identificador = identificador;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        System.out.println("Foi realizado o cadastro do usúario identificado pelo email: " + this.email + " e pelo identificador: " + this.identificador);

    }

    public boolean autenticaLogin(String identificador, String senha) {
        System.out.println("Autenticando o Login.");
        return ((this.senha == null ? senha == null : this.senha.equals(senha)) && this.identificador.equals(identificador));
    }

    public void editaCadastro(String nome, String identificador, String email, String telefone, String senha) {
        System.out.println("Editando o Cadastro.");        
        this.nome = nome;
        this.identificador = identificador;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void cadastrarUsuario() {
        //view chamar controller
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

    public int getId() {
        return id;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", identificador=" + identificador + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + ", confirmarSenha=" + confirmarSenha + ", tipo=" + tipo + '}';
    }
}
