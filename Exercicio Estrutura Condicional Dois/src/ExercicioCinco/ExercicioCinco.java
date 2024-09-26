package ExercicioCinco;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O dobro do número é: " + (numero * 2));
        } else {
            System.out.println("O triplo do número é: " + (numero * 3));
        }
    }
}
