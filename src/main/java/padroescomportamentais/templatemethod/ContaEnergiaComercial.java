package padroescomportamentais.templatemethod;

public class ContaEnergiaComercial extends ContaEnergia {

    public String verificarFaixaConsumo() {
        if (this.calcularConsumo() > 500.0) {
            return "Acima do limite";
        }
        else {
            return "Dentro do limite";
        }
    }

    @Override
    public String getTipo() {
        return "Conta Comercial";
    }
}