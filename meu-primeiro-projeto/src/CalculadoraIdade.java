import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        //1 -> pegar o ano atual//
        //2 -> pegar o ano de nascimento//
        //3 -> subtrair ano atual - ano de nascimento//

        Scanner calcularIDade = new Scanner(System.in);
        System.out.println("Digite o ano atual:");
        int anoAtual = calcularIDade.nextInt();

        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = calcularIDade.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A idade atual é " + resultado);

        calcularIDade.close();
    }
}
