
package br.edu.fatecfranca.ex1;


public class Teste {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        
        obj1.setNumConta("012345-8");
        obj1.setNumAgencia("1234-7");
        System.out.println("Conta: " + obj1.getNumConta());
        System.out.println("Agencia: " + obj1.getNumAgencia());
    }
    
}
