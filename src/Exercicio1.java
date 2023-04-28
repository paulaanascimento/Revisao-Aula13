import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int b = entrada.nextInt();

        if(a == b){
            int c = a + b;
            System.out.println("Os números são iguais! A soma deles é " + c);
        }
        else {
            int c = a * b;
            System.out.println("Os números são diferentes! A multiplicação deles é " + c);
        }
    }
}
