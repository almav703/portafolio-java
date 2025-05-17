import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("⚠Saldo insuficiente. Intenta con un monto menor.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    continue; // vuelve al menú sin terminar el programa
            }
        } while (opcion != 4);
    }
}

