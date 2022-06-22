package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (idade >= 18) {
            System.out.println("autorizado a comprar bebida alcolica");
        }
        else{
            System.out.println("nao autorizado a comprar bebida");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }
    }
}
