/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author erick
 */
public class AgregaMarcador {
     private String descripcion;
     private double longitud;
     private double latitud;


    public String getDescripcion() {
        return descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void agregaMarcador() {
        Marcador m = new Marcador();
        m.setDescripcion(descripcion);
        m.setLongitud(longitud);
        m.setLatitud(latitud);
        MarcadorDAO md = new MarcadorDAO();
        md.save(m);
    }
     
     
  
    
    
}
