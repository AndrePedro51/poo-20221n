
package br.edu.fatecfranca.ex0;


public class Conta {
    private String conta, agencia, nome;
    private float saldo;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(String conta, String agencia, String nome, float saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    
    public void dados(){
        System.out.println("Nome: " + this.nome + "\nAgencia: " + this.agencia + "\nConta: " + this.conta + "\nSaldo: " + this.saldo);
    }
}
