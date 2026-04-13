import java.util.Scanner;

public class tp3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero (1-99): ");
        int num = teclado.nextInt();

        Validador v = new Validador();
        v.chequear(num);
    }
}

class Validador {
    public void chequear(int n) {
        if (n >= 1 && n <= 9) {
            System.out.println("El numero tiene un solo digito");
        } else if (n >= 10 && n <= 99) {
            System.out.println("El numero tiene dos digitos");
        } else {
            System.out.println("Numero fuera del rango permitido");
        }
    }
}