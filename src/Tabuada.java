import java.util.Scanner;


/**
 * Neste código iremos te ensinar tabuda de uma maneira bem divertida!
 *
 * siga os passos abaixo:
 *
 * 1 - Abra seu terminal.
 * 2 - Digite javac Tabuada.java, para ser compilado no JAVA.
 * 3- Digite java tabuada para rodar o código,na qual requer sua interção.
 *
 * Agora é só se divertir,espero que tenha gostado !
 *
 *
 *
 * @author Raphael Cavalcante
 */

public class Tabuada {
    public static void main(String[] args) {
        // Criação de um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário informar o número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibindo a tabuada do número informado
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fechar o scanner
        scanner.close();
    }
}
