import java.util.Scanner;


public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite seu peso (em kilos):");
        float peso = leitorTeclado.nextFloat();

        System.out.println("Digite a sua altura (em centimetros):");
        float altura = leitorTeclado.nextFloat();

        float meuIMC = peso / (altura * altura);


        System.out.println("O IMC para o peso " + peso + ", e altura " + altura+ " é " + meuIMC);

        leitorTeclado.close();
    }

}
