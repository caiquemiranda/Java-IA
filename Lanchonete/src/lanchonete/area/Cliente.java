package lanchonete.area;

public class Cliente {

    public void escolherLanche() {
        System.out.println("Escolhendo lanche.");
    }

    public void fazerPedido() {
        System.out.println("Fazendo pedido.");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando conta.");
    }

    public void pegarPedidoBalcao() {
        System.out.println("Pegando pedido no balcão.");
    }

    private void consultarSaldoAplicativo() {
        System.out.println("Consultando saldo no aplicativo.");
    }

}
