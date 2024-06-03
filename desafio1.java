import java.util.Random;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int aletorio = new Random().nextInt(100);
        int adivina = 0;

        System.out.println(aletorio);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero: ");
            adivina = numero.nextInt();
            if (aletorio > adivina){
                System.out.println("El numero que ingresaste es menor");
            } else if (aletorio < adivina) {
                System.out.println("El numero que ingresaste es mayor");
            }else {
                System.out.println("Ganaste exacto el numero es: " + aletorio);
            }
        }
    }
}
