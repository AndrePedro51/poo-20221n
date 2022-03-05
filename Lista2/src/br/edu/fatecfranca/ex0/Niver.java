
package br.edu.fatecfranca.ex0;

import java.util.ArrayList;

public class Niver {
    private int Dia;
    private String Mes;
    
    public void setDia(int Dia){
        if(Dia >= 1 && Dia <= 31){
            this.Dia = Dia;
        }else {
            this.Dia = 0;
            System.out.println("Dia inválido");
        }
    }
    
    public void setMes(String Mes){
        ArrayList <String> vetor = new ArrayList();
        vetor.add("Janeiro");
        vetor.add("Fevereiro");
        vetor.add("Março");
        vetor.add("Abril");
        vetor.add("Maio");
        vetor.add("Junho");
        vetor.add("Julho");
        vetor.add("Agosto");
        vetor.add("Setembro");
        vetor.add("Outubro");
        vetor.add("Novembro");
        vetor.add("Dezembro");
        
        if(vetor.contains(Mes)){
            this.Mes = Mes;
        }else{
            this.Mes = "Mês inválido";
            System.out.println("Mês inválido");
        }
    }
    
    public int getDia(){
        return this.Dia;
    }
    public String getMes(){
        return this.Mes;
    }
    Niver(){
        
    }
    
    Niver(int Dia, String Mes){
        this.setDia(Dia);
        this.setMes(Mes);
    }
    
}
