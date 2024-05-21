import java.util.ArrayList;
import java.util.List;

public class hash {
    public static void main(String[] args) {

        int[] num = {0, 5, 12, 19, 25, 37, 45, 56, 68, 79, 88, 90, 99};


        List<Integer>[] tabelaHash = new List[10];
        for (int i = 0; i < tabelaHash.length; i++) {
            tabelaHash[i] = new ArrayList<>();
        }

        for (int n : num) {
            int i = hashFunction(n);
            tabelaHash[i].add(n);
            System.out.println("Valor " + n + " foi mapeado para a posição " + i);
        }

        // Exibição do conteúdo do vetor
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println("Posição " + i + ": " + tabelaHash[i]);
        }
    }

    public static int hashFunction(int value) {
        // Divide o valor por 10 para determinar a posição
        return value / 10;

    }
}
