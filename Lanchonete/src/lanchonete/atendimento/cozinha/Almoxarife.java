package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("controlando a entrada de Produtos");
    }

    private void controlarSaida() {
        System.out.println("controlando a saída de Produtos");
    }

    private void controlarEstoque() {
        System.out.println("controlando o estoque de Produtos");
    }

    private void controlarPedidos() {
        System.out.println("controlando os pedidos dos clientes");
    }

    void trocarGas() {
        System.out.println("Almoxarife trocando o gás do fogão");
    }

    void entregarIngredientes() {
        System.out.println("Almoxarife entregando os ingredientes.");
        controlarPedidos();
        controlarEstoque();
        controlarSaida();
    }

}
