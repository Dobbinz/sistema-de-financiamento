package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor = -1;
        do {
            try {
                System.out.print("Insira o valor do imóvel: ");
                valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("Erro: O valor do imóvel não pode ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor invalido, insira apenas números.");
                scanner.next();
            }
        } while (valor < 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo = -1;
        do {
            try {
                System.out.print("Digite o prazo do financiamento (em anos): ");
                prazo = scanner.nextInt();
                if (prazo < 0) {
                    System.out.println("Erro: O prazo do financiamento não pode ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor invalido, insira apenas números.");
                scanner.next();
            }
        } while (prazo < 0);
        return prazo;
    }

    public double pedirTaxaJurosAnual() {
        double taxa = -1;
        do {
            try {
                System.out.print("Digite a taxa de juros anual (%): ");
                taxa = scanner.nextDouble();
                if (taxa < 0) {
                    System.out.println("Erro: A taxa de juros não pode ser negativa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor invalido, insira apenas números.");
                scanner.next();
            }
        } while (taxa < 0);
        return taxa;
    }

    public double pedirTamanhoAreaConstruida() {
        double tamanho = -1;
        do {
            try {
                System.out.print("Insira o tamanho da área construída (m²): ");
                tamanho = scanner.nextDouble();
                if (tamanho < 0) {
                    System.out.println("Erro: O tamanho da área construída não pode ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor invalido, insira apenas números.");
                scanner.next();
            }
        } while (tamanho < 0);
        return tamanho;
    }

    public double pedirTamanhoTerreno() {
        double tamanho = -1;
        do {
            try {
                System.out.print("Insira o tamanho do terreno (m²): ");
                tamanho = scanner.nextDouble();
                if (tamanho < 0) {
                    System.out.println("Erro: O tamanho do terreno não pode ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor invalido, insira apenas números.");
                scanner.next();
            }
        } while (tamanho < 0);
        return tamanho;
    }
}
