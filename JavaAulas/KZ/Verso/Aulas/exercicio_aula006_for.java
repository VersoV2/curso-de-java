package KZ.Verso.Aulas;

public class exercicio_aula006_for {
    public static void main(String[]  args) {

        // mostrar os numeros de 1 a 1000 apenas os números pares

        for(int numero = 1; numero< 1001; numero +=1) {
            int resto = numero % 2;

            if (resto == 0) {
                System.out.println(numero);
            }

        }

    }
}
