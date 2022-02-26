
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {
    
    public static void main(String[] args){
        String auxNome = JOptionPane.showInputDialog("Nome");
        int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        int auxNumAluno = Integer.parseInt(JOptionPane.showInputDialog("Número do aluno"));
        float auxP1 = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova 1"));
        float auxP2 = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova 2"));
        
        Aluno aln = new Aluno(auxNome, auxIdade, auxNumAluno, auxP1, auxP2);
        
        aln.exibir();
        
    }
}

