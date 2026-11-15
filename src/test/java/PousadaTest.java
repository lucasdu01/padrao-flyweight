import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PousadaTest {

    @Test
    void deveRetornarHospedes() {
        Pousada pousada = new Pousada();
        pousada.hospedar("Jose", "Juiz de Fora", "MG");
        pousada.hospedar("Maria", "Juiz de Fora", "MG");
        pousada.hospedar("Ana", "Juiz de Fora", "MG");
        pousada.hospedar("Joao", "Santos Dumont", "MG");

        List<String> saida = Arrays.asList(
                "Hospede{nome='Jose', cidade='Juiz de Fora', uf='MG'}",
                "Hospede{nome='Maria', cidade='Juiz de Fora', uf='MG'}",
                "Hospede{nome='Ana', cidade='Juiz de Fora', uf='MG'}",
                "Hospede{nome='Joao', cidade='Santos Dumont', uf='MG'}");

        assertEquals(saida, pousada.obterHospedes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Pousada pousada = new Pousada();
        pousada.hospedar("Jose", "Juiz de Fora", "MG");
        pousada.hospedar("Maria", "Juiz de Fora", "MG");
        pousada.hospedar("Ana", "Juiz de Fora", "MG");
        pousada.hospedar("Joao", "Santos Dumont", "MG");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}
