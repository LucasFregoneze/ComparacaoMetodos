package listSize;

import sorts.bubbleSort.BubbleSort;
import sorts.insertionSort.InsertionSort;
import sorts.selectionSort.SelectionSort;

import java.util.Random;
import java.util.Scanner;

public class ListSize {
    public static void selectListSize(int arrSize, int opAlgoritmo) {


        if (arrSize == 1) {
            listaPequena(opAlgoritmo);
        }
        ///////////////////////////////////////////////////////////
        else if (arrSize == 2) {
            listaMedia(opAlgoritmo);
        }
        /////////////////////////////////////////////////////////////
        else {
            listaGrande(opAlgoritmo);
        }
        ////////////////////////////////////////////////////////////////////
    }

    private static void listaGrande(int opAlgoritmo) {
        Random random = new Random();
        int grande[] = new int[100000];

        for (int i = 0; i < grande.length; i++) {

            int aleatorio = random.nextInt(1000);

            for (int j = 0; j < grande.length; j++) {

                grande[i] = aleatorio;
            }
        }
        switch(opAlgoritmo){
            case 1:
                BubbleSort.bubbleSort(grande);
                break;
            case 2:
                SelectionSort.selectionSort(grande);
                break;
            case 3:
                InsertionSort.insertionSort(grande);
                break;
            default:
                System.out.println("erro");
                break;
        }

    }

    private static void listaMedia(int opAlgoritmo) {
        Random random = new Random();
        int medio[] = new int[5000];

        for (int i = 0; i < medio.length; i++) {

            int aleatorio = random.nextInt(1000);

            for (int j = 0; j < medio.length; j++) {

                medio[i] = aleatorio;
            }
        }
        switch(opAlgoritmo){
            case 1:
                BubbleSort.bubbleSort(medio);
                break;
            case 2:
                SelectionSort.selectionSort(medio);
                break;
            case 3:
                InsertionSort.insertionSort(medio);
                break;
            default:
                System.out.println("erro");
                break;
        }
    }

    private static void listaPequena(int opAlgoritmo) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista: ");
        int tam = tc.nextInt();

        int pequeno[] = new int[tam];

        for (int i = 0; i < pequeno.length; i++) {
            System.out.printf("Digite o %d numero:", (i + 1));
            pequeno[i] = tc.nextInt();
        }
        switch(opAlgoritmo){
            case 1:
                BubbleSort.bubbleSort(pequeno);
                break;
            case 2:
                SelectionSort.selectionSort(pequeno);
                break;
            case 3:
                InsertionSort.insertionSort(pequeno);
                break;
            default:
                System.out.println("erro");
                break;
        }

    }
}

