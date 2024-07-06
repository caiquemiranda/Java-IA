import java.util.Random;
import java.util.Scanner;

public class CanetaModel {

    private String cor;
    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public CanetaModel(String cor, String marca, String modelo, double preco, int quantidade) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "CanetaModel{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void aberta() {
        System.out.println("Caneta está aberta.");
    }

    public void nivelTinta() {

        double nivelTinta = 100;

        while (nivelTinta > 5) {

            Random random = new Random();
            double numero = random.nextDouble();

            nivelTinta = nivelTinta - numero;

            System.out.println(nivelTinta);
            System.out.println(numero);

            if (nivelTinta <= 50 && nivelTinta > 25) {
                System.out.println("Caneta está com um nível de tinta médio.");

            } else if (nivelTinta <= 25 && nivelTinta >= 5) {
                System.out.println("Caneta está com um nível de tinta baixo. carrege a caneta");
                boolean carregar = true;

                while (carregar) {
                    System.out.println("Quer carregar a caneta agora?(s/n)");
                    Scanner scanner = new Scanner(System.in);
                    String resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        nivelTinta = 100;
                        carregar = false;
                        System.out.println("Caneta carregada.");

                    } else if (resposta.equalsIgnoreCase("n")) {
                        System.out.println("Caneta não carregada.");
                        carregar = false;
                        break;
                    }
                }
            } else {
                System.out.println("Caneta está sem Tinta. Não escreve mais.");
            }
        }
    }

    public void status() {
        nivelTinta();
        aberta();
    }

    public void Escrever() {
        status();
        System.out.println("Escrevendo...");
    }

}
