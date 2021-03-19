/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.dao;

import ufjf.dcc025.monitoramentoru.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class BancoDeDadosUsuario {

    private static Usuario usuarioLogado;

    private static final List<Usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarioLogado = null;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        BancoDeDadosUsuario.usuarioLogado = usuarioLogado;
    }

    public static boolean autenticarLogin(String identificador, String senha) {
        try {
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuario = usuarios.get(i);
                if (usuario.getIdentificador().equals(identificador) && usuario.getSenha().equals(senha)) {
                    setUsuarioLogado(usuario);
                    return true;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return false;
    }

    public static boolean validacaoCadastro(String tipo, String nome, String identificador,
            String email, String telefone, String senha, String confirmarSenha) {

        try {
            UsuarioController usuarioController = new UsuarioController();
            usuarioController.cadastrarUsuario(tipo, nome, identificador, email, telefone, senha, confirmarSenha);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }

    public static boolean editar(String nome, String identificador, String email, String telefone,
            String senha, String confirmarSenha) {
        try {
            //if (autenticarLogin(identificador, senha) == true) {
            BancoDeDadosUsuario.getUsuarioLogado().setNome(nome);
            BancoDeDadosUsuario.getUsuarioLogado().setIdentificador(identificador);
            BancoDeDadosUsuario.getUsuarioLogado().setEmail(email);
            BancoDeDadosUsuario.getUsuarioLogado().setTelefone(telefone);
            BancoDeDadosUsuario.getUsuarioLogado().setSenha(senha);
            BancoDeDadosUsuario.getUsuarioLogado().setConfirmarSenha(confirmarSenha);
            return true;
            //}

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }

    }

    public int getId() {
        return usuarios.size();
    }
}
