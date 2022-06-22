package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando 1 como domingo
        //switch (so cabe tipos char, int, byte, short, enum, string

        byte dia = 10;

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opcao invalida");

        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("masculino");
                break;
            case 'F':
                System.out.println("feminino");
        }
    }
}
