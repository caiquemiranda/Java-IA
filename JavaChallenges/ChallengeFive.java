package JavaChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChallengeFive {

    public class ControleSimplesDeSaques {

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {

                double limiteDiario = Double.parseDouble(br.readLine());

                for (int i = 1;; i++) {
                    double valorSaque = Double.parseDouble(br.readLine());

                    if (valorSaque == 0) {
                        System.out.println("Transacoes encerradas.");
                        break;
                    } else if (valorSaque > limiteDiario) {
                        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                        break;
                    } else {

                        limiteDiario -= valorSaque;
                        System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
                    }
                }
            } catch (IOException e) {

                System.out.println("Erro de I/O: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada invalida. Por favor, insira um numero valido.");
            }
        }
    }

}
