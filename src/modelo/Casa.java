package modelo;

public class Casa extends Financiamento {
    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public double calcularPagamentoMensal() {
        double pagamentoMensalBase = (getValorImovel() / (getPrazoFinanciamento() * 12)) *
                (1 + (getTaxaJurosAnual() / 12 / 100));
        return pagamentoMensalBase + 80;
    }

    public void exibirDetalhesFinanciamento() {
        super.exibirDetalhesFinanciamento();
        System.out.println("Tamanho da área construída: " + tamanhoAreaConstruida + " m²");
        System.out.println("Tamanho do terreno: " + tamanhoTerreno + " m²");
    }
}
