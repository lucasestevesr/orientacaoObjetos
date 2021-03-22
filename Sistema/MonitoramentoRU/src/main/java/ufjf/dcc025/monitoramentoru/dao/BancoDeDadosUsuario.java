/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.dao;

import ufjf.dcc025.monitoramentoru.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;
import ufjf.dcc025.monitoramentoru.controller.RefeicaoController;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class BancoDeDadosUsuario {

    private static Usuario usuarioLogado;

    private static final List<Usuario> usuarios;

    private static final List<Refeicao> refeicoes;

    private static final List<Refeicao> encomendas;

    private static final List<SemanaHorarios> horarios;

    private static final List<Contato> mensagem;

    static {
        usuarios = new ArrayList<>();
        usuarioLogado = null;
        refeicoes = new ArrayList<>();
        encomendas = new ArrayList<>();
        horarios = new ArrayList<>();
        mensagem = new ArrayList<>();
    }

    public static List<Contato> getMensagem() {
        return mensagem;
    }

    public static List<Refeicao> getEncomendas() {
        return encomendas;
    }

    public static List<Refeicao> getRefeicoes() {
        return refeicoes;
    }

    public static List<SemanaHorarios> getHorarios() {
        return horarios;
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

    public static boolean validacaoCadastro(String tipo, String nome, String identificador,
            String email, String telefone, String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {

        try {
            UsuarioController usuarioController = new UsuarioController();
            usuarioController.cadastrarUsuario(tipo, nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
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

    public static boolean editarCadastro(String nome, String identificador, String email, String telefone,
            String senha, String confirmarSenha) {
        try {
            //if (autenticarLogin(identificador, senha) == true) {
            BancoDeDadosUsuario.getUsuarioLogado().setNome(nome);
            BancoDeDadosUsuario.getUsuarioLogado().setIdentificador(identificador);
            BancoDeDadosUsuario.getUsuarioLogado().setEmail(email);
            BancoDeDadosUsuario.getUsuarioLogado().setTelefone(telefone);
            BancoDeDadosUsuario.getUsuarioLogado().setSenha(senha);
            BancoDeDadosUsuario.getUsuarioLogado().setConfirmarSenha(confirmarSenha);
            if (senha == null ? confirmarSenha == null : senha.equals(confirmarSenha)) {
                return true;
            }
            //}

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return false;
    }

    public static boolean salvarRefeicoes(String tipo, String diaSemana, String turno, String horario) {

        try {
            RefeicaoController refeicaoContoller = new RefeicaoController();
            refeicaoContoller.cadastrarRefeicao(tipo, diaSemana, turno, horario);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }

    public static boolean salvarContato(String mensagem) {
        try {
            UsuarioController msg = new UsuarioController();
            if (msg.enviarMensagem(mensagem)) {
                return true;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);

        }
        return false;
    }
    
    public static String buscaEticket(String diaSemana){
        
        List<Refeicao> refeicoesUsuario = new ArrayList<>();
        List<Refeicao> encomendasUsuario = new ArrayList<>();
        
        // Encontrando nas listas de refeiçoes e encomendas os agendamentos do usuario logado
        
        for (int i = 0; i < BancoDeDadosUsuario.getRefeicoes().size(); i++) {
            if (BancoDeDadosUsuario.getRefeicoes().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) {
                if (BancoDeDadosUsuario.getRefeicoes().get(i).getDiaSemana().equals(diaSemana)) {
                    refeicoesUsuario.add(BancoDeDadosUsuario.getRefeicoes().get(i));
                }
            }
        }
        for (int i = 0; i < BancoDeDadosUsuario.getEncomendas().size(); i++) {
            if (BancoDeDadosUsuario.getEncomendas().get(i).getId().equals(BancoDeDadosUsuario.getUsuarioLogado().getIdentificador())) {
                if (BancoDeDadosUsuario.getEncomendas().get(i).getDiaSemana().equals(diaSemana)) {
                    encomendasUsuario.add(BancoDeDadosUsuario.getEncomendas().get(i));
                }
            }
        }
        
        //Reunindo informações para o print
        
        if (refeicoesUsuario.size() > 0 || encomendasUsuario.size() > 0) {
            
            List<String> display = new ArrayList<>();
            String[] turnorefeicao = new String[refeicoesUsuario.size()];
            String[] horariorefeicao = new String[refeicoesUsuario.size()];
            String[] turnoencomenda = new String[refeicoesUsuario.size()];
            String[] horarioencomenda = new String[refeicoesUsuario.size()];
            
            String displaychamadorefeicao = BancoDeDadosUsuario.getUsuarioLogado().getNome() + " possue " + refeicoesUsuario.size() + " refeições agendadas " + diaSemana + ":\n\n";
            for (int i = 0; i < refeicoesUsuario.size(); i++) {
                turnorefeicao[i] = "Turno: " + refeicoesUsuario.get(i).getTurnoRefeicao() + "\n";
                horariorefeicao[i] = "Horário: " + refeicoesUsuario.get(i).getHorario() + "\n\n";
            }
            
            double valorRefeicao = 1.0;
            double valorCafe = 1.0;
            
            display.add ("Valor do Café da Manhã: " + valorCafe + "\n");
            display.add ("Valor da Refeição: " + valorRefeicao + "\n\n");
            
            display.add(displaychamadorefeicao);
            for (int i = 0; i < refeicoesUsuario.size(); i++) {
                display.add(turnorefeicao[i]);
                display.add(horariorefeicao[i]);
            }
            
            String displaychamadoencomenda = BancoDeDadosUsuario.getUsuarioLogado().getNome() + " possue " + encomendasUsuario.size() + " encomenda(s) " + diaSemana + ":\n\n";
            for (int i = 0; i < encomendasUsuario.size(); i++) {
                turnoencomenda[i] = "Turno: " + encomendasUsuario.get(i).getTurnoRefeicao() + "\n";
                horarioencomenda[i] = "Horário: " + encomendasUsuario.get(i).getHorario() + "\n";
            }
            
            display.add(displaychamadoencomenda);
            for (int i = 0; i < encomendasUsuario.size(); i++) {
                display.add(turnoencomenda[i]);
                display.add(horarioencomenda[i]);
            }
            String eticket = display.stream().collect(Collectors.joining());
            return eticket;
        } else {
            String eticket = BancoDeDadosUsuario.getUsuarioLogado().getNome() + " não possui agendamentos nem encomendas neste dia";
            return eticket;
        }

    }

    public int getId() {
        return usuarios.size();
    }
}
