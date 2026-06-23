package poo.fundamentos.quadrado;

import java.util.Scanner;

public class CuboTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cubo cubo = new Cubo();

        do {
            System.out.print("Informe o lado: ");
            cubo.setLado(input.nextFloat());

            if (cubo.getLado() != 0){
                cubo.mostrarDados();
                System.out.println("-----------------------");
            }
        }while (cubo.getLado() != 0);

        System.out.println("Programa Finalizado!!");
    }
}
