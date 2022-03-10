
package br.edu.fatecfranca.ex1;


public class Teste {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        
        obj1.setNumConta("012345-8");
        obj1.setNumAgencia("1234-7");
        obj1.setSaldo(500);
        obj1.setNome("André Gomes");
        obj1.realizarDeposito(100);
        obj1.realizarSaque(50);
        
        obj1.dados();
        
        Cliente obj2 = new Cliente("Fulano", "2301-4", "541201-8", 500);
        
        obj2.realizarDeposito(100);
        obj2.realizarSaque(50);
        
        obj2.dados();
    }
    
}
