import java.util.ArrayList;
import java.util.List;

public class hash {
    public static void main(String[] args) {

        int[] num = {30, 23, 17, 12, 76, 58, 98, 58, 24, 36, 92, 17, 75, 74, 78, 78, 0, 11, 67, 17};


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
