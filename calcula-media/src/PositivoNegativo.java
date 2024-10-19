import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite qualquer número");
       int num = scanner.nextInt();

        if (num > 1){
            System.out.println("Número positivo: "+ num);
        } else if (num < 0) {
            System.out.println("Esse número é negativo "+num);

        } else {
            System.out.println("Esse número é zero "+ num);
        }
        scanner.close();
    }
}
