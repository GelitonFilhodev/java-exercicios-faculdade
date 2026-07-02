package poo.fundamentos.pentagonoProva;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrismaBasePentagono pbp = new PrismaBasePentagono(0,0);

        do {
            System.out.print("Informe o lado: ");
            pbp.setLado(input.nextDouble());

            if(pbp.getLado() != 0){
                System.out.print("Informe a altura: ");
                pbp.setAltura(input.nextDouble());

                pbp.mostrarDados();
            }
        }while (pbp.getLado() != 0);
        System.out.println("PROGRAMA FINALIZADO!!");
    }
}
