package academy.devdojo.maratonajava.introducao;

import   java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua renda anual");
        double rendaAnual = input.nextDouble();
        double  impostoSobRendaAnual;

        if (rendaAnual <= 34712){
            impostoSobRendaAnual = rendaAnual * 9.70/100;
        }else if (rendaAnual <= 68507){
            impostoSobRendaAnual = rendaAnual * 37.35/100;
        }else{
            impostoSobRendaAnual = rendaAnual * 49.50/100;
        }

        System.out.println("O imposto sobre a sua renda anual é: "+impostoSobRendaAnual);
    }
}