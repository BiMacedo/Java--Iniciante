package Inicio;

public class condicional {
  public static void main(String []args) {
          int nota = 10;
          int nota2 = 8;
          
          int media = (nota+nota2)/2;

          media(media);
          
  }
    public static void media(int media){
      if (media > 6){
        System.out.println("Aprovado " + media);
      }else{
        System.out.println("Reprovado" + media);
      }
    }


}


