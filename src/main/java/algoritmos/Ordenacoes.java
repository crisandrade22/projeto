package algoritmos;

public class Ordenacoes {
    public static void bubble(int[] v) {
        for(int i = 1; i < v.length; i++) {
            for(int j = 0; j < v.length - i; j++) {
                if(v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static void insertion(int[] v) {
        for (int j = 1; j < v.length; ++j) {
            int x = v[j];
            int i;
            for (i = j-1; i >= 0 && v[i] > x; --i)
                v[i+1] = v[i];
            v[i+1] = x;
        }
    }

    public static void selection(int[] v) {
        for (int i = 0; i < v.length - 1; ++i) {
            int min = i;
            for (int j = i+1; j < v.length; ++j)
                if (v[j] < v[min])  min = j;
            int x = v[i]; v[i] = v[min]; v[min] = x;
        }
    }
}
