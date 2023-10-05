import java.util.Scanner;

public class Division {
     public static void Dividir(){
         double resultado = 0;
         Scanner reader = new Scanner(System.in);
         System.out.println("Introduzca el divisor");
         double divisor =  reader.nextDouble();
         System.out.println("Introduzca el dividendo");
         double dividendo = reader.nextDouble();
         while (dividendo == 0){
             System.out.println("Introduzca dividendo de nuevo, no puede ser 0");
             dividendo = reader.nextDouble();
         }
         resultado = divisor / dividendo;
         System.out.println(divisor + "/" + dividendo + "=" + resultado);
     }

    public static void main(String[] args) {
        Dividir();
    }
}
