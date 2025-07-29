package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        System.out.println("Qual dia da semana que deseja ver?");
        Scanner sc = new Scanner(System.in);
        int diaUtilOuFimDS = sc.nextInt();

        switch (diaUtilOuFimDS) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Dia invalido");
                break;

                // case 1:
                // case 7: System.out.println("FDS")
                // case 2:
                // case 3: System.out.println("Dia Útil")
        }
    }
}
