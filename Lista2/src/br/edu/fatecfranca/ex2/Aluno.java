
package br.edu.fatecfranca.ex2;

public final class Aluno {
    private int NumeroAluno;
    private String Nome;
    private int Idade;
    private float P1;
    private float P2;
    
    Aluno(){
        
    }
    Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.setNome(nome);
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.Nome = nome;
        }else{
            this.Nome = "Nome inválido";
        }
    }
    public void setNumeroAluno(int numeroAluno){
        if(String.valueOf(numeroAluno).length() == 6){
             this.NumeroAluno = numeroAluno;
        } else {
            this.NumeroAluno = 0;
            System.out.println("Número do aluno inválido");
        }
    }
    public void setIdade(int idade){
        if(idade > 0){
            this.Idade = idade;
        } else {
            this.Idade = 0;
            System.out.println("Idade inválida");
        }
    }
    public void setP1(float p1){
        if(p1 > 0){
            this.P1 = p1;
        } else {
            this.P1 = 0;
            System.out.println("Nota P1 inválida");
        }
    }
    public void setP2(float p2){
        if(p2 > 0){
            this.P2 = p2;
        } else {
            this.P2 = 0;
            System.out.println("Nota P2 inválida");
        }
    }
    
    public String getNome(){
        return this.Nome;
    }
    public int getNumAluno(){
        return this.NumeroAluno;
    }
    public int getIdade(){
        return this.Idade;
    }
    public float getP1(){
        return this.P1;
    }
    public float getP2(){
        return this.P2;
    }
    
    public void notaFinal(){
        float NF = (getP1() + getP2()) / 2;
        System.out.println("Nota final: " + NF);
    }
    
    public void dados(){
        System.out.println("Nome: " + getNome() + "\nNum. Aluno: " + getNumAluno() + "\nIdade: " + getIdade());
    }
    
    
}
