
package com.mycompany.ah3pos;

import java.util.LinkedList;


public class Sucursales {
    
    

    static LinkedList<Sucursales> sucursales=new LinkedList< > ();
    private int codigo ;
    private String nombre;
        private String direccion;
    private   String correo;
        private  int telefono;

    public Sucursales(int codigo, String nombre, String direccion, String correo, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
        
        
        

    public static LinkedList<Sucursales> getSucursales() {
        return sucursales;
    }

    public static void setSucursales(LinkedList<Sucursales> sucursales) {
        Sucursales.sucursales = sucursales;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

 
}
