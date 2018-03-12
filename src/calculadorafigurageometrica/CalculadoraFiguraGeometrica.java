package calculadorafigurageometrica;

import java.util.Scanner;

public class CalculadoraFiguraGeometrica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la figura que deseas conocer");
        System.out.println("1.Rectangulo");
        System.out.println("2.Triangulo");
        System.out.println("3.Cuadrado");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                Rectangulo miRectangulo = new Rectangulo();
                System.out.println("Ingresa altura y base");
                miRectangulo.altura = sc.nextInt();
                miRectangulo.base = sc.nextInt();
                if (miRectangulo.altura == miRectangulo.base) {
                    System.out.println("Te funciona mejor calculadora de cuadrados");
                } else {
                    System.out.println(miRectangulo.calcularArea());
                    System.out.println(miRectangulo.calcularPerimetro());
                }
                break;
            case 2:
                Triangulo miTriangulo = new Triangulo();
                System.out.println("Ingresa altura y base");
                miTriangulo.altura = sc.nextInt();
                miTriangulo.base = sc.nextInt();
                System.out.println(miTriangulo.calcularArea());
                System.out.println(miTriangulo.calcularPerimetro());
                break;
            case 3:
                Cuadrado miCuadrado = new Cuadrado();
                System.out.println("Ingresa altura y base");
                miCuadrado.altura = sc.nextInt();
                miCuadrado.base = sc.nextInt();
                if (miCuadrado.altura == miCuadrado.base) {
                    System.out.println(miCuadrado.calcularArea());
                    System.out.println(miCuadrado.calcularPerimetro());
                } else {
                    System.out.println("Eso no es un cuadrado");
                }
                break;
        }

    }

}
