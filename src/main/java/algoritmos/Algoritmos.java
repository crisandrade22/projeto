package algoritmos;

import java.util.Date;
import java.util.Scanner;

public class Algoritmos {
    private static final Scanner scanner = new Scanner(System.in);

    public static void analiseBubble() {
        int n;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
                int[] vetorGerado = Vetores.criaAleatorio(n);

//                Vetores.exiba( vetorGerado,"Vetor gerado " + "-".repeat(130) + "\n");

                long ini = new Date().getTime();
                Ordenacoes.bubble(vetorGerado);
                long fim = new Date().getTime();

//                Vetores.exiba(vetorGerado, "Vetor ordenado " + "-".repeat(130) + "\n");


                System.out.println("\nPara o vetor tamanho " + n + " o bubble demorou " + (fim - ini) + " " +
                        "milissegundos.\n\n");
            }
        } while (n > 0);
    }

    public static void analiseInsertion() {
        int n;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
                int[] vetorGerado = Vetores.criaAleatorio(n);

//                Vetores.exiba( vetorGerado,"Vetor gerado " + "-".repeat(130) + "\n");

                long ini = new Date().getTime();
                Ordenacoes.insertion(vetorGerado);
                long fim = new Date().getTime();

//                Vetores.exiba(vetorGerado, "Vetor ordenado " + "-".repeat(130) + "\n");


                System.out.println("\nPara o vetor tamanho " + n + " o insertion demorou " + (fim - ini) + " " +
                        "milissegundos.\n\n");
            }
        } while (n > 0);
    }

    public static void analiseSelection() {
        int n;

        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
                int[] vetorGerado = Vetores.criaAleatorio(n);

//                Vetores.exiba( vetorGerado,"Vetor gerado " + "-".repeat(130) + "\n");

                long ini = new Date().getTime();
                Ordenacoes.selection(vetorGerado);
                long fim = new Date().getTime();

//                Vetores.exiba(vetorGerado, "Vetor ordenado " + "-".repeat(130) + "\n");


                System.out.println("\nPara o vetor tamanho " + n + " o selection demorou " + (fim - ini) + " " +
                        "milissegundos.\n\n");
            }
        } while (n > 0);
    }
}
