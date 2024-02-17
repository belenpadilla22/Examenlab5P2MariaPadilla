/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_mariapadilla;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author belen
 */
public class Civiles extends Usuario {
     private ArrayList <Tramite> tramites =new ArrayList ();
     private String year;

    public Civiles() {
    }
    public Civiles (String nombre, String apellido, String contra, Date fecha, String sexo, String departamento, String identidad){
        super (nombre,apellido,contra,fecha,sexo,departamento, identidad );
    }
    

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    
}
