
package calculadorafigurageometrica;


public class Rectangulo extends FiguraGeometrica {

    int base,altura;
    
    int calcularArea() {
    return base*altura;    
    }

  
    int calcularPerimetro() {
        return (base*2)+(altura*2);
    }

    
    
}
