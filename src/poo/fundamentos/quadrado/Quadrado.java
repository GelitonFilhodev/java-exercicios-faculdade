package poo.fundamentos.quadrado;

abstract public class Quadrado {
    private float lado;

    public Quadrado(){
        this.lado = 0;
    }

    public Quadrado(float lado){
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(lado, 2);
    }

    public double perimetro(){
        return 4 * lado;
    }

    public void mostrarDados(){
        System.out.println("Lado: "+this.lado);
        System.out.println("Área: "+this.area());
        System.out.println("Perímetro: "+this.perimetro());
    }
}

