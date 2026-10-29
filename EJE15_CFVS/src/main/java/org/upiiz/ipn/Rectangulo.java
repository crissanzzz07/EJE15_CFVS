package org.upiiz.ipn;

//Clase hija o sub clase
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        //Validacion: no se permiten valores menores o iguales a cero
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser mayor que cero");
        }
        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero");
        }
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Rectángulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }
}
