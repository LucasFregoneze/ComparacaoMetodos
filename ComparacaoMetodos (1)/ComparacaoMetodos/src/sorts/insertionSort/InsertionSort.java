package sorts.insertionSort;

import javax.swing.*;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] metInsertion) {
        int n = metInsertion.length;
        int steps = 0;
        int swaps = 0;
        long start = System.currentTimeMillis();

        for (int i = 1; i < n; i++) {
            int key = metInsertion[i];
            int j = i - 1;

            // Move os elementos do subarray [0...i-1], que são maiores que a chave,
            // para uma posição à frente de sua posição atual
            while (j >= 0 && metInsertion[j] > key) {
                metInsertion[j + 1] = metInsertion[j];
                j--;
                steps++;
                swaps++;
            }
            metInsertion[j + 1] = key;
            steps++;
        }
        long end = System.currentTimeMillis();
        JTextArea textArea = new JTextArea(Arrays.toString(metInsertion), 30, 120);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        Object[] message = {
                new JScrollPane(textArea),
                "Tempo de execução: " + ((end - start)) + " Milissegundos",
                "Passos efetuados: " + steps,
                "Trocas efetuadas: " + swaps
        };

        JOptionPane.showMessageDialog(null, message, "Array Ordenado - Insertion Sort", JOptionPane.INFORMATION_MESSAGE);
    }
}
