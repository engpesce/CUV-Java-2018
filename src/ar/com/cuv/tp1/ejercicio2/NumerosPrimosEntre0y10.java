package ar.com.cuv.tp1.ejercicio2;

public class NumerosPrimosEntre0y10 {
    
    public int numeroPrimoDos = 2;
    public int numeroPrimoTres = 3;
    public int numeroPrimoCinco = 5;
    public int numeroPrimoSiete = 7;
    
    public NumerosPrimosEntre0y10(){
    }
    
    public int sumaDePrimos(){
        int sumaDePrimos = numeroPrimoDos + numeroPrimoTres + numeroPrimoCinco + numeroPrimoSiete;
        return sumaDePrimos;
    }
    
    public int multiplicacionDePrimos(){
        int multiplicacionDePrimos = numeroPrimoDos * numeroPrimoTres * numeroPrimoCinco * numeroPrimoSiete;
        return multiplicacionDePrimos;
    }
    
    public float promedioDePrimos(){
        float promedioDePrimos = sumaDePrimos() / 4.0F;
        return promedioDePrimos;
    }
}
