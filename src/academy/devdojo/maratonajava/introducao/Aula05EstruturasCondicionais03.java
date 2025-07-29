package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //dor se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        //String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda nao tenho condicoes, mas vou ter!"
        // boolean possoDoar = salario > 5000 ? true : false;
        //boolean possoDoar = salario > 5000; mesma coisa que acima
        System.out.println(resultado);
    }
}
