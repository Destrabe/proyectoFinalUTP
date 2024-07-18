/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Proyecto_Final;

/**
 *
 * @author Marco
 */
public class cCine {
     private String nombre;
    private int Asientos;
    private double precio;
    private Boolean Estado;
    private double IngresoTotal;
    
    public cCine (String nombre, int Asientos, double precio, Boolean Estado){
       this.nombre = nombre;
       this.Asientos = Asientos;
       this.precio = precio;
       this.Estado = Estado;
    }
    public void CalcularIngresoTotal(){
        this.IngresoTotal = this.Asientos * this.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    public double getIngresoTotal() {
        return IngresoTotal;
    }

    public void setIngresoTotal(double IngresoTotal) {
        this.IngresoTotal = IngresoTotal;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", Asientos=" + Asientos + ", precio=" + precio + ", Estado=" + Estado + ", IngresoTotal=" + IngresoTotal + '}';
    }

}
