
package examenlab5p2_mariapadilla;

import java.util.Date;

public class Usuario {
     private String nombre;
    private String apellido,contra;
    private Date fecha;
    private String sexo;
    private String departamiento;
    private int identidad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contra, Date fecha, String sexo, String departamiento, int identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha = fecha;
        this.sexo = sexo;
        this.departamiento = departamiento;
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamiento() {
        return departamiento;
    }

    public void setDepartamiento(String departamiento) {
        this.departamiento = departamiento;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contra=" + contra + ", fecha=" + fecha + ", sexo=" + sexo + ", departamiento=" + departamiento + ", identidad=" + identidad + '}';
    }
    
    
}
