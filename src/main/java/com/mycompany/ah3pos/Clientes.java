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
public class Clientes{

    static LinkedList<Clientes> clientes=new LinkedList< > ();
    private int codigo;
    private String nombre;
     private int Nit;
    private String correo;
private String genero;

    public Clientes(int codigo, String nombre, int Nit, String correo, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Nit = Nit;
        this.correo = correo;
        this.genero = genero;
    }

    public static LinkedList<Clientes> getClientes() {
        return clientes;
    }

    public static void setClientes(LinkedList<Clientes> clientes) {
        Clientes.clientes = clientes;
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

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
