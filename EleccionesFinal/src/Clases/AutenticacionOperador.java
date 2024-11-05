
package Clases;

/**
 *
 * @author Leonel
 */
import java.util.Scanner;

public class AutenticacionOperador {
    private static String USUARIO = "admin";
    private static String CONTRASEÑA = "123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de autenticación de operadores.");
        System.out.println("Por favor, ingrese sus credenciales.");

        for (int i = 0; i < 3; i++) { // Máximo 3 intentos de autenticación
            System.out.print("Usuario: ");
            String operador = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contra = scanner.nextLine();

            if (USUARIO.equals(operador) && CONTRASEÑA.equals(contra)) {
                System.out.println("Acceso concedido. Bienvenido al sistema.");
                break;
            } else {
                System.out.println("Credenciales incorrectas. Intente de nuevo.");
            }
        }
    }
}

