
package Clases;

/**
 *
 * @author Leonel
 */
import java.util.Scanner;

public class AutenticacionOperador {
    private static String USUARIO = "admin";
    private static String CONTRASE�A = "123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de autenticaci�n de operadores.");
        System.out.println("Por favor, ingrese sus credenciales.");

        for (int i = 0; i < 3; i++) { // M�ximo 3 intentos de autenticaci�n
            System.out.print("Usuario: ");
            String operador = scanner.nextLine();

            System.out.print("Contrase�a: ");
            String contra = scanner.nextLine();

            if (USUARIO.equals(operador) && CONTRASE�A.equals(contra)) {
                System.out.println("Acceso concedido. Bienvenido al sistema.");
                break;
            } else {
                System.out.println("Credenciales incorrectas. Intente de nuevo.");
            }
        }
    }
}

