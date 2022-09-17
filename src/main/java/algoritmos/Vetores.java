package algoritmos;

import java.util.Random;

public class Vetores {
    private static final Random random = new Random();

    public static int[] criaAleatorio(int tamanhoVetor) {
        int[] vetor = new int[tamanhoVetor];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        return vetor;
    }

    public static void exiba(int[] vetor, String msg) {
        System.out.print(msg);
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
}
