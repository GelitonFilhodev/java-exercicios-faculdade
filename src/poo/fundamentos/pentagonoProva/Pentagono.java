package poo.fundamentos.pentagonoProva;

public class Pentagono {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double apotema(){
        return (lado / 2) / Math.tan(Math.toRadians(180.0 / 5));
    }

    public double perimetro(){
        return 5 * lado;
    }

    public double area(){
        return ((this.perimetro() * this.apotema()));
    }

    public void mostrarDados(){
        System.out.println("Lado: "+this.lado);
        System.out.println("Apotema: "+this.apotema());
        System.out.println("Perimetro: "+this.perimetro());
        System.out.println("Área: "+this.area());
    }
}
