/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import com.google.gson.Gson;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;
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
    private static Gson SERIALIZADOR;
    /**
     *      
     * @return A String do Usuario usuario.
     */
    public static final String getJSONFromUsuario(Usuario usuario){
        SERIALIZADOR = new Gson();
        return SERIALIZADOR.toJson(usuario);
    }

//    public static LinkedList<Usuario> usuarios = new LinkedList();
    public boolean cadastrarUsuario(String tipo, String nome, String identificador, String email, String telefone,
            String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {
        if ((senha == null ? confirmarSenha == null : senha.equals(confirmarSenha)) && nome != null && nome.length() > 0
                && identificador != null && identificador.length() > 0 && email != null && email.length() > 0
                && telefone != null && telefone.length() > 0
                && senha != null && senha.length() > 0) {
            switch (tipo) {
                case ("Docente"): {
                    Usuario registroDocente = new Docente(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
                    BancoDeDadosUsuario.getUsuarios().add(registroDocente);
                    //registroDocente.setId(usuarios.size());
                    //usuarios.add(registroDocente);
                    break;
                }
                case ("Discente"): {
                    Discente registroDiscente = new Discente(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
                    registroDiscente.pagar();
                    BancoDeDadosUsuario.getUsuarios().add(registroDiscente);
                    //registroDiscente.setId(usuarios.size());
                    // usuarios.add(registroDiscente);
                    break;
                }
                case ("Tae"): {
                    Usuario registroTae = new Tae(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
                    BancoDeDadosUsuario.getUsuarios().add(registroTae);
                    //registroTae.setId(usuarios.size());
                    //usuarios.add(registroTae);
                    break;
                }
                default: {
                    System.out.println("Tipo de Usuário inválido.");
                }
            }

            JOptionPane.showMessageDialog(null, "Olá " + (nome) + ", seu cadastro " + (tipo) + " foi realizado com sucesso.");

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválidos, confirme novamente.");
            return false;
        }
    }

    public boolean enviarMensagem(String mensagem) {
        if (mensagem != null && !mensagem.isEmpty()) {
            Contato contato = new Contato(mensagem);
            BancoDeDadosUsuario.getMensagem().add(contato);
            return true;
        } else {
            return false;
        }
    }

//    String display = "";
//
//    public void imprimirListaUsuarios() {
//        for (int i = 0; i < usuarios.size(); i++) {
//            display += "\n" + usuarios.get(i);
//        }
//        System.out.println(display);
//    }
    }
