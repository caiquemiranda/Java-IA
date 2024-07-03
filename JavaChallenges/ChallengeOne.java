package JavaChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChallengeOne {

    public class SimulacaoBancaria {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double saldo = 0;
            boolean continuar = true;

            while (continuar) {
                int opcao = Integer.parseInt(br.readLine());

                switch (opcao) {
                    case 1:
                        double deposito = Double.parseDouble(br.readLine());
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.println("Saldo atual: " + saldo);
                        } else {
                            System.out.println("Valor de depósito inválido.");
                        }
                        break;
                    case 2:
                        double saque = Double.parseDouble(br.readLine());
                        if (saque > 0 && saque <= saldo) {
                            saldo -= saque;
                            System.out.println("Saldo atual: " + saldo);
                        } else if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            System.out.println("Valor de saque inválido.");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false; // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

}
