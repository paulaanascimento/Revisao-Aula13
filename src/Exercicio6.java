import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;

        System.out.println("Digite a quantidade de números que deseja inserir: ");
        int quantidade = entrada.nextInt();

        System.out.println("Agora insira os números: ");
        for(int i = 0; i < quantidade; i++){
            numeros.add(entrada.nextInt());
            if(numeros.get(i) >= 0){
                soma = soma + numeros.get(i);
            } else break;

            if(i == quantidade - 1){
                System.out.println("A soma dos números é: " + soma);
            }
        }

    }
}
