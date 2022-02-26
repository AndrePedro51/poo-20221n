
package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;


public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    Rio(){
        
    }
    Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void esolarar(float x){
        this.nivel -= x;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Nome do rio: " + this.nome + 
                "\nNível do rio: " + this.nivel + 
                "\nO rio está poluido?: " + (this.poluido ? "Sim": "Não"));
    }
}
