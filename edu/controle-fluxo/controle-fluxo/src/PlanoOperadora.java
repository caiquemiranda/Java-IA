public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        /*
        if (plano == "B") {
            System.out.println("100 Minutos de Ligação");

        } else if (plano == "M") {;
            System.out.println("100 Minutos de Ligação");
            System.out.println("Whats e Instagram grátis");

        } else if (plano == "T") {
            System.out.println("100 Minutos de Ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5GB YouTube");

        }*/

        //switch case

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 Minutos de Ligação");
            }
                
        }
    }
}
