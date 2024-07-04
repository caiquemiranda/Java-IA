
public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 21),
    MINAS_GERAIS("MG", "Minas Gerais", 31),
    BAHIA("BA", "Bahia", 71),
    PARANA("PR", "Paraná", 51),
    GOIAS("GO", "Goiás", 61),
    PIAUI("PI", "Piauí", 81),
    MARANHAO("MA", "Maranhão", 91);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}