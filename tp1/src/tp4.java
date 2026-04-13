import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese dia: ");
        int d = sc.nextInt();
        System.out.print("Ingrese mes: ");
        int m = sc.nextInt();
        System.out.print("Ingrese año: ");
        int a = sc.nextInt();

        Calendario cal = new Calendario();
        cal.determinarTrimestre(m);
    }
}

class Calendario {
    public void determinarTrimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            System.out.println("Corresponde al primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Corresponde al segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Corresponde al tercer trimestre");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Corresponde al cuarto trimestre");
        } else {
            System.out.println("Mes invalido");
        }
    }
}