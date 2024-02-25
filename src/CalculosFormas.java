
interface CalculosFormas {
    double PI = 3.14159265359;

    double calcularArea();

    double calcularPerimetro();
}

class Circulo implements CalculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}


class Rectangulo implements CalculosFormas {
    private double base;
    private double altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}