import java.util.Scanner;

public class Parciales {
    double n1, n2, n3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Parciales alumno = new Parciales();

        System.out.println("introduce la nota del parcial 1:");
        alumno.n1 = sc.nextDouble();
        System.out.println("introduce la nota del parcial 2:");
        alumno.n2 = sc.nextDouble();
        System.out.println("introduce la nota del parcial 3:");
        alumno.n3 = sc.nextDouble();

        double promedio = (alumno.n1 + alumno.n2 + alumno.n3) / 3;
        System.out.println("el promedio final es: " + promedio);

        if (promedio >= 8) {
            System.out.println("estado: PROMOCIONADO");
        } else {
            System.out.println("estado: NO PROMOCIONADO");
        }
    }
}



