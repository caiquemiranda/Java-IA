package lanchonete;

import lanchonete.area.Cliente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.Atendente;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adcionarLancheNoBalcao();
        cozinheiro.adcionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
