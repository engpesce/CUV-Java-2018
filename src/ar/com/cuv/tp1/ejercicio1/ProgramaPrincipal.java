package ar.com.cuv.tp1.ejercicio1;

public class ProgramaPrincipal
{
  public static void main(String[] args)
  {
    int numeroPrimoDos = 2;
    int numeroPrimoTres = 3;
    int numeroPrimoCinco = 5;
    int numeroPrimoSiete = 7;
    
    int sumaDePrimos = numeroPrimoDos + numeroPrimoTres + numeroPrimoCinco + numeroPrimoSiete;
    
    int multiplicacionDePrimos = numeroPrimoDos * numeroPrimoTres * numeroPrimoCinco * numeroPrimoSiete;
    
    float promedioDePrimos = sumaDePrimos / 4.0F;
    
    System.out.println("Operaci�n 1:");
    System.out.println(sumaDePrimos);
    System.out.println("-----------------------------------------------");
    
    System.out.println("Operaci�n 2:");
    System.out.println(multiplicacionDePrimos);
    System.out.println("-----------------------------------------------");
    
    System.out.println("Operaci�n 3:");
    System.out.println(promedioDePrimos);
    System.out.println("-----------------------------------------------");
  }
}
