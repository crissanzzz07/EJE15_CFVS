package org.upiiz.ipn;

//Clase abstracta: define lo que TODAS las figuras deben saber hacer
public abstract class FiguraGeometrica {

    //Metodos abstractos (sin cuerpo): cada figura concreta debe implementarlos
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void mostrarInformacion();
}
