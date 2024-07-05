public class SistemaLocacao {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("ABC1234",
                "Chevrolet",
                "Onix",
                2020,
                2.5,
                1000,
                2000);

        System.out.println("Valor da locação: "
                + veiculo.calcularValorLocacao());
    }

}
