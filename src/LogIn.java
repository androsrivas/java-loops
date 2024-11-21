import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña,
        //escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar'
        //mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la contraseña sean correctos imprime en terminal: ¡Acceso concedido!
        Scanner input = new Scanner(System.in);

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        String inputUsername;
        String inputPassword;

        do {
            System.out.print("Por favor, ingresa tu usuario: ");
            inputUsername = input.next();

            System.out.print("Por favor, ingresa tu contraseña: ");
            inputPassword = input.next();

            if (!correctUsername.equalsIgnoreCase(inputUsername) || !correctPassword.equalsIgnoreCase(inputPassword)) {
                System.out.println("Datos incorrectos. Por favor, vuelve a intentarlo.");
            }
        } while (!correctUsername.equalsIgnoreCase(inputUsername) || !correctPassword.equalsIgnoreCase(inputPassword));

        System.out.println("¡Acceso concedido!");

        input.close();
    }
}
