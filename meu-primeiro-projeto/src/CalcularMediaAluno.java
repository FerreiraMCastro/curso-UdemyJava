import java.util.Scanner;

public class CalcularMediaAluno {
    public static void main(String[] args) {

        Scanner leitorDenota = new Scanner(System.in);
        //receber primeira nota//
        System.out.println("Digite a nota do primeiro trimestre:");
        int nota1 = leitorDenota.nextInt();

        //receber segunda nota//
        System.out.println("Digite a nota do segundo trimestre");
        int nota2 = leitorDenota.nextInt();

        //receber terceira nota//
        System.out.println("Digite a nota do terceiro trimestre");
        int nota3 = leitorDenota.nextInt();

        //calcula a média do aluno//
        double calcularMedia = (nota1 + nota2 + nota3) / 3;

        //mostra o resultado//
        System.out.println("A média final do aluno é: " + calcularMedia);
        //encerra a leitura das notas//
        leitorDenota.close();


    }
}
