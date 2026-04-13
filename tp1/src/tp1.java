import java.util.Scanner;


public class tp1 {
    int notas;


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in
        );

        System.out.println("introduce la nota del alumno");
        int notas = sc.nextInt();
        if (notas <= 4){
            System.out.println("Desaprobo la materia");
        }
        else if (notas >= 4){
            System.out.println("Aprobo la materia");

        }else if (10 == notas){
            System.out.println("Es SOBRESALIENTE");

        }
    }
}