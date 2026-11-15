public class Hospede {

    private String nome;
    private Cidade cidadeOrigem;

    public Hospede(String nome, Cidade cidadeOrigem) {
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
    }

    public String obterHospede() {
        return "Hospede{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeOrigem.getNome() + '\'' +
                ", uf='" + cidadeOrigem.getUf() + '\'' +
                '}';
    }
}
