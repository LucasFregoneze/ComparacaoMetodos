package listSize;

import sorts.bubbleSort.BubbleSort;
import sorts.insertionSort.InsertionSort;
import sorts.selectionSort.SelectionSort;

import javax.swing.*;
import java.util.Random;

public class SelectListSize {
    public static void selectListSize(int arrSize, int opAlgorithm) {
        if (arrSize == 1) {
            listSmall(opAlgorithm);
        } else if (arrSize == 2) {
            listMedium(opAlgorithm);
        } else {
            listLarge(opAlgorithm);
        }
    }

    private static void listLarge(int opAlgorithm) {
        int[] large = generateRandomArray(50000);
        performSorting(opAlgorithm, large);
    }

    private static void listMedium(int opAlgorithm) {
        int[] medium = generateRandomArray(1000);
        performSorting(opAlgorithm, medium);
    }

    private static void listSmall(int opAlgorithm) {
        int size;
        try {
            size = readInt("Insira o tamanho da lista: ", "Definir tamanho do array");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");
            listSmall(opAlgorithm);
            return;
        }

        int[] small = new int[size];

        for (int i = 0; i < small.length; i++) {
            try {
                small[i] = readInt("Insira um valor: ", "Adicionar número ao array");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");
                i--;
            }
        }

        performSorting(opAlgorithm, small);
    }

    private static int readInt(String message, String title) {
        try {
            String intParse = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            return Integer.parseInt(intParse);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return readInt(message, title);
        }
    }

    private static void performSorting(int opAlgorithm, int[] array) {
        switch (opAlgorithm) {
            case 1 -> BubbleSort.bubbleSort(array);
            case 2 -> SelectionSort.selectionSort(array);
            case 3 -> InsertionSort.insertionSort(array);
            default ->
                    JOptionPane.showMessageDialog(null, "Erro: Escolha de algoritmo inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}