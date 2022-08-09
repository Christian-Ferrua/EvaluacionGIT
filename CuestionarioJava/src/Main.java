
public class Main {
    public static void main(String[] args) {
      int lista[] = {10,9,-8,2,3,100,3};
      int num1 = lista[0];
      int num2 = lista[0];
      for( int i=1; i< lista.length;i++){
          if(lista[i]> num1){
              num1 = lista[i];
          }
          if(lista[i] < num2){
              num2 = lista[i];
          }
      }
      System.out.println("num1:" + num1 + ", num2:" + num2);
    }
}