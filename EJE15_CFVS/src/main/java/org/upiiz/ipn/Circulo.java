package org.upiiz.ipn;

//Clase hija o sub clase
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public void setRadio(double radio) {
        //Validacion: no se permiten valores menores o iguales a cero
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Figura: Círculo");
        System.out.println("Radio: " + radio);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }
}
