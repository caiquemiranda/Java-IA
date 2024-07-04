public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());

        }

        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        System.out.println("Sigla: " + eb.getSigla());
        System.out.println("Nome: " + eb.getNome());
        System.out.println("Nome Maiusculo: " + eb.getNomeMaiusculo());
        System.out.println("Codigo IBGE: " + eb.getIbge());

        EstadoBrasileiro ebx = EstadoBrasileiro.SAO_PAULO;

        System.out.println("Sigla: " + ebx.getSigla());
        System.out.println("Nome: " + ebx.getNome());
        System.out.println("Nome Maiusculo: " + ebx.getNomeMaiusculo());
        System.out.println("Codigo IBGE: " + ebx.getIbge());

    }
}
