package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario for > que 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        //(condicao) ? verdadeiro : falso operador ternário
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
