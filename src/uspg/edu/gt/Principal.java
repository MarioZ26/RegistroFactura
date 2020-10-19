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
        FacturaDetalle FacDe = new FacturaDetalle();
        
        
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

                   // datosPersona();

                    break;

                case 2:

                 //   Mostrar();

                    break;

                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Por favor ingrese un número valido");
                    System.out.println("----------------------------------------");
                    break;

            }

        } while (opcion != 3);
        System.out.println("Gracias");
        System.out.println("Regrese pronto");

    }

    /*
    public static void Mostrar() {

        System.out.println("--------------------------------");
        System.out.println("Datos de las facturas ingresadas");
        System.out.println("--------------------------------");

        for (FacturaEncabezado facturaEncabezado : datosFac) {
            System.out.println("Serie\t" + "NoFactu\t" + "Fecha\t" + "Nombre\t" + "Direccion\t" + "Nit\t");
            System.out.println(facturaEncabezado.getSerie() + "\t" + facturaEncabezado.getNumero() + "\t"
                    + facturaEncabezado.getFecha() + "\t" + facturaEncabezado.getNombre() + "\t"
                    + facturaEncabezado.getDireccion() + "\t" + facturaEncabezado.getNit());

            for (FacturaDetalle facturaDetalle : detalle) {
                System.out.println("Cantidad\t" + "Descripción\t" + "Valor\t" + "Total");
                System.out.println(facturaDetalle.getCantidad() + "\t" + "\t" + facturaDetalle.getDescripcion() + "\t"
                        + "\t" + facturaDetalle.getValor() + "\t" + facturaDetalle.getTotal());

            }

            System.out.println("----------------------------------------------------------");
        }

    }
*/
}
