package KZ.Verso.Aulas;

public class exercicio_aula005 {
    public static void main(String[] args) {

        //calculadora de imposto

        double salarioMensal = 2800;

        float taxaDeJuros;

        if (salarioMensal > 2560 && salarioMensal < 2825) {
            taxaDeJuros = 7.5F;

        } else if (salarioMensal > 2825 && salarioMensal < 3750) {
            taxaDeJuros = 15.0f;

        } else if (salarioMensal >= 3750 && salarioMensal < 4660) {
            taxaDeJuros = 22.5f;

        } else if (salarioMensal > 4660) {
            taxaDeJuros = 27.5f;

        } else {
            taxaDeJuros = 0;

        }

        double umPorCento = salarioMensal / 100;
        double porcentagemDeJuros = umPorCento * taxaDeJuros;

        System.out.println("a taxa de juros do salario é de "+ taxaDeJuros+ " por tanto o valor que você ira pagar em juros será "+ porcentagemDeJuros);

    }
}
