package mesmo_vetor.algoritmos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Programa para análise de algorítmo\n");

        System.out.print("Digite o tamanho do vetor: ");

        int n = scanner.nextInt();
        int[] vetorGerado = Vetores.criaAleatorio(n);
        int[] vetorBubble = vetorGerado.clone();
        int[] vetorInsertion = vetorGerado.clone();
        int[] vetorSelection = vetorGerado.clone();

        Ordenacoes.bubble(vetorBubble);
        Ordenacoes.insertion(vetorInsertion);
        Ordenacoes.selection(vetorSelection);
    }
}
