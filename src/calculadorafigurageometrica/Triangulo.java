/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafigurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Triangulo  extends FiguraGeometrica {
  int base,altura;
  
    @Override
    int calcularArea() {
      return (base*altura)/2;
    }

    @Override
    int calcularPerimetro() {
       return base*3;
    }
    
}
