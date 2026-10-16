package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaEnergiaComercialTest {

    @Test
    void deveRetornarDentroDoLimite() {
        ContaEnergiaComercial conta = new ContaEnergiaComercial();
        conta.setLeituraAnterior(2000.0);
        conta.setLeituraAtual(2500.0);
        assertEquals("Dentro do limite", conta.verificarFaixaConsumo());
    }

    @Test
    void deveRetornarAcimaDoLimite() {
        ContaEnergiaComercial conta = new ContaEnergiaComercial();
        conta.setLeituraAnterior(2000.0);
        conta.setLeituraAtual(2501.0);
        assertEquals("Acima do limite", conta.verificarFaixaConsumo());
    }

    @Test
    void deveRetornarInformacoes() {
        ContaEnergiaComercial conta = new ContaEnergiaComercial();
        conta.setLeituraAnterior(2000.0);
        conta.setLeituraAtual(2500.0);
        conta.setTitular("Padaria e Confeitaria Sul América");
        conta.setInstalacao(4);
        assertEquals("Conta Comercial{instalacao=4, titular='Padaria e Confeitaria Sul América', resultado=Dentro do limite}", conta.getInfo());
    }
}
