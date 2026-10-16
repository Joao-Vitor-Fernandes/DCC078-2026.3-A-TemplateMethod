package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaEnergiaResidencialTest {

    @Test
    void deveRetornarDentroDoLimite() {
        ContaEnergiaResidencial conta = new ContaEnergiaResidencial();
        conta.setLeituraAnterior(1000.0);
        conta.setLeituraAtual(1200.0);
        assertEquals("Dentro do limite", conta.verificarFaixaConsumo());
    }

    @Test
    void deveRetornarAcimaDoLimite() {
        ContaEnergiaResidencial conta = new ContaEnergiaResidencial();
        conta.setLeituraAnterior(1000.0);
        conta.setLeituraAtual(1201.0);
        assertEquals("Acima do limite", conta.verificarFaixaConsumo());
    }

    @Test
    void deveRetornarInformacoes() {
        ContaEnergiaResidencial conta = new ContaEnergiaResidencial();
        conta.setLeituraAnterior(1000.0);
        conta.setLeituraAtual(1201.0);
        conta.setTitular("Maria Luisa Fernandes");
        conta.setInstalacao(3);
        assertEquals("Conta Residencial{instalacao=3, titular='Maria Luisa Fernandes', resultado=Acima do limite}", conta.getInfo());
    }
}
