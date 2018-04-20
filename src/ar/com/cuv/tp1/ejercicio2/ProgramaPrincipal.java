package ar.com.cuv.tp1.ejercicio2;

public class ProgramaPrincipal
{
  public static void main(String[] args)
  {
    
    NumerosPrimosEntre0y10 numerosPrimos = new NumerosPrimosEntre0y10();
    System.out.println("Operación 1:");
    System.out.println(numerosPrimos.sumaDePrimos());
    System.out.println("-----------------------------------------------");
    
    System.out.println("Operación 2:");
    System.out.println(numerosPrimos.multiplicacionDePrimos());
    System.out.println("-----------------------------------------------");
    
    System.out.println("Operación 3:");
    System.out.println(numerosPrimos.promedioDePrimos());
    System.out.println("-----------------------------------------------");
  }
}
