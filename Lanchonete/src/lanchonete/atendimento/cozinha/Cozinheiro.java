package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;;

public class Cozinheiro {

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando ingredientes vitamina");
    }

    private void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }

    public void adcionarLancheNoBalcao() {
        System.out.println("Adcionando Lanche Natural no balcão");
    }

    public void adcionarSucoNoBalcao() {
        System.out.println("Adcionando Suco de Laranja no balcão");
    }

    public void adicionarComboNoBalcao() {
        adcionarLancheNoBalcao();
        adcionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche natural");
    }

}
