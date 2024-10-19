import java.util.Scanner;

public class CalcularPeAreRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do Retângulo:");
        int base = scanner.nextInt();

        System.out.println("Digite a altura do Retângulo");
        float altura = scanner.nextInt();

        float areaRetangulo = base * altura;
        float perimetro = 2 * (base + altura);

        System.out.println("O Perimetro do Retângulo é "+ perimetro + "cm e a sua área é " + areaRetangulo +"m²");


        scanner.close();
    }
}
