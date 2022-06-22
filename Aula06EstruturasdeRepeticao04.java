package academy.devdojo.maratonajava.introdução;
//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
//Condição valorParcela >= 1000

public class Aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
       double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("parcela "+ parcela + " R$ " + valorParcela);
            }

        }
    }
}
