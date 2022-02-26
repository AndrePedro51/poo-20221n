
package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;


public class Produto {
    int id;
    String desc;
    int quantidade;
    float preco;
    
    Produto(){
        
    }
    Produto(int id, String desc, int quantidade, float preco){
        this.id = id;
        this.desc = desc;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void comprar(int qtdCompra){
        this.quantidade += qtdCompra;
    }
    
    public void vender(int qtdVenda){
        this.quantidade -= qtdVenda;
    }
    public void subir(float aumtPreco){
        this.preco += aumtPreco;
    }
    public void descer(float dimnPreco){
        this.preco -= dimnPreco;
    }
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Id do produto: " + this.id + 
                "\nDescrição: " + this.desc + 
                "\nQuantidade: " + this.quantidade+
                "\nPreço do produto: " + this.preco);
    }
}
