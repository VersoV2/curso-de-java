package KZ.Verso.Aulas;

public class Aula005_condicionais2 {
    public static void main(String[] args) {

        String categoria;

        int idade = 13;

        if(idade <= 14) {
            categoria = "A idade o qualifica para futebol infantil";

        } else if (idade > 14 && idade < 18) {
            categoria = "a idade o qualifica para futebol juvenil";

        } else {
            categoria = "a idade o qualifica para futebol adulto";
        }

        System.out.println(categoria);

    }
}
