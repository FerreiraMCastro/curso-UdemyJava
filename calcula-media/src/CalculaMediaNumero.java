import java.util.Scanner;



public class CalculaMediaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        float mediaGeral = (num1 + num2 + num3) / 3f;
        System.out.println("A média geral é: " + mediaGeral);

        scanner.close();
    }
}
