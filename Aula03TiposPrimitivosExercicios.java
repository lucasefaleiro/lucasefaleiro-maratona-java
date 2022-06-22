package academy.devdojo.maratonajava.introdução;
/*
 Prática

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "carlos";
        String endereço = "Rua Lazarino Ricci,n 34,Centro,Ibitirama";
        double salario = 2500.00;
        String dataRecebimentoSalario = "20/02/2022";

        System.out.println("eu " +nome+",morando no endereço "+endereço+",confirmo que recebi o salário de "+salario+",na data "+dataRecebimentoSalario);

    }

}
