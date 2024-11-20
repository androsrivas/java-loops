import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7.
        //Has de usar la función getRandomNumber
        int number = 0;

        while ( number != 7) {
            number = getRandomNumber(10);
            System.out.println("Número generado: " + number);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70.
        //Has de usar la función getRandomNumber
        number = 0;

        while (number < 70) {
            number = getRandomNumber(70);
            System.out.println("Número generado: " + number);
        }


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100.
        //El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos
        //hasta que el usuario adivine correctamente.
        //Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor
        //que el número generado. Has de usar la función getRandomNumber
        Scanner input = new Scanner(System.in);

        int inputNumber = 0;
        int generatedNumber = getRandomNumber(100);

        do {
            System.out.println("Adivina el número generado");
            inputNumber = input.nextInt();
        } while(inputNumber != generatedNumber);

        System.out.println("Muy bien. El número era: " + generatedNumber);
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
