package poo.fundamentos.hexagonoProva;

import java.util.Scanner;

public class LerPiramideHexagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiramideHexagonal ph = new PiramideHexagonal(0, 0, 0);

        do {
            System.out.print("Informe o lado: ");
            ph.setLado(input.nextDouble());

            if (ph.getLado() != 0) {
                System.out.print("Informe o Altura: ");
                ph.setAltura(input.nextDouble());

                System.out.print("Informe o Apotema: ");
                ph.setApotema(input.nextDouble());

                ph.mostrarDados();
            }
        } while (ph.getLado() != 0);
        System.out.println("PROGRAMA FINALIZADO!!");
    }
}