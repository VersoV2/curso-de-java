package KZ.Verso.Aulas;

public class Aula007_arrays03 {
    public static void main(String[] args) {

        int numero = 3;

        String [] nomes = new String[numero];

        nomes [0] = "Pedro";
        nomes [1] = "Verso";

        for (String num : nomes) {
            System.out.println(num);
        }

    }
}
