package academy.devdojo.maratonajava.introdução;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double
        //boolean false
        //string null

        String[] nomes = new String[4];
            nomes[0] = "joão";
            nomes[1] = "carlos";
            nomes[2] = "josé";
            nomes[3] = "vitor";

            for (int i = 0; i < 4; i++) {
                System.out.println(nomes[i]);

            }

    }
}
