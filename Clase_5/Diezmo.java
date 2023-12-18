package Clase_5;
import java.util.Scanner;
public class Diezmo {
    public static void main(String[] args) {

        System.out.println("Cuanto Ganaste");
        Scanner ingresoSalario = new Scanner(System.in);
        double salario = ingresoSalario.nextDouble();

        double diezmo = salario * 0.1;
        System.out.println("El diezmo de "+ salario + " es: " + diezmo);
    }
}
