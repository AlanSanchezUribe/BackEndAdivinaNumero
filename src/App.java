import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ingreso = new Scanner(System.in);
        int numeroSecreto = 0;
        int intentos = 0;
        int numeroIngresado = 0;

        numeroSecreto = new Random().nextInt(100);

        while (numeroIngresado != numeroSecreto) {
            System.out.println("Ingresa un numero: ");
            numeroIngresado = ingreso.nextInt();
            intentos++;

            if (numeroIngresado < numeroSecreto) {
                System.out.println("El numero es mayor");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("El numero es menor");
            }

            System.out.println("Intentos: " + intentos);

            if (numeroIngresado == numeroSecreto) {
                System.out.println("Felicidades, adivinaste");
            }   

            if (intentos == 5) {
                System.out.println("Perdiste, el numero era: " + numeroSecreto);
                break;
            }
        }

        System.out.println("Gracias por jugar");
    }
}
