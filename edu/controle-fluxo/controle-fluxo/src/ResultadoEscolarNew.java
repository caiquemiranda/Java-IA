public class ResultadoEscolarNew {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        //String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);


        String result = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota <7) ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + result);
    }
}