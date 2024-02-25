import java.util.Scanner;

public class Operacion {
    private float numero1;
    private float numero2;


    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public Operacion() {

    }


    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }


    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = scanner.nextFloat();
    }


    public float sumar() {
        return this.numero1 + this.numero2;
    }


    public float restar() {
        return this.numero1 - this.numero2;
    }


    public float multiplicar() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }


    public float dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
    }
}