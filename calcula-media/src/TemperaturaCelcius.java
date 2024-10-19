import java.util.Scanner;

public class TemperaturaCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius, por favor.");
        float temperaturaC = scanner.nextFloat();

        double temperaturaFahren = temperaturaC * 1.8 + 32;

        System.out.println("A temperatura é: "+temperaturaFahren + "° Fahrenheit");

        scanner.close();
    }
}
