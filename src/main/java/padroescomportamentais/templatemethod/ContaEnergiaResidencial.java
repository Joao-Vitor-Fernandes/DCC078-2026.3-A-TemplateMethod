package padroescomportamentais.templatemethod;

public class ContaEnergiaResidencial extends ContaEnergia {

    public String verificarFaixaConsumo() {
        if (this.calcularConsumo() > 200.0) {
            return "Acima do limite";
        }
        else {
            return "Dentro do limite";
        }
    }

    @Override
    public String getTipo() {
        return "Conta Residencial";
    }
}