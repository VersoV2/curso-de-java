package KZ.Verso.Aulas;

public class Aula007_arrays02 {
    public static void main(String[] args) {

        int numero = 3;

        String [] nomes = new String[numero];

        nomes [0] = "Pedro";
        nomes [1] = "Verso";
        //nome 2 vai retornar como null pois não há nada nele

        for (int i = 0; i < nomes.length; i++) {

            System.out.println(nomes[i]);

        }



    }
}
