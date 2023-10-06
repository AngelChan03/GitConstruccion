public class Multiplicacion {
    private double numero1;
    private double numero2;

    Multiplicacion(){}
    
    public double calcularMultiplicacion(double numUno, double numDos){
        this.numero1 = numUno;
        this.numero2 = numDos;
        double resultado = 0;
        for(int i=0; i<numero2; i++){
            resultado += numero1;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Multiplicacion multiplicar = new Multiplicacion();
        double resultadoFinal = multiplicar.calcularMultiplicacion(15, 7);
        System.out.println(resultadoFinal);
    }
}
