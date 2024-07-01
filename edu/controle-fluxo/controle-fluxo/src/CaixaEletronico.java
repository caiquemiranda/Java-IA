public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado <= saldo) {
            System.out.println("Saque efetuado com sucesso!");
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
