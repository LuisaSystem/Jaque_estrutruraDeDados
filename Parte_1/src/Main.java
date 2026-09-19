// Créditos ao Adan >:3

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public static void selecaoDireta(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) menor = j;
            }
            int temp = v[i];
            v[i] = v[menor];
            v[menor] = temp;
        }
    }

    public static void insercaoDireta(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int atual = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > atual) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = atual;
        }
    }

    public static void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(v, inicio, fim);
            quickSort(v, inicio, pivo - 1);
            quickSort(v, pivo + 1, fim);
        }
    }

    public static int particionar(int[] v, int inicio, int fim) {
        int pivo = v[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                i++;
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }

        int temp = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = temp;
        return i + 1;
    }

    public static int[] vetorAleatorio(int tamanho) {
        Random random = new Random(12345);
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = random.nextInt(1_000_000);
        }
        return v;
    }

    public static int[] vetorCrescente(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) v[i] = i;
        return v;
    }

    public static int[] vetorDecrescente(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) v[i] = tamanho - i;
        return v;
    }

    public static long medirTempo(int[] original, String metodo) {
        int[] v = Arrays.copyOf(original, original.length);
        long inicio = System.nanoTime();

        switch (metodo) {
            case "BubbleSort":
                bubbleSort(v);
                break;
            case "SelecaoDireta":
                selecaoDireta(v);
                break;
            case "InsercaoDireta":
                insercaoDireta(v);
                break;
            case "QuickSort":
                quickSort(v, 0, v.length - 1);
                break;
        }

        long fim = System.nanoTime();

        if (!estaOrdenado(v))
            throw new RuntimeException("Erro: vetor não foi ordenado!");

        return fim - inicio;
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++)
            if (v[i] > v[i + 1]) return false;
        return true;
    }

    public static String formatarTempo(long nanos) {
        return String.format("%.3f ms", nanos / 1_000_000.0);
    }

    public static void main(String[] args) {

        int[] tamanhos = {100, 1000, 10000, 100000};

        String[] metodos = {
                "BubbleSort",
                "SelecaoDireta",
                "InsercaoDireta",
                "QuickSort"
        };

        System.out.println("==============================================");
        System.out.println(" COMPARACAO DE ALGORITMOS DE ORDENACAO");
        System.out.println("==============================================");

        for (int tamanho : tamanhos) {

            System.out.println("\n----------------------------------------------");
            System.out.println("TAMANHO DO VETOR: " + tamanho);
            System.out.println("----------------------------------------------");
            System.out.printf("%-18s %-18s %-18s%n",
                    "Metodo", "Ordem", "Tempo");
            System.out.println("------------------------------------------------------");

            int[][] vetores = {
                    vetorCrescente(tamanho),
                    vetorDecrescente(tamanho),
                    vetorAleatorio(tamanho)
            };

            String[] ordens = {
                    "Crescente",
                    "Decrescente",
                    "Aleatoria"
            };

            for (int i = 0; i < vetores.length; i++) {
                for (String metodo : metodos) {
                    long tempo = medirTempo(vetores[i], metodo);
                    System.out.printf("%-18s %-18s %-18s%n",
                            metodo, ordens[i], formatarTempo(tempo));
                }
                System.out.println("------------------------------------------------------");
            }
        }


        System.out.println("COMPLEXIDADE DOS ALGORITMOS");
        System.out.println("Bubble Sort      -> Melhor: O(n), Medio: O(n²), Pior: O(n²)");
        System.out.println("Selecao Direta   -> Melhor: O(n²), Medio: O(n²), Pior: O(n²)");
        System.out.println("Insercao Direta  -> Melhor: O(n), Medio: O(n²), Pior: O(n²)");
        System.out.println("QuickSort        -> Melhor: O(n log n), Medio: O(n log n), Pior: O(n²)");
        System.out.println("\nOs tempos variam conforme o computador.");
    }
}

