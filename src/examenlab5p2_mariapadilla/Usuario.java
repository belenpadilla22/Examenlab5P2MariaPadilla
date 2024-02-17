package examenlab5p2_mariapadilla;

import java.util.Date;
import java.util.Random;

public abstract class Usuario {

    private String nombre;
    private String apellido, contra;
    private Date fecha;
    private String sexo;
    private String departamento;
    protected String identidad;
    private String year;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contra, Date fecha, String sexo, String departamento, String identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha = fecha;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad();
        this.year = year;
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
        return departamento;
    }

    public void setDepartamiento(String departamiento) {
        this.departamento = departamiento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contra=" + contra + ", fecha=" + fecha + ", sexo=" + sexo + ", departamiento=" + departamento + ", identidad=" + identidad + '}';
    }

    public String identidad(){
    
    Random ran = new Random();

        if (this.departamento.equalsIgnoreCase("Franciso Morazan")) {
            int aleatorio = ran.nextInt(28);
            if (aleatorio > 1 && aleatorio < 28) {
                identidad = "01" + aleatorio + this.year + 47896;

                return identidad;
            }

        } else if (this.departamento.equalsIgnoreCase("cortes")) {
            int aleatorio = ran.nextInt(28);
            if (aleatorio > 1 && aleatorio < 12) {

                identidad = "02" + aleatorio + this.year + 45824;
                return identidad;
            }

        } else if (this.departamento.equalsIgnoreCase("Comayagua")) {
            int aleatorio = ran.nextInt(28);
            if (aleatorio > 1 && aleatorio < 21) {

                identidad = "03" + aleatorio + this.year + 47856;

                return identidad;

            }

        }
        // System.out.println(id);
        return identidad;
    
    
    }
       
    

}
