package Inicio;

import java.util.Scanner;

public class verifica {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    // para que a entrada do usuario seja validada
    int number = entrada.nextInt();
    

    if (number > 1){
      System.out.println("O numero é maior. ");
    } else if (number < 1){
      System.out.println("O numero é menor. ");
    } else{
      System.out.println("O numero é 0.");
    }
  }
}
