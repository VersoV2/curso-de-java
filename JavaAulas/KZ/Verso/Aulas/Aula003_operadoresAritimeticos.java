package KZ.Verso.Aulas;

public class Aula003_operadoresAritimeticos {
    public static void main(String[] args) {
        String valor1 = "1";
        String valor2 =  "1";

        int valor = 1;

        double contaPoupanca = 10000f;
        double contaCorrente = 100f;

        double valorComputador = 5000;

        boolean possoComprar = contaPoupanca > valorComputador || contaCorrente > valorComputador;

        if (possoComprar == true) {
            System.out.println("você tem o valor suficiente para a compra");
        } else {
            System.out.println("seu saldo não é o suficiente");
        }


        System.out.println(valor1+valor2);
    }

}
