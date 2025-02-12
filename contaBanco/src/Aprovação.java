public class Aprovação {

    public static void main(String[] args) {

        int nota = 7;

        String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperação" : "reprovado";

        System.out.println(resultado);

    }
}
