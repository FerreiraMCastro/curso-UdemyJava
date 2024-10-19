import java.util.Scanner;

public class NumeroQuadrado {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

     System.out.println("Digite qualquer valor para ele ser dobrado.");
     double dobraNu = teclado.nextDouble();

     double valorDobrado = dobraNu * dobraNu;
     System.out.println( "Esse é seu numero ao quadrado: "+ valorDobrado);

     teclado.close();
    }
}
