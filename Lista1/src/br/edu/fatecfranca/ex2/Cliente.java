
package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    int numConta;
    int numAgencia;
    String nome;
    float saldo;
    
    Cliente(){
        
    }
    Cliente(int numConta, int numAgencia, String nome, float saldo){
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(){
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do depósito"));
        this.saldo += valor;
    }
    
    public void realizarSaque(){
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do saque"));
        this.saldo -= valor;
    }
    
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "\nConta: " + this.numConta + 
                "\nNome do cliente: " + this.nome + 
                "\nSaldo atual: " + this.saldo);
    }
    
}
