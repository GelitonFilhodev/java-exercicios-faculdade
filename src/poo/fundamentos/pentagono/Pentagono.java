package poo.fundamentos.pentagono;

public class Pentagono {
    private double lado;

    public Pentagono(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double area(){
        return (5 * Math.pow(this.lado,2) / (4 * Math.tan(36)));
    }

    public double perimetro(){
        return 5 * this.lado;
    }

    public void mostrarDados(){
        System.out.println("Lado: "+this.lado);
        System.out.println("Área: "+this.area());
        System.out.println("Área: "+this.perimetro());
    }
}
