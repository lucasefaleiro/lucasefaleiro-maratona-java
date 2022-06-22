package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais04 {
    //€ 0       €34,712  9,70%
    //€ 34.713  €68.587  37.35%
    //€ 68.588           49.58%
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.58 / 100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >=34712 && salarioAnual <=68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
