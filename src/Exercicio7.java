import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        for(int i = 0; i < numero; i++){
            System.out.println(nome);
        }
    }
}
