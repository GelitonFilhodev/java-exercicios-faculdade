package poo.fundamentos.pentagonoProva;

public class PiramideBasePentagono extends Pentagono{
    private double altura;
    private double apotema;

    public PiramideBasePentagono(double lado, double altura, double apotema) {
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
        return (super.perimetro() / 2) * this.apotema;
    }

    @Override
    public double area() {
        return super.area() + this.areaLateral();
    }

    public double volume(){
        return (1/3) * super.area() * altura;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado da Base:"+super.getLado());
        System.out.println("Apotema da Base:"+super.apotema());
        System.out.println("Altura:"+this.altura);
        System.out.println("Apotema:"+this.apotema);
        System.out.println("Perimetro da base:"+super.perimetro());
        System.out.println("Área da base: "+super.area());
        System.out.println("Área Lateral: "+this.areaLateral());
        System.out.println("Área: "+this.area());
        System.out.println("Volume: "+this.volume());
    }
}
