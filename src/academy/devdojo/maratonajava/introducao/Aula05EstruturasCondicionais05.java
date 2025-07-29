package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana
        System.out.println("Qual dia da semana que deseja ver?");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
