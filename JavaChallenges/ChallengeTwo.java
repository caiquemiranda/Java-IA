package JavaChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChallengeTwo {

    public class VerificadorNumeroConta {

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                String numeroConta = br.readLine();
                verificarNumeroConta(numeroConta);
                System.out.println("Numero de conta valido.");

            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
            } catch (IOException e) {

                System.out.println("Erro de I/O: " + e.getMessage());
            }
        }

        private static void verificarNumeroConta(String numeroConta) {
            if (numeroConta.length() != 8) {
                throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
            }
        }
    }

}
