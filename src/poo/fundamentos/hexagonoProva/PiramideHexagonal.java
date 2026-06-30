package poo.fundamentos.hexagonoProva;

public class PiramideHexagonal extends Hexagono{
    private double altura;
    private double apotema;

    public PiramideHexagonal(double lado, double altura, double apotema){
        super(lado);
        this.altura = altura;
        this.apotema = apotema;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double areaLateral(){
        return (3 * super.getLado() * this.apotema);
    }

    @Override
    public double area() {
        return (super.area() + this.areaLateral());
    }

    public double volume(){
        return (super.area() * this.altura / 3);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado da Base: "+super.getLado());
        System.out.println("Área da Base: "+super.area());
        System.out.println("Perímetro da Base: "+super.perimetro());
        System.out.println("Altura: "+this.altura);
        System.out.println("Apotema: "+this.apotema);
        System.out.println("Área Lateral: "+this.areaLateral());
        System.out.println("Área: "+this.area());
        System.out.println("Volume: "+this.volume());
    }
}
