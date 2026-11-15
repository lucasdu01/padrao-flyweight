import java.util.ArrayList;
import java.util.List;

public class Pousada {

    private List<Hospede> hospedes = new ArrayList<>();

    public void hospedar(String nomeHospede, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Hospede hospede = new Hospede(nomeHospede, cidade);
        hospedes.add(hospede);
    }

    public List<String> obterHospedes() {
        List<String> saida = new ArrayList<String>();
        for (Hospede hospede : this.hospedes) {
            saida.add(hospede.obterHospede());
        }
        return saida;
    }


}
