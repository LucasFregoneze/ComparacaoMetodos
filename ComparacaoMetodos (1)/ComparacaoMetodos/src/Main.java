import listSize.SelectListSize;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        menuAlgoritmos();
    }

    private static void menuAlgoritmos() {
        int op;
        try {
            String opParse = JOptionPane.showInputDialog(null, "Selecione um dos algoritmos abaixo\n1 - Bubble Sort\n2 - Selection Sort\n3 - Insertion Sort\n0 - Sair");
            if (opParse == null) System.exit(0);
            op = Integer.parseInt(opParse);
            if (op > 3) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");
            menuAlgoritmos();
            return;
        }

        if (op >= 1) {
            menuTamanhoLista(op);
        } else {
            System.exit(0);
        }
    }

    private static void menuTamanhoLista(int opAlgoritmo) {
        int opTamanho;

        try {
            String input = JOptionPane.showInputDialog(null, "Selecione uma das opções de entrada abaixo\n1 - Quantidade Pequena\n2 - Quantidade Média\n3 - Quantidade Grande\n0 - Voltar");
            if (input == null) {
                menuAlgoritmos();
                return;
            }
            opTamanho = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");
            menuTamanhoLista(opAlgoritmo);
            return;
        }

        if (opTamanho == 0) {
            menuAlgoritmos();
            return;
        }
        SelectListSize.selectListSize(opTamanho, opAlgoritmo);
    }
}