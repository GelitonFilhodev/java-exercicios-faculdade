package poo.fundamentos.pentagono;

import java.util.Scanner;

public class LerPiramidePentagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiramidePentagonal pp = new PiramidePentagonal(0,0,0);

        do {
            System.out.print("Informe o Lado: ");
            pp.setLado(input.nextDouble());

            if (pp.getLado() != 0){
                System.out.print("Informe o Altura: ");
                pp.setAltura(input.nextDouble());

                System.out.print("Informe o Apotema: ");
                pp.setApotema(input.nextDouble());

                pp.mostrarDados();
            }
        }while (pp.getLado() != 0);
        System.out.println("Programa Finalizado!!");
    }
}
