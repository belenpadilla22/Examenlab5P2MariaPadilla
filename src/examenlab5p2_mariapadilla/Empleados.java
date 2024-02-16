
package examenlab5p2_mariapadilla;

import java.util.Date;

/**
 *
 * @author belen
 */
public class Empleados extends Usuario {
    private String carrera;
    private String puesto;
    private String year;

    public Empleados() {
    }

    public Empleados(String carrera, String puesto, String year) {
        this.carrera = carrera;
        this.puesto = puesto;
        this.year = year;
    }

    public Empleados(String carrera, String puesto, String year, String nombre, String apellido, String contra, Date fecha, String sexo, String departamiento, int identidad) {
        super(nombre, apellido, contra, fecha, sexo, departamiento, identidad);
        this.carrera = carrera;
        this.puesto = puesto;
        this.year = year;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puesto=" + puesto + ", year=" + year + '}';
    }
    
    
    
    
}
