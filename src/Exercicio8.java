import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Double> salario = new ArrayList<>();

        System.out.println("Digite a quantidade de salários que deseja inserir: ");
        int quantidade = entrada.nextInt();

        System.out.println("Agora insira os salarios: ");
        for(int i = 0; i < quantidade; i++){
            salario.add(entrada.nextDouble());
        }

        System.out.println("Digite a porcentagem do reajuste: ");
        double reajuste = entrada.nextDouble();

        for(int i = 0; i < salario.size(); i++){
            salario.set(i, salario.get(i) + salario.get(i) * reajuste);
        }

        System.out.println("----------SALARIOS ATUALIZADOS----------");
        for(int i = 0; i < salario.size(); i++){
            System.out.println(i+1 + "º - " + salario.get(i));
        }
    }
}
