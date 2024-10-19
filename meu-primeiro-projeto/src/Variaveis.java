public class Variaveis {
    //escopo global//
    //aqui podemos declarar uma variável constante.//

    static final float VALOR_PI = 3.14f;


    public static void main(String[] args){
        //variável é um valor volátil
        int idade;
        idade = 25;

        idade = 30;

        //constante o valor não poderar ser auterado//
        //não é possivel declarar uma constante dentro do escopo de//
        // meto_do, pode ser declarada dentro do escopo de uma classe.//

        System.out.println("A idade é:" + idade);
        System.out.println("Valor do PI é " + VALOR_PI);

    }
}
