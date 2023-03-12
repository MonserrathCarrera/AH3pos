/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ah3pos;

import java.util.LinkedList;


/**
 *
 * @author monse
 */
public class Productos {

    static LinkedList<Productos> producto=new LinkedList< > ();
    private int codigo;
    private String nombre;
       private String descripcion;
    private int cantidad;
      private int precio;

    public Productos(int codigo, String nombre, String descripcion, int cantidad, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public static LinkedList<Productos> getProducto() {
        return producto;
    }

    public static void setProducto(LinkedList<Productos> producto) {
        Productos.producto = producto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   

}