package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    
    Aluno(){
        
    }
    
    Aluno(String nome, int idade, int numeroAluno, float p1, float p2){
        this.nome = nome;
        this.idade = idade;
        this.numeroAluno = numeroAluno;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    float notaFinal(){
        return (this.p1 + this.p2)/2;
    }
    String dadosAluno(){
        String dados;
        dados = "Nome: " + this.nome + 
                "\nIdade: " + this.idade + 
                "\nNúmero Aluno: " + this.numeroAluno;
        
        return dados;
    }
    String passou(){
        return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
    }
    void exibir(){
        dadosAluno();
        passou();
        JOptionPane.showMessageDialog(null, dadosAluno() + 
                "\nNota final: " + notaFinal() +
                "\n" + passou());
    }
}
