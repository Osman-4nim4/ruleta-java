import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner ana = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("*******Ruleta de la fortuna*****");
            System.out.println("*******Bienvenido***************");
            System.out.println("Elige la opcion que desees ... ");
            System.out.println("1. Girar ruleta de la suerte 7u7");
            System.out.println("2. Amonos");

            opcion = ana.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Los premios de este día son...: ");
                    System.out.println("Ropa cara");
                    System.out.println("Pisto");
                    System.out.println("Casa");
                    System.out.println("Novia 7u7");
                    System.out.println("Ser inteligente");

                    String[] b = {"Ropa cara", "Pisto", "Casa", "Novia 7u7", "Ser inteligente"};
                    Random rand = new Random();

                    int n = rand.nextInt(5);
                    String a = b [n];

                    System.out.println("El premio que le toco es...: " + a);
                }
                case 2 -> salir = true;
                default -> System.out.println("Seleccion una de las dos opciones....");
            }
        }

        System.out.println("Aqui termina el programa, nos vemos luego bro");
    }
}

