package e5g7cuenta;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    //
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    //  

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    //
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //
    public void crearCuenta() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("\n Ingrese datos del cliente: \n");
        System.out.print("Número de cuenta: ");
        numeroCuenta = entrada.nextInt();
        System.out.print("DNI: ");
        dniCliente = entrada.nextLong();
        do {
            System.out.print("Saldo actual: ");
            saldoActual = entrada.nextDouble();
            if (saldoActual < 5) {
                System.out.println("Error, ingrese valores mayor o igual a 5 ");
            }
        } while (saldoActual < 5);
        System.out.println("\n Datos guardados ");
    }

    //
    public void ingresoDinero(double ingresado) {

        if (ingresado > 0) {
            saldoActual += ingresado;
            System.out.println("Datos guardados, saldo actual: $ " + saldoActual);
        } else {
            System.out.println("Error, ingrese monto mayor a cero");
        }

    }

    //
    public void retiroDinero(double retirado) {

        if (retirado < 0) {
            System.out.print("Error, ingrese valores mayores a cero \n");
        } else if (saldoActual == 0 || (saldoActual - retirado) < 0) {
            System.out.print("Error, saldo insuficiente para realizar la transaccion \n");
            saldoActual = 0; //¿?

        } else {
            saldoActual -= retirado;
            System.out.println("Dinero retirado, saldo actual: $ " + saldoActual);
        }

    }

    //
    public void extraccionRapida() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese monto a retirar: $ ");
        double retirado = entrada.nextDouble();
        if (retirado < 0) {
            System.out.print("Error, ingrese valores mayores a cero \n");
        } else {
            if (retirado > 0.2 * saldoActual) {
                System.out.print("Error, no puede extraer mas del 20% de su saldo actual \n");
            } else {
                saldoActual -= retirado;
                System.out.println("Extraccion rapida completada, saldo actual: $ " + saldoActual);
            }
        }
    }

    //
    public void consultarSaldo() {

        System.out.println("Su saldo actual es de $ " + saldoActual);

    }

    //
    public void consultarDatos() {

        System.out.println("Datos de la cuenta:");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI de cliente: " + dniCliente);
        System.out.println("Saldo actual: $ " + saldoActual);
    }
}

/*5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
