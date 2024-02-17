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
public class Tramite {
    private String nombre, descripcion;
    private Date date;
    private String id;

    public Tramite() {
    }

    public Tramite(String nombre, String descripcion, Date date, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.date = date;
        this.id = id;
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

    public String getI() {
        return id;
    }

    public void setI(String i) {
        this.id = i;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", date=" + date + ", i=" + id + '}';
    }

  

  
    
    
}
