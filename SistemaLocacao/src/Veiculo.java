public class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valorKmRodado;
    private double kmInicial;
    private double kmFinal;

    public Veiculo(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorKmRodado = valorKmRodado;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
    }

    public double calcularValorLocacao() {
        return (this.kmFinal - this.kmInicial) * this.valorKmRodado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorKmRodado() {
        return valorKmRodado;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

}
