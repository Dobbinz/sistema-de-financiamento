package modelo;

public abstract class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * (prazoFinanciamento * 12);
    }

    public abstract double calcularPagamentoMensal();

    public void exibirDetalhesFinanciamento() {
        System.out.println("Valor do imóvel: R$ " + String.format("%.2f", valorImovel));
        System.out.println("Prazo do financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de juros anual: " + taxaJurosAnual + "%");
        System.out.println("Pagamento mensal: R$ " + String.format("%.2f", calcularPagamentoMensal()));
        System.out.println("Total do financiamento: R$ " + String.format("%.2f", calcularTotalPagamento()));
    }
}
