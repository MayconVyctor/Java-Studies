package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int ageOfMike = (int) 10000000000L;
        long numeroGrande = 10000;
        double salaryDouble = 2500.00;
        float salaryFloat = 2000.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean ageBooll = true;
        boolean ageBool2 = false;
        char caracterChar = '\u0041';

        String nome = "Mike";

        System.out.println("The age of Mike is " + ageOfMike);
        System.out.println("He's name is " + nome);
    }
}
