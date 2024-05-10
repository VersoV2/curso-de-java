package KZ.Verso.Aulas;

public class Aula005_condicionais {
    public static void main(String[] args) {

        int idade = 17;

        boolean PermitidoCompraBebida = idade >= 18;

        if (PermitidoCompraBebida) {
            System.out.println("permitido comprar bebida");
        }

        if (!PermitidoCompraBebida) { //o "!" é usado  para caso o valor da comparação seja falso no boolean la encima
            System.out.println("não permitido comprar bebida");
        }

    }
}
