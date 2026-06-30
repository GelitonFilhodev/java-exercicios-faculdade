package poo.fundamentos.hexagonoProva;

abstract public class Hexagono {
    private double lado;

    public Hexagono(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area(){
        return (6 * (Math.pow(this.lado,2) * Math.sqrt(3))/4);
    }

    public double perimetro(){
        return (6 * this.lado);
    }

    public void mostrarDados(){
        System.out.println("Lado: "+this.lado);
        System.out.println("Área: "+this.area());
        System.out.println("Perímetro: "+this.perimetro());
    }
}
