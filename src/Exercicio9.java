import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        int aux = 101;
        for(int i = 0; i < 50; i++){
            numeros.add(aux);
            aux++;
        }

        for(int i = 0; i < numeros.size(); i++){
            System.out.println("Posicao " + i + " - " + numeros.get(i));
        }
    }
}
