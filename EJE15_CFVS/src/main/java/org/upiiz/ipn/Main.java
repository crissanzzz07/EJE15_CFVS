package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.List;

//Repositorio: https://github.com/crissanzzz07/EJE15_CFVS
public class Main {
    public static void main(String[] args) {
        //Lista de tipo FiguraGeometrica: guarda cualquier figura (polimorfismo)
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Triangulo(3, 4, 5));

        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===");
        System.out.println();

        //Se llama desde la referencia de la clase base; cada figura responde a su manera
        for (FiguraGeometrica figura : figuras) {
            figura.mostrarInformacion();
            System.out.println();
        }
    }
}
