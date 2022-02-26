
package br.edu.fatecfranca.ex2;
import javax.swing.JOptionPane;


public class TestaCliente {
    public static void main(String[] args){
        int conta = Integer.parseInt(JOptionPane.showInputDialog("Conta"));
        int agencia = Integer.parseInt(JOptionPane.showInputDialog("Agencia"));
        String nome = JOptionPane.showInputDialog("Nome");
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo atual"));
        
        Cliente fulano = new Cliente(conta, agencia, nome, saldo);
        fulano.realizarDeposito();
        fulano.realizarSaque();
        
        fulano.exibirDados();
    }
}
