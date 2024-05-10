package KZ.Verso.Aulas;

public class Aula05_condicionais_Switch {
    public static void main (String[] args) {

        byte dia = 3;
        String diaDaSemana = "";

        switch (dia) {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda";
                break;
            case 3:
                diaDaSemana = "terça";
                break;
            case 4:
                diaDaSemana = "quarta";
                break;
            case 5:
                diaDaSemana = "quinta";
                break;
            case 6:
                diaDaSemana = "sexta";
                break;
            case 7:
                diaDaSemana = "sabádo";
                break;
            default:
                diaDaSemana = "número invalido";
                break;
        }

        System.out.println(diaDaSemana);

    }
}
