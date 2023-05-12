/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Asistencia {
      
    private String fecha;
    private String turnoclase;
    private String duracion;
    private String asistieron;
    private String faltaron;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTurnoclase() {
        return turnoclase;
    }

    public void setTurnoclase(String turnoclase) {
        this.turnoclase = turnoclase;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAsistieron() {
        return asistieron;
    }

    public void setAsistieron(String asistieron) {
        this.asistieron = asistieron;
    }

    public String getFaltaron() {
        return faltaron;
    }

    public void setFaltaron(String faltaron) {
        this.faltaron = faltaron;
    }
    
    
    public String MostrarDatos(){
    
        return this.fecha+"     "+this.turnoclase+"     "+this.duracion+"     "+
                this.asistieron+this.faltaron;
    }

    
    
    
    
    
    
}
