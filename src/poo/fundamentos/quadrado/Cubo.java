package poo.fundamentos.quadrado;

public class Cubo extends Quadrado{

    public Cubo(){
        super();
    }

    public Cubo(float lado){
        super(lado);
    }

    @Override
    public double area() {
        return 6 * super.area();
    }

    public double volume(){
        return super.area() * super.getLado();
    }

    @Override
    public void mostrarDados() {
        System.out.println("Lado: "+super.getLado());
        System.out.println("Área: "+this.area());
        System.out.println("Volume: "+this.volume());
    }
}
