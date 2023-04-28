import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um núemro inteiro: ");
        int valor = entrada.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número inserido é par! Somando 5 fica: " + (valor + 5));
        } else System.out.println("O número inserido é impar! Somando 8 fica: " + (valor + 8));
    }
}
