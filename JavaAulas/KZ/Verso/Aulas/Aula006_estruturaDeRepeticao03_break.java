package KZ.Verso.Aulas;

public class Aula006_estruturaDeRepeticao03_break {
    public static void main(String[] args) {

        int valorMaximo = 50;

        for (int i = 0; i < valorMaximo ; i++) {

            if(i > 25){
                break;
            }

            System.out.println(i);

        }

    }
}
