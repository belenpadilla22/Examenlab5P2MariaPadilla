/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_mariapadilla;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class Civiles extends Usuario {
     private ArrayList <Tramite> tramites =new ArrayList ();

    public Civiles() {
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }
    
}
