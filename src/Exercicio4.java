import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> idade = new ArrayList<>();
        double media = 0;

        System.out.println("Digite a idade de 20 pessoas: ");
        for(int i = 0; i < 20; i++){
            idade.add(entrada.nextInt());
            media = media + idade.get(i);
        }

        media = media/20;

        System.out.println("A média das idades é: " + media);


    }
}
