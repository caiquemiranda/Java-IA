package JavaChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChallengerFour {

    public class VerificacaoChequeEspecial {

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {

                double saldo = Double.parseDouble(br.readLine());

                double saque = Double.parseDouble(br.readLine());

                double limiteChequeEspecial = 500;

                if (saque <= saldo) {

                    System.out.println("Transacao realizada com sucesso.");
                } else {

                    if (saque <= saldo + limiteChequeEspecial) {

                        System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
                    } else {

                        System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
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