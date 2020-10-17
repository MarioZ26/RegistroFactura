/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

/**
 *
 * @author marioz
 */
public class FacturaEncabezado {

    int serie;
    int numero;
    String fecha;
    String nombre;
    String direccion;
    int nit;

    public FacturaEncabezado(int serie, int numero, String fecha, String nombre, String direccion, int nit) {
        this.serie = serie;
        this.numero = numero;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}

