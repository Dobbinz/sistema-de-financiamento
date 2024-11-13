package main;

import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario comprador = new InterfaceUsuario();
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        // Variáveis para armazenar os totais
        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        // Financiamento com dados do usuário
        System.out.println("\nInsira os dados para o financiamento fornecido pelo usuário:");
        double valorImovelUsuario = comprador.pedirValorImovel();
        int prazoFinanciamentoUsuario = comprador.pedirPrazoFinanciamento();
        double taxaJurosAnualUsuario = comprador.pedirTaxaJurosAnual();

        // Solicitar dados adicionais para Casa
        double tamanhoAreaConstruida = comprador.pedirTamanhoAreaConstruida();
        double tamanhoTerreno = comprador.pedirTamanhoTerreno();

        Financiamento financiamentoUsuario = new Casa(valorImovelUsuario,
                prazoFinanciamentoUsuario, taxaJurosAnualUsuario, tamanhoAreaConstruida, tamanhoTerreno);
        listaFinanciamentos.add(financiamentoUsuario);

        adicionarFinanciamentos(listaFinanciamentos, valorImovelUsuario,
                prazoFinanciamentoUsuario, taxaJurosAnualUsuario);

        // Atualizando totais
        for (Financiamento financiamento : listaFinanciamentos) {
            totalImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.calcularTotalPagamento();
        }

        // Detalhes dos financiamentos
        for (int i = 0; i < listaFinanciamentos.size(); i++) {
            Financiamento financiamento = listaFinanciamentos.get(i);
            System.out.println("\nDetalhes do Financiamento " + (i + 1) + ":");
            financiamento.exibirDetalhesFinanciamento();
        }

        // Total de todos os imóveis e financiamentos
        System.out.println("\nTotal de todos os imóveis: R$ " + String.format("%.2f", totalImoveis));
        System.out.println("Total de todos os financiamentos: R$ " + String.format("%.2f", totalFinanciamentos));
    }

    private static void adicionarFinanciamentos(List<Financiamento> listaFinanciamentos,
                                                double valorImovel, int prazo, double taxaJuros) {

        listaFinanciamentos.add(new Casa(valorImovel, prazo, taxaJuros, 200, 300));
        listaFinanciamentos.add(new Apartamento(valorImovel, prazo, taxaJuros, 1, 10));
        listaFinanciamentos.add(new Apartamento(valorImovel, prazo, taxaJuros, 1, 15));
        listaFinanciamentos.add(new Terreno(valorImovel, prazo, taxaJuros, "residencial"));
    }
}
