package KZ.Verso.Aulas;

public class Aula006_estruturaDeRepeticao {
    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador += 1;
        }
        int dowhilecontador = 0;




        do {
            System.out.println(dowhilecontador);
            dowhilecontador += 1;
        } while (dowhilecontador < 10);




        for(int i=1; i<10; i++) {
            System.out.println(i);
        }


    }


}
