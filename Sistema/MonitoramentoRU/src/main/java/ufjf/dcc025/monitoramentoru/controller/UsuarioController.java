/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import java.util.LinkedList;
import ufjf.dcc025.monitoramentoru.model.*;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 *
 *
 * O Controller faz a ligação do "Banco de Dados" à Model, ou seja, conecta o
 * "banco" a modelagem das classes.
 */
public class UsuarioController {

    public static LinkedList<Usuario> usuarios = new LinkedList();

    public boolean cadastrarUsuario(String tipo, String nome, String identificador, String email, String telefone,
            String senha, String confirmarSenha) {
        if ((senha == null ? confirmarSenha == null : senha.equals(confirmarSenha)) && nome != null && nome.length() > 0
                && identificador != null && identificador.length() > 0 && email != null && email.length() > 0
                && telefone != null && telefone.length() > 0
                && senha != null && senha.length() > 0) {
            switch (tipo) {
                case ("Docente") -> {
                    Usuario registroDocente = new Docente(nome, identificador, email, telefone, senha, confirmarSenha);
                    //registroDocente.setId(usuarios.size());
                    usuarios.add(registroDocente);
                }
                case ("Discente") -> {
                    Usuario registroDiscente = new Discente(nome, identificador, email, telefone, senha, confirmarSenha);
                    //registroDiscente.setId(usuarios.size());
                    usuarios.add(registroDiscente);
                }
                case ("Tae") -> {
                    Usuario registroTae = new Tae(nome, identificador, email, telefone, senha, confirmarSenha);
                    registroTae.setId(usuarios.size());
                    usuarios.add(registroTae);
                }
                default -> {
                    System.out.println("Tipo de Usuário inválido.");
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean autenticaLogin(UsuarioLogin autenticador) {
        System.out.println("Autenticando o Login.");
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i);
            if ((autenticador.getIdentificador() == null ? usuarios.get(i).getIdentificador() == null : autenticador.getIdentificador().equals(usuarios.get(i).getIdentificador())) && autenticador.getSenha() == usuarios.get(i).getSenha()) {
                System.out.println("Login Verificado" + usuarios.get(i).getNome());
                return true;
            }

        }
        System.out.println("Login Invalido");
        return false;
    }

    String display = "";

    public void imprimirListaUsuarios() {
        for (int i = 0; i < usuarios.size(); i++) {
            display += "\n" + usuarios.get(i);
        }
        System.out.println(display);
    }

    public static LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    

}
