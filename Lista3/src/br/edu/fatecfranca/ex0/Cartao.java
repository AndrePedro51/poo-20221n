
package br.edu.fatecfranca.ex0;

import java.util.Date;

public class Cartao {
    private int numCartao;
    private Date validade;
    private int cvv;
    private String bandeira;
    private Conta conta;

    public Cartao() {
    }

    public Cartao(int numCartao, Date validade, int cvv, String bandeira, Conta conta) {
        this.numCartao = numCartao;
        this.validade = validade;
        this.cvv = cvv;
        this.bandeira = bandeira;
        this.conta = conta;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public void dados(){
        System.out.println("Numero do Cartão: " + this.numCartao + "\nCVV: " + this.cvv + "\nBandeira: " + this.bandeira + "\nValidade: " + this.validade);
        this.conta.dados();
    }
}
