
package br.edu.fatecfranca.ex4;

public class TestaRio {
    public static void main(String[] args){
        Rio amazonas = new Rio("Amazonas", 4, true);
        
        amazonas.chover(2);
        amazonas.esolarar(1);
        amazonas.limpar();
        
        amazonas.exibirDados();
        
        Rio tiete = new Rio("Tiete", 5, true);
        
        tiete.chover(2);
        tiete.esolarar(1);
        tiete.limpar();
        tiete.sujar();
        
        tiete.exibirDados();
        
    }
}
