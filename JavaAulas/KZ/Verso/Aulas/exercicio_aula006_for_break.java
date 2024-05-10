package KZ.Verso.Aulas;

public class exercicio_aula006_for_break {
    public static void main(String[] args) {

        double valorDoCarro = 40000;
        for (int parcela = 1; parcela < valorDoCarro; parcela++) {

            double valorDaParcela = valorDoCarro / parcela;

            if (valorDaParcela >= 1000) {
                System.out.println("parcela "+ parcela+ " R$ "+valorDaParcela );
            } else {
                break;
            }

        }


        System.out.println();
    }
}
