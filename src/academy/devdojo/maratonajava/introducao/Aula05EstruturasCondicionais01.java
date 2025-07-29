package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        //!
        if(isAutorizadoComprarBebida) {
            System.out.println("Venda Permitida");
        }else {
            System.out.println("Venda Proibida");
        }
        if(!isAutorizadoComprarBebida ) {
            System.out.println("Venda");
        }

    }
}
