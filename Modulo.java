public class Modulo {
    private double dividendo;
    private double divisor;

    public Modulo(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public double calcModulo(){
        double residuo = dividendo % divisor;
        return residuo; 
    }

    public static void main(String[] args){
    Modulo nuevo = new Modulo(11,3);
    System.out.println(nuevo.calcModulo());
    }

}

 