package poo.fundamentos.pentagono;

public class PrismaPentagonal extends Pentagono{
    private double altura;

    public PrismaPentagonal(double lado, double altura){
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaBase(){
        return 2 * super.area();
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double volume(){
        return super.area() * this.altura;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado: "+super.getLado());
        System.out.println("Área: "+super.area());
        System.out.println("Altura: "+this.altura);
        System.out.println("Area da Base: "+this.areaBase());
        System.out.println("Volume: "+this.volume());
    }
}
