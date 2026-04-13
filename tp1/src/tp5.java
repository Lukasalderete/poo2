import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese coordenada x: ");
        int x = teclado.nextInt();
        System.out.print("Ingrese coordenada y: ");
        int y = teclado.nextInt();

        Plano p = new Plano();
        p.ubicarPunto(x, y);
    }
}

class Plano {
    public void ubicarPunto(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("1º Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º Cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4º Cuadrante");
        } else {
            System.out.println("El punto esta sobre un eje o en el origen");
        }
    }
}