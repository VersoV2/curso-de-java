package KZ.Verso.Aulas;

public class exercicio_aula005_Switch {
    public static void main (String[] args) {

        byte dia = 1;
        String diaDaSemana = "";
        String diaUtil = "";

        switch (dia) {
            case 1:
                diaDaSemana = "domingo";
                diaUtil = "não é um dia util";
                break;
            case 2:
                diaDaSemana = "segunda";
                diaUtil = "é um dia util";
                break;
            case 3:
                diaDaSemana = "terça";
                diaUtil = "é um dia util";
                break;
            case 4:
                diaDaSemana = "quarta";
                diaUtil = "é um dia util";
                break;
            case 5:
                diaDaSemana = "quinta";
                diaUtil = "é um dia util";
                break;
            case 6:
                diaDaSemana = "sexta";
                diaUtil = "é um dia util";
                break;
            case 7:
                diaDaSemana = "sabádo";
                diaUtil = "não é um dia util";
                break;
            default:
                diaDaSemana = "número invalido";
                break;
        }

        System.out.println("é "+ diaDaSemana+ " então "+ diaUtil);

    }
}
