import java.util.Scanner;

public class tp6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de triangulos: ");
        int n = teclado.nextInt();

        Operacion op = new Operacion();
        op.procesar(n);
    }
}

class Operacion {
    public void procesar(int cantidad) {
        Scanner lector = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Triangulo " + i);
            System.out.print("Lado A: ");
            int la = lector.nextInt();
            System.out.print("Lado B: ");
            int lb = lector.nextInt();
            System.out.print("Lado C: ");
            int lc = lector.nextInt();

            if (la == lb && la == lc) {
                System.out.println("Es equilatero");
                c1++;
            } else if (la == lb || la == lc || lb == lc) {
                System.out.println("Es isosceles");
                c2++;
            } else {
                System.out.println("Es escaleno");
                c3++;
            }
        }

        System.out.println("Equilateros: " + c1);
        System.out.println("Isosceles: " + c2);
        System.out.println("Escalenos: " + c3);

        if (c1 < c2 && c1 < c3) {
            System.out.println("Menor cantidad: Equilatero");
        } else if (c2 < c3) {
            System.out.println("Menor cantidad: Isosceles");
        } else {
            System.out.println("Menor cantidad: Escaleno");
        }
    }
}