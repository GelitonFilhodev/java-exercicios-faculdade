package poo.fundamentos.pentagono;

public class PiramidePentagonal extends Pentagono{
    private double altura;
    private double apotema;

    public PiramidePentagonal(double lado, double altura, double apotema) {
        super(lado);
        this.altura = altura;
        this.apotema = apotema;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return this.apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double areaLateral(){
        return (5 * ((super.getLado() * this.apotema) /2));
    }

    public double areaTotal(){
        return (super.area() + this.areaLateral());
    }

    public double volume(){
        return ((super.area() * this.altura)/3);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado: "+super.getLado());
        System.out.println("Área: "+super.area());
        System.out.println("Altura: "+this.altura);
        System.out.println("Apotema: "+this.apotema);
        System.out.println("Area Lateral: "+this.areaLateral());
        System.out.println("Area Total: "+this.areaTotal());
        System.out.println("Volume: "+this.volume());
    }
}
