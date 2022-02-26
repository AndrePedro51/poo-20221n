
package br.edu.fatecfranca.ex4;

public class TestaRio {
    public static void main(String[] args){
        Rio amazonas = new Rio("Amazonas", 5, true);
        
        amazonas.chover(2);
        amazonas.esolarar(1);
        amazonas.limpar();
        amazonas.sujar();
        
        amazonas.exibirDados();
        
    }
}
