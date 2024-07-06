public class MaterialEscolar {
    public static void main(String[] args) throws Exception {
        CanetaModel caneta = new CanetaModel("Azul",
                "Bic",
                "Cristal",
                2.5,
                10);

        System.out.println(caneta);

        caneta.setCor("Preta");
        caneta.setMarca("Compactor");
        caneta.setModelo("Neo Grip");
        caneta.setPreco(3.5);
        caneta.setQuantidade(5);

        System.out.println(caneta);
        caneta.status();
    }
}
