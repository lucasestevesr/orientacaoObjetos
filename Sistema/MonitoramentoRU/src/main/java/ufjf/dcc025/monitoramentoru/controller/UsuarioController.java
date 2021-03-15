/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import java.util.LinkedList;
import ufjf.dcc025.monitoramentoru.model.Discente;
import ufjf.dcc025.monitoramentoru.model.Docente;
import ufjf.dcc025.monitoramentoru.model.Tae;
import ufjf.dcc025.monitoramentoru.model.Usuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 *
 *
 * O Controller faz a ligação do "Banco de Dados" à Model, ou seja, conecta o
 * "banco" a modelagem das classes.
 */
public class UsuarioController extends Usuario {

    public static LinkedList<Usuario> usuarios = new LinkedList();

    public UsuarioController(int id, int tipo, String nome, String identificador, String email, String telefone, String senha) {
        super(id, tipo, nome, identificador, email, telefone, senha);
    }

    public boolean cadastrarUsuario(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha) {
        if (telefone != null && nome != null && nome.length() > 0 && identificador != null && identificador.length() > 0 
                && email != null && email.length() > 0 && telefone.length() > 0 && senha != null && senha.length() > 0 
                && (senha == null ? confirmarSenha == null : senha.equals(confirmarSenha))) {

            int tamanho = usuarios.size() + 1;

            Usuario registroDocente = new Docente(tamanho, 1, nome, identificador, email, telefone, senha);
            usuarios.add(registroDocente);

            Usuario registroDiscente = new Discente(tamanho, 2, nome, identificador, email, telefone, senha);
            usuarios.add(registroDiscente);

            Usuario registroTae = new Tae(tamanho, 3, nome, identificador, email, telefone, senha);
            usuarios.add(registroTae);
            
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public int getId() {
        return usuarios.size();
    }

    @Override
    public void setTipo(int tipo) {

    }
}
