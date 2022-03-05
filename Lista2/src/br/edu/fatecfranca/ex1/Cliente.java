
package br.edu.fatecfranca.ex1;

public class Cliente {
    private String NumConta;
    private String NumAgencia;
    private String Nome;
    private float Saldo;
    
    public void setNumConta(String numConta){
        if((numConta.length() == 8) && (numConta.charAt(6) == '-')){
            this.NumConta = numConta;
        }else{
            this.NumConta = "Conta inválida";
        }
    }
    
    public void setNumAgencia(String numAgencia){
        if((numAgencia.length() == 6) && (numAgencia.charAt(4) == '-')){
            this.NumAgencia = numAgencia;
        }else{
            this.NumAgencia = "Agencia inválida";
        }
    }
    
    public void setNome(String nome){
        if((nome.length() <= 30)){
            this.Nome = nome;
        }else{
            this.Nome = "Nome não pode ter mais de 30 caracteres";
        }
    }
    
    public void setSaldo(float saldo){
        this.Saldo = saldo;
    }
    
    public String getNumConta(){
        return this.NumConta;
    }
    
    public String getNumAgencia(){
        return this.NumAgencia;
    }
    
    public float getSaldo(){
        return this.Saldo;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    
}
