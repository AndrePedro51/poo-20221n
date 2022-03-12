
package br.edu.fatecfranca.ex0;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        Conta cta = new Conta("102157-1", "3542-5", "André Gomes", 1000);
        Cartao ctao = new Cartao(23541, new Date(), 548, "Master", cta);
        
        ctao.dados();
    }
    
}
