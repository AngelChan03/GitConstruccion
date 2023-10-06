public class Suma {

    private double primerNumero;
    private double segundoNumero;

    public Suma(double primerNumero, double segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public double getprimerNumero() {
        return primerNumero;
    }

    public void setprimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getsegundoNumero() {
        return segundoNumero;
    }

    public void setsegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double realizarSuma() {
        return primerNumero + segundoNumero;
    }
}
