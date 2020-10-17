/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

        int serie;
        int numero;
        String fecha;
        String nombre;
        String direccion;
        int nit;
        char ingresar = 'n';
        int opcion = 0;

        do {
            System.out.println("Bienvenido al registro de facturas");
            System.out.println("Seleccione la opcion que necesita");
            System.out.println("----------------------------------");
            System.out.println("1.Grabar datos");
            System.out.println("2.Mostrar datos");
            System.out.println("----------------------------------");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese los datos del nuevo registro");
                    System.out.println("------------------------------------");
                    do {
                        System.out.println("Serie:");
                        serie = input.nextInt();
                        System.out.println("Numero de la factura:");
                        numero = input.nextInt();
                        System.out.println("Fecha:");
                        fecha = input.next();
                        System.out.println("Nombre:");
                        nombre = input.next();
                        System.out.println("Direccion:");
                        direccion=input.nextLine();
                        System.out.println("Ingresar Nit:");
                        nit = input.nextInt();

                        datosFac.add(new FacturaEncabezado(serie, numero, fecha, nombre, direccion, nit));

                        System.out.println("Desea agregar más datos si/no:");
                        ingresar = input.next().charAt(0);
                    } while (ingresar == 's');
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("Datos de las facturas ingresadas");
                    System.out.println("--------------------------------");
                    
                    
                    System.out.println("Serie\t"+"No factura\t"+"Fecha\t"+"Nombre\t"+"Direccion\t"+"Nit\t");
                    
                    for (FacturaEncabezado facturaEncabezado: datosFac) {
                        
                        System.out.println(facturaEncabezado.getSerie()+"\t"+facturaEncabezado.getNumero()+"\t"+facturaEncabezado.getFecha()+"\t"+facturaEncabezado.getNombre()+"\t"+facturaEncabezado.getDireccion()+
                                "\t"+facturaEncabezado.getNit());
                        break;
                        
                        
                    }

            }

        } while (opcion != 3);
        System.out.println("Gracias");
        System.out.println("Regrese pronto");

    }

}
