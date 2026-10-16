package padroescomportamentais.templatemethod;

public abstract class ContaEnergia {

    private int instalacao;
    protected String titular;
    private double leituraAnterior;
    private double leituraAtual;

    public int getInstalacao() {
        return instalacao;
    }

    public void setInstalacao(int instalacao) {
        this.instalacao = instalacao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(double leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double calcularConsumo() {
        return this.leituraAtual - this.leituraAnterior;
    }

    public abstract String verificarFaixaConsumo();

    public String getTipo() {
        return "ContaEnergia";
    }

    public String getInfo() {
        return getTipo() + "{" +
            "instalacao=" + this.instalacao +
            ", titular='" + this.titular + '\'' +
            ", resultado=" + this.verificarFaixaConsumo() +
            '}';
    }
}