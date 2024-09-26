package ExercicioDois;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.nextLine().toUpperCase();

        System.out.print("Digite o estado civil: ");
        String estadoCivil = scanner.nextLine().toUpperCase();

        if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
            System.out.print("Informe o tempo de casada (anos): ");
            int tempoCasada = scanner.nextInt();
            System.out.println("Tempo de casada: " + tempoCasada + " anos.");
        }
    }
}
