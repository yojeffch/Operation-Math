import java.util.Scanner;
public class OperacionesMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer dato por favor");
        int num1 = sc.nextInt();

        System.out.println(" Ingresa el segundo dato por favor");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicación de los numeros es: " + multiplicacion);
        System.out.println("La división de los numeros es: " + division);
        sc.close();

    }

}
