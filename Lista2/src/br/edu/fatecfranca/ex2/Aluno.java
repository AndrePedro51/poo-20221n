
package br.edu.fatecfranca.ex2;

public class Aluno {
    private int NumeroAluno;
    private String Nome;
    private int Idade;
    private float P1;
    private float P2;
    
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.Nome = nome;
        }else{
            this.Nome = "Nome inválido";
        }
    }
    public void setNumeroAluno(int numeroAluno){
        if(numeroAluno.){
            this.NumeroAluno = numeroAluno;
        }
    }
}
