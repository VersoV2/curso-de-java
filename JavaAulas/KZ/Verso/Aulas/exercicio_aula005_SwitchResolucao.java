package KZ.Verso.Aulas;

public class exercicio_aula005_SwitchResolucao {
    public static void main(String[] args) {

        byte dia = 2;

        switch (dia){
            case 1:
            case 7:
                System.out.println("não é dia util");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("é um dia util");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

    }
}
