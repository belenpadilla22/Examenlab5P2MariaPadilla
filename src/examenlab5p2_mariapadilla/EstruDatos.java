/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_mariapadilla;

import java.util.Date;

/**
 *
 * @author belen
 */
public class EstruDatos {
    private String nombre,descripcion;
    private Date date;
    private int identidad;

    public EstruDatos() {
    }

    public EstruDatos(String nombre, String descripcion, Date date, int identidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.date = date;
        this.identidad = identidad;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "EstruDatos{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", date=" + date + ", identidad=" + identidad + '}';
    }
    
}
