/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class MonitorarLotacao {
    private int lotacaoMaxima = 10;
        int contPessoas;
       
    public int monitorar(String diaSemana, String hora){
        for (int i = 0; i < BancoDeDadosUsuario.getRefeicoes().size(); i++) {
            if (BancoDeDadosUsuario.getRefeicoes().get(i).getDiaSemana().equals(diaSemana)) {
                if (BancoDeDadosUsuario.getRefeicoes().get(i).getHorario().equals(hora)) {
                    if(BancoDeDadosUsuario.getRefeicoes().get(i).getTipo().equals("Agendamento"))
                        contPessoas++;
                }
            }
        }return contPessoas*100/lotacaoMaxima;
    } 

//    for (int i = 0; i < usuarios.size(); i++) {
//                Usuario usuario = usuarios.get(i);
//                if (usuario.getIdentificador().equals(identificador) && usuario.getSenha().equals(senha)) {
//                    setUsuarioLogado(usuario);
//                    return true;
//                }
//            }
    
    
    
    public MonitorarLotacao() {
        this.contPessoas = contPessoas;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getContPessoas() {
        return contPessoas;
    }

    public void setContPessoas(int contPessoas) {
        this.contPessoas = contPessoas;
    }
    
    
    
    
}
