/*
Nombre       Carnet
Otto Ramirez 2000136
Mario Zavala 2000123
 */
package uspg.edu.gt;

/**
 *
 * @author Otto
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<FacturaEncabezado> datosFac = new ArrayList();
        List<FacturaDetalle> detalle = new ArrayList();

        int serie;
        int numero;
        String fecha;
        String nombre;
        String direccion;
        int nit;

        int cantidad;
        String descripcion;
        double valor;
        double total;

        char ingresar = 'n';
        int opcion = 0;
        char factura = 'n';

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
                    do {
                        System.out.print("Serie: ");
                        serie = input.nextInt();
                        System.out.print("Numero de la factura: ");
                        numero = input.nextInt();
                        System.out.print("Fecha: ");
                        fecha = input.next();
                        System.out.print("Nombre: ");
                        nombre = input.next();
                        System.out.print("Direccion: ");
                        direccion = input.next();
                        System.out.print("Ingresar Nit: ");
                        nit = input.nextInt();

                        datosFac.add(new FacturaEncabezado(serie, numero, fecha, nombre, direccion, nit));

                        do {
                            System.out.println("\t--*Cantidad de productos*--");
                            System.out.print("-");
                            cantidad = input.nextInt();

                            System.out.print("\t---Descripción--- ");
                             System.out.println("-");
                            descripcion = input.next();

                            System.out.print("\t---Valor del producto---");
                            System.out.print("Q");
                            valor = input.nextDouble();

                            total = cantidad * valor;

                            System.out.print("--Desea agregar más datos a la factura s/n: ");
                            factura = input.next().charAt(0);
                            System.out.println("\n");

                            detalle.add(new FacturaDetalle(cantidad, descripcion, valor, total));

                        } while (factura == 's');

                        System.out.print("--Desea agregar más datos s/n: ");
                        ingresar = input.next().charAt(0);
                        System.out.println("\n");

                    } while (ingresar == 's');

                    break;
                case 2:
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

        } while (opcion != 3);
        System.out.println("Gracias");
        System.out.println("Regrese pronto");

    }

}
