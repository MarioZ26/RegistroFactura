/*
 Nombre       Carnet
 Otto Ramirez 2000136
 Mario Zavala 2000123
 */
package uspg.edu.gt;

import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FacturaEncabezado FacEn = new FacturaEncabezado();

        int opcion;

        do {
            System.out.println("Bienvenido al registro de facturas");
            System.out.println("Seleccione la opcion que necesita");
            System.out.println("----------------------------------");
            System.out.println("1.Grabar datos");
            System.out.println("2.Mostrar datos");
            System.out.println("3.Salir");
            System.out.println("----------------------------------");
            System.out.print("--Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese los siguientes datos para registro");
                    System.out.println("------------------------------------");

                    FacEn.facturaE();

                    break;

                case 2:

                    FacEn.mostrarE();

                    break;

            }

        } while (opcion != 3);
        System.out.println("Gracias");
        System.out.println("Regrese pronto");

    }

}
