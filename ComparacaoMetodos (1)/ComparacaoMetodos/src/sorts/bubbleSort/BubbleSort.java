package sorts.bubbleSort;

import javax.swing.*;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] metBubble) {
        int n = metBubble.length;
        int steps = 0;
        int swaps = 0;
        boolean isSwapped;

        long start = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (metBubble[j] > metBubble[j + 1]) {
                    // Troca os elementos arr[j] e arr[j+1]
                    int temp = metBubble[j];
                    metBubble[j] = metBubble[j + 1];
                    metBubble[j + 1] = temp;
                    isSwapped = true;
                    swaps++;
                }
                steps++;
            }

            if (!isSwapped) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        JTextArea textArea = new JTextArea(Arrays.toString(metBubble), 30, 120);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        Object[] message = {
                new JScrollPane(textArea),
                "Tempo de execução: " + ((end - start)) + " Milissegundos",
                "Passos efetuados: " + steps,
                "Trocas efetuadas: " + swaps
        };

        JOptionPane.showMessageDialog(null, message, "Array Ordenado - Bubble Sort", JOptionPane.INFORMATION_MESSAGE);
    }

}
