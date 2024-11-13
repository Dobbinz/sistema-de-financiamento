package modelo;

public class Apartamento extends Financiamento {
    private int numeroVagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                       int numeroVagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12 / 100;
        int meses = getPrazoFinanciamento() * 12;
        return (getValorImovel() * Math.pow
                (1 + taxaMensal, meses) * taxaMensal) / (Math.pow(1 + taxaMensal, meses) - 1);
    }

    public void exibirDetalhesFinanciamento() {
        super.exibirDetalhesFinanciamento();
        System.out.println("Número de vagas na garagem: " + numeroVagasGaragem);
        System.out.println("Número do andar: " + numeroAndar);
    }
}
