public class Potencia {
    private double numBase;
    private int numExponent;

    public Potencia(float numberBase, int numExponent) {
        this.numBase = numberBase;
        this.numExponent = numExponent;
    }

    public  double calcularPotencia(double base, int exponente) {
        double powerResult = 0;
        if (exponente == 0) {
            // Cualquier número elevado a la potencia 0 es 1
            powerResult = 1.0;
            return powerResult; 
        } else if (exponente < 0) {
            // Manejo de exponentes negativos: calculamos la inversa de la base elevada al exponente positivo
            powerResult = 1.0 / (base * calcularPotencia(base, -exponente - 1));
            return  powerResult;
        } else {
            // Caso general: multiplicamos la base por sí misma (exponente - 1) veces
            powerResult = base * calcularPotencia(base, exponente - 1);
            return powerResult;
        }
    }

    // Implementacion:
    // public static void main(String[] args) {
    //     Potencia potencia = new Potencia(2, 8);
    //     double potenciaOperacion = potencia.calcularPotencia(2, 8);
    //     System.out.println(potenciaOperacion);
    // }
}