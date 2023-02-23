package pooejercicios;

import java.util.Scanner;

/**
 *
 * @author Guerra
 */
public class TestCuentas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cuentas c1 = new Cuentas();
        c1.cuenta = 500.00f;

        Cuentas c2 = new Cuentas();
        c2.cuenta = 300.00f;
        float dinero;
        int cuenta;

        int menu = 0;

        while (menu != 4) {
            System.out.println("""
                               1. Abonar cuenta
                               2. Debitar cuenta
                               3. mostrar.
                               4. salir
                               """);
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese cuanto abonar: ");
                    dinero = in.nextFloat();
                    System.out.println("Quiere abonar a cuenta '1' o cuenta '2' ? ");
                    cuenta = in.nextInt();
                    if (cuenta == 1) {
                        System.out.println("Abonaste " + dinero + ", a la cuenta " + cuenta);
                        c1.acreditarCuentas(dinero);
                        System.out.println("Ahora tu saldo es de: " + c1);
                    } else if (cuenta == 2) {
                        System.out.println("Abonaste " + dinero + ", a la cuenta " + cuenta);
                        System.out.println("Ahora tu saldo es de: " + c2);
                        c2.acreditarCuentas(dinero);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese cuanto dinero Debitar: ");
                    dinero = in.nextFloat();
                    System.out.println("De que cuenta debitar, cuenta '1' o cuenta '2' ? ");
                    cuenta = in.nextInt();
                    if (cuenta == 1) {
                        if (c1.cuenta > 0) {
                            System.out.println("Debitaste " + dinero + ", a la cuenta " + cuenta);
                            c1.debitarCuentas(dinero);
                            System.out.println("Aun tienes " + c1 + " en tu cuenta :) ");
                        } else {
                            System.out.println("Saldo Insuficiente :(  ");
                        }
                    } else if (cuenta == 2) {
                        if (c2.cuenta > 0) {
                            System.out.println("Debitaste " + dinero + ", a la cuenta " + cuenta);
                            c2.debitarCuentas(dinero);
                            System.out.println("Aun tienes " + c2 + " en tu cuenta :) ");
                        }else{
                            System.out.println("Saldo Insuficiente :(  ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Resumen de cuentas: ");
                    System.out.println("Cuenta 1: " + c1);
                    System.out.println("Cuenta 2: " + c2);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo!");
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }
        }
    }
}
