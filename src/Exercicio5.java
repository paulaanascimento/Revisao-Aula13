import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int quatidade = 0;

        System.out.println("Digite 20 numeros: ");
        for(int i = 0; i < 20; i++){
            numeros.add(entrada.nextInt());

            if(numeros.get(i) > 0 && numeros.get(i) < 100){
                quatidade++;
            }
        }

        System.out.println("A quantidade de números entre 0 e 100 é: " + quatidade);
    }
}
