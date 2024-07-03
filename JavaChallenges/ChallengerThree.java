package JavaChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChallengerThree {

    public class VerificadorElegibilidadeConta {

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                int idade = Integer.parseInt(br.readLine());

                if (idade >= 18) {
                    System.out.println("Voce esta elegivel para criar uma conta bancaria.");
                } else {
                    System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
                }
            } catch (IOException e) {
                System.out.println("Erro de I/O: " + e.getMessage());
            } catch (NumberFormatException e) {

                System.out.println("Erro: Entrada invalida. Por favor, insira um numero inteiro.");
            }
        }
    }

}
