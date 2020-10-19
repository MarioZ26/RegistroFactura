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
public class FacturaDetalle {

    List<String> descripcion = new ArrayList();
    List<Integer> cantidad = new ArrayList();
    List<Integer> valor = new ArrayList();
    List<Integer> total = new ArrayList();
    int contador = 0;

    public void facturaD() {

        Scanner sc = new Scanner(System.in);
        char factura = 'n';

        do {
            System.out.println("\t--*Cantidad de productos*--");
            System.out.print("-");
            cantidad.add(sc.nextInt());

            System.out.println("\t---Descripción--- ");
            System.out.println("-");
            descripcion.add(sc.next());

            System.out.println("\t---Valor del producto---");
            System.out.print("Q");
            valor.add(sc.nextInt());

          //  total.add(cantidad * valor);
          //  total = cantidad * valor;
            System.out.print("--Desea agregar más datos a la factura s/n: ");
            factura = sc.next().charAt(0);
            System.out.println("\n");

            contador++;

        } while (factura == 's');

    }

    public void mostrarD() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Cantidad\t" + "Descripción\t" + "Valor\t" + "Total");
            System.out.println(i + 1);
            System.out.println(cantidad.get(i) + "\t" + descripcion.get(i) + "\t" + valor.get(i));
        }
    }

    public FacturaDetalle() {
    }

   

}
