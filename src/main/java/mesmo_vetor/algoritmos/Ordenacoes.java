package mesmo_vetor.algoritmos;

import java.util.Date;

public class Ordenacoes {
    public static void bubble(int[] v) {
        long ini = new Date().getTime();
        for(int i = 1; i < v.length; i++) {
            for(int j = 0; j < v.length - i; j++) {
                if(v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        long fim = new Date().getTime();
        System.out.println("\nPara o vetor tamanho " + v.length + " o bubble demorou " + (fim - ini) + " " +
                "milissegundos.\n\n");
    }

    public static void insertion(int[] v) {
        long ini = new Date().getTime();
        for (int j = 1; j < v.length; ++j) {
            int x = v[j];
            int i;
            for (i = j-1; i >= 0 && v[i] > x; --i)
                v[i+1] = v[i];
            v[i+1] = x;
        }
        long fim = new Date().getTime();
        System.out.println("\nPara o vetor tamanho " + v.length + " o insertion demorou " + (fim - ini) + " " +
                "milissegundos.\n\n");
    }

    public static void selection(int[] v) {
        long ini = new Date().getTime();
        for (int i = 0; i < v.length - 1; ++i) {
            int min = i;
            for (int j = i+1; j < v.length; ++j)
                if (v[j] < v[min])  min = j;
            int x = v[i]; v[i] = v[min]; v[min] = x;
        }
        long fim = new Date().getTime();
        System.out.println("\nPara o vetor tamanho " + v.length + " o selection demorou " + (fim - ini) + " " +
                "milissegundos.\n\n");
    }
}
