package poo.fundamentos.pentagonoProva;

public class PrismaBasePentagono extends Pentagono{
    private double altura;

    public PrismaBasePentagono(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double areaLateral(){
        return super.perimetro() * this.altura;
    }

    @Override
    public double area() {
        return 2 * super.area() + areaLateral();
    }

    public double volume(){
        return super.area() * this.altura;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado da Base:"+super.getLado());
        System.out.println("Apotema:"+super.apotema());
        System.out.println("Altura:"+this.altura);
        System.out.println("Perimetro:"+super.perimetro());
        System.out.println("Área da base: "+super.area());
        System.out.println("Área Lateral: "+this.areaLateral());
        System.out.println("Área: "+this.area());
        System.out.println("Volume: "+this.volume());

    }
}
