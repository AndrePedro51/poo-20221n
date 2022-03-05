
package br.edu.fatecfranca.ex0;

public class Teste {

    public static void main(String[] args) {
        Niver obj1 = new Niver();
        obj1.setDia(3);
        obj1.setDia(80);
        obj1.setDia(28);
        obj1.setMes("Outono");
        obj1.setMes("Outubro");
        
        System.out.println("Dia1: " + obj1.getDia() + "\nMês1: " + obj1.getMes());
        
        Niver obj2 = new Niver(7, "Janeiro");
        System.out.println("Dia2: " + obj2.getDia() + "\nMês2: " + obj2.getMes());
        
        Niver obj3 = new Niver(38, "Verão");
        System.out.println("Dia3: " + obj3.getDia() + "\nMês3: " + obj3.getMes());
    }
    
}
