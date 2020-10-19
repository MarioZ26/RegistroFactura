/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marioz
 */
public class FacturaEncabezado {

    public static int contador = 0;

    List<String> nombre = new ArrayList();
    List<String> direccion = new ArrayList();

    List<Integer> fecha = new ArrayList();
    List<Integer> serie = new ArrayList();
    List<Integer> numero = new ArrayList();
    List<Integer> nit = new ArrayList();

    List<FacturaDetalle> facturaDetaL = new ArrayList();

    FacturaDetalle datosF = new FacturaDetalle();

    public void facturaE() {

        FacturaDetalle detalle = new FacturaDetalle();

        Scanner sc = new Scanner(System.in);

        char ingresar = 'n';

        do {

            System.out.print("Serie: ");
            serie.add(sc.nextInt());
            System.out.print("Numero de la factura: ");
            numero.add(sc.nextInt());
            System.out.print("Fecha: ");
            fecha.add(sc.nextInt());
            System.out.print("Nombre: ");
            nombre.add(sc.next());
            System.out.print("Direccion: ");
            direccion.add(sc.next());
            System.out.print("Ingresar Nit: ");
            nit.add(sc.nextInt());

            facturaDetaL.add(new FacturaDetalle());
            facturaDetaL.get(contador).facturaD();

           // detalle.facturaD();

            System.out.print("--Desea agregar más datos s/n: ");
            ingresar = sc.next().charAt(0);
            System.out.println("\n");

            contador++;
        } while (ingresar == 's');

    }

    public void mostrarE() {
        for (int i = 0; i < contador; i++) {

            System.out.println("Serie\t" + "NoFactu\t" + "\tFecha\t" + "Nombre\t" + "Direccion\t" + "Nit\t");
            System.out.println(serie.get(i) + "   \t" + numero.get(i) + "\t\t" + fecha.get(i) + "\t" + nombre.get(i)
                    + "\t" + direccion.get(i) + "\t\t" + nit.get(i));

            facturaDetaL.get(i).mostrarD();

            System.out.println("\n\n+++++++++++++++++++++++++++++\n\n");

        }

    }
}
