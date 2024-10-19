import java.util.Scanner;



public class CalcularSoma {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = teclado.nextInt();

        int somaNumeros = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números é: "+ somaNumeros);

        teclado.close();
    }
}
