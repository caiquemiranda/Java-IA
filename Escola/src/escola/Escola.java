package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno caique = new Aluno();

        caique.setNome("Caique");
        caique.setIdade(31);
        System.out.println("O aluno " + caique.getNome() + 
                           " tem "+ caique.getIdade() + 
                           " anos de idade.");
    }
}
