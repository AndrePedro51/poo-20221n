
package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaProduto {
    public static void main(String[] args){
        int idProd = Integer.parseInt(JOptionPane.showInputDialog("Id do produto"));
        String descProd = JOptionPane.showInputDialog("Descrição do produto");
        int qtdProd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto"));
        float prcProd = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto"));
        
        Produto pao = new Produto(idProd, descProd, qtdProd, prcProd);
        
        pao.comprar(12);
        pao.comprar(5);
        pao.vender(7);
        pao.subir(1);
        pao.descer(2);
        
        pao.exibirDados();
        
        idProd = Integer.parseInt(JOptionPane.showInputDialog("Id do produto"));
        descProd = JOptionPane.showInputDialog("Descrição do produto");
        qtdProd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto"));
        prcProd = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto"));
        
        Produto tenis = new Produto(idProd, descProd, qtdProd, prcProd);
        
        tenis.comprar(12);
        tenis.comprar(5);
        tenis.vender(7);
        tenis.subir(1);
        tenis.descer(2);
        
        tenis.exibirDados();
    }
}
