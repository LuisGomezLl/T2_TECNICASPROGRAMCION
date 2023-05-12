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
public class Turnos {
   
    
    private String turnoclase;
    private String cantidadalumnos;
    private String profesor;
    private String duracion;
    private String curso;
    private String temacurso;

    public String getTurnoclase() {
        return turnoclase;
    }

    public void setTurnoclase(String turnoclase) {
        this.turnoclase = turnoclase;
    }

    public String getCantidadalumnos() {
        return cantidadalumnos;
    }

    public void setCantidadalumnos(String cantidadalumnos) {
        this.cantidadalumnos = cantidadalumnos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTemacurso() {
        return temacurso;
    }

    public void setTemacurso(String temacurso) {
        this.temacurso = temacurso;
    }

    public String MostrarDatos(){
    
        return this.turnoclase+"  "+this.cantidadalumnos+"  "+this.profesor+
                "   "+this.duracion+"    "+
                this.curso+this.temacurso;
    }
    
    
    
}
