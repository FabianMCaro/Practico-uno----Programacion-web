package seno;
import java.util.*;

public class Seno {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int i, j;
  double seno = 0, parte1, parte2, parte3;
  
  
 System.out.print("indique el numero del seno a calcular: ");
  double x = sc.nextDouble(); // variable del numero a calcular el seno
  
  System.out.print("indique el numero de los N numeros a calcular: ");
  int n = sc.nextInt(); // numero de veces que se hara la suma
  
    for (i=0; i<=n; i++){
   
   parte1 = 1;
   for(j=0; j<2*i+1; j++){//ciclo que realiza la parte del dividendo
    parte1= parte1 * x;// la parte del dividendo se multiplicara por dato x
   }
   
   parte2 = 1;
   for(j=1; j<=2*i+1; j++){//ciclo que realiza la parte del divisor
    parte2 = parte2 * j; // se multiplicaran los numeros del factorial
   }
   
   if(i%2==0){// si el exponencial es par el numero sera positivo
    parte3 = 1;
   }else{
    parte3 = -1;// si el exponencial es impar el numero sera negativo
   }
   seno = seno +(parte1 / parte2) * parte3; // se operara la formula de seno
  }
  
    System.out.print("seno de "+ x +" es: "+seno);

 }
}


