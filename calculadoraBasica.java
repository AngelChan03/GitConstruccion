public class CalculadoraBasica {
    public void CalculadoraBasica(){

    }

    public void calcularSuma(){

    }

    public void calcularResta(){
        
    }

    public void calcularMultiplicacion(){

    }

    public void calcularDivision(){

    }
    
    public  double calcularPotencia(double base, int exponente) {
        double resultadoPotencia = 0;
        double nuevaBase = base;
        int nuevoExponente = exponente;

        if (nuevoExponente == 0) {
            // Cualquier número elevado a la potencia 0 es 1
            resultadoPotencia = 1.0;
            return resultadoPotencia; 
        } else if (nuevoExponente < 0) {
            // Manejo de exponentes negativos: calculamos la inversa de la base elevada al exponente positivo
            resultadoPotencia = 1.0 / (nuevaBase * calcularPotencia(nuevaBase, -nuevoExponente- 1));
            return  resultadoPotencia;
        } else {
            // Caso general: multiplicamos la base por sí misma (exponente - 1) veces
            resultadoPotencia = nuevaBase * calcularPotencia(nuevaBase, nuevoExponente - 1);
            return resultadoPotencia;
        }
    }

    public void calcularModulo(){

    }

}
