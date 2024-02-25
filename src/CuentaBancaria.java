import java.util.Scanner;

public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldo;

    public CuentaBancaria() {

    }


    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el DNI del cliente: ");
        dniCliente = scanner.nextLong();

        System.out.print("Ingrese el saldo inicial: ");
        saldo = scanner.nextDouble();
    }


    public void ingresar(double ingreso) {
        saldo += ingreso;
    }


    public void retirar(double retiro) {
        if (retiro <= saldo) {
            saldo -= retiro;
        } else {
            saldo = 0;
            System.out.println("Saldo insuficiente. Se ha establecido el saldo a 0.");
        }
    }


    public void extraccionRapida() {
        double extraccion = saldo * 0.2;
        saldo -= extraccion;
    }


    public void consultarSaldo() {
        System.out.println("Saldo disponible: " + saldo);
    }


    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.crearCuenta();

        cuenta.ingresar(0);
        cuenta.consultarSaldo();

        cuenta.retirar(0);
        cuenta.consultarSaldo();

        cuenta.extraccionRapida();
        cuenta.consultarSaldo();

        cuenta.consultarDatos();
    }
}