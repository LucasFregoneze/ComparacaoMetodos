package sorts.selectionSort;

import javax.swing.*;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] metSelection) {
        int n = metSelection.length;
        int steps = 0;
        int swaps = 0;
        long start = System.currentTimeMillis();
        // Passa por todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Encontra o elemento mínimo no subarray não ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (metSelection[j] < metSelection[minIndex]) {
                    minIndex = j;
                    swaps++;
                }
                steps++;
            }
            // Troca o elemento mínimo encontrado com o primeiro elemento não ordenado
            int temp = metSelection[minIndex];
            metSelection[minIndex] = metSelection[i];
            metSelection[i] = temp;
        }
        long end = System.currentTimeMillis();
        JTextArea textArea = new JTextArea(Arrays.toString(metSelection), 30, 120);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        Object[] message = {
                new JScrollPane(textArea),
                "Tempo de execução: " + ((end - start)) + " Milissegundos",
                "Passos efetuados: " + steps,
                "Trocas efetuadas: " + swaps
        };

        JOptionPane.showMessageDialog(null, message, "Array Ordenado - Selection Sort", JOptionPane.INFORMATION_MESSAGE);
    }
}
