import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de identificação: ");
        int numId = entrada.nextInt();

        List<Double> notas = new ArrayList<>();

        double mediaExercicios = 0;
        double mediaAproveitamento = 0;

        System.out.println("Agora digite as 3 notas");
        for(int i = 0; i < 3; i++){
            notas.add(entrada.nextDouble());
            mediaExercicios = mediaExercicios + notas.get(i);
            mediaAproveitamento = mediaAproveitamento + notas.get(i) * (i+1);
        }

        mediaExercicios = mediaExercicios/3;

        mediaAproveitamento = (mediaAproveitamento + mediaExercicios)/7;

        System.out.println("---------------------------------------------");
        System.out.println("ID Aluno: " + numId);
        for(int i = 0; i < 3; i++){
            System.out.println("Nota " + (i+1) + ": " + notas.get(i));
        }
        System.out.println("Media dos Exercicios: " + mediaExercicios);
        System.out.println("Media de Aproveitamento: " + mediaAproveitamento);

        if(mediaAproveitamento >= 90){
            System.out.println("Conceito: A - Aprovado");
        } else if(mediaAproveitamento >= 75 && mediaAproveitamento < 90) {
            System.out.println("Conceito: B - Aprovado");
        } else if(mediaAproveitamento >= 60 && mediaAproveitamento < 75) {
            System.out.println("Conceito: C - Aprovado");
        } else if(mediaAproveitamento >= 40 && mediaAproveitamento < 60){
            System.out.println("Conceito: D - Reprovado");
        } else System.out.println("Conceito: E - Reprovado");
    }
}
