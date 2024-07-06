package test;
import java.util.Scanner;

public class TesteCondicoes {
    public static void main(String[] args) {
        boolean carregar = true;

        while (carregar) {
            System.out.println("Quer carregar a caneta agora?(s/n)");
            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                //nivelTinta = 100;
                carregar = false;
                System.out.println("Caneta carregada.");

            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Caneta não carregada.");
                carregar = false;
                break;
            }
        }
    }
}
