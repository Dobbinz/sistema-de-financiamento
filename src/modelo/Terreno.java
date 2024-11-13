package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    public double calcularPagamentoMensal() {
        double pagamentoMensalBase = (getValorImovel() / (getPrazoFinanciamento() * 12)) *
                (1 + (getTaxaJurosAnual() / 12 / 100));
        return pagamentoMensalBase * 1.02;
    }

    public void exibirDetalhesFinanciamento() {
        super.exibirDetalhesFinanciamento();
        System.out.println("Tipo de zona: " + tipoZona);
    }
}
