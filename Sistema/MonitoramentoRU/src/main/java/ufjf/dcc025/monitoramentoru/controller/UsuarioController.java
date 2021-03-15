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
public class UsuarioController{

    public static LinkedList<Usuario> usuarios = new LinkedList();

    public boolean cadastrarUsuario(int id,int tipo, String nome, String identificador, String email, String telefone,
            String senha, String confirmarSenha){
        if ((senha == null ? confirmarSenha == null : senha.equals(confirmarSenha)) && nome != null && nome.length() > 0
                && identificador != null && identificador.length() > 0 && email != null && email.length() > 0 && telefone != null  && telefone.length() > 0
                && senha != null && senha.length() > 0) {

            Usuario registroDocente = new Docente(nome, identificador, email, telefone, senha, confirmarSenha);
            registroDocente.setId(usuarios.size());
            usuarios.add(registroDocente);

            Usuario registroDiscente = new Discente(nome, identificador, email, telefone, senha, confirmarSenha);
            registroDiscente.setId(usuarios.size());
            usuarios.add(registroDiscente);

            Usuario registroTae = new Tae(nome, identificador, email, telefone, senha, confirmarSenha);
            registroTae.setId(usuarios.size());
            usuarios.add(registroTae);

            return true;
        } else {
            return false;
        }
    } 
}
