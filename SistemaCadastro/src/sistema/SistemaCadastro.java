package sistema;

import sistema.cadastro.Pessoa;

public class SistemaCadastro {
    public static void main(String[] args) throws Exception {

        Pessoa caique = new Pessoa("Caique", "111.111.111-11");

        caique.setIdade(31);
        caique.setEndereco("Rua dos Coqueiros, Bahia");


        System.out.println(caique.getNome() + " - " + caique.getEndereco());
        System.out.println(caique.getNome() + " CPF :" + caique.getCpf());
    }
}
