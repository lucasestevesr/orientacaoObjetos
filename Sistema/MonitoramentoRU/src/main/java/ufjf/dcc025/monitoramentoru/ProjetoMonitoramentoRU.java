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
public class ProjetoMonitoramentoRU {
    public static void main(String[] args) {
        Usuario u[] = new Usuario[3];
        u[0] = new Usuario("202065501OA", "Lucas", "Lucas@ufjf.br", "123456", "Discente");
        u[1] = new Usuario("202065501OA", "João", "Joao@ufjf.br", "123456", "Docente");
        u[2] = new Usuario("202065501OA", "Maria", "Maria@ufjf.br", "123456", "TAE");
        
        System.out.println(u[0].toString());
    }
}
