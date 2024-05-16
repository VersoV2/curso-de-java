package KZ.Verso.Aulas;

public class Aula008_arraysMultidimencionais01 {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 30;
        dias [1][1] = 31;
        dias [1][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("_____________________");

        // foreach de arrays multidimencionais.

        for (int [] arrBase : dias) {
            for (int itens : arrBase) {
                System.out.println(itens);
            }
        }

    }
}
