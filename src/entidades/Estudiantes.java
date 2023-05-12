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
public class Estudiantes {
    
    private String nombre;
    private String dni;
    private String gradoestudiante;
    private String colegio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGradoestudiante() {
        return gradoestudiante;
    }

    public void setGradoestudiante(String gradoestudiante) {
        this.gradoestudiante = gradoestudiante;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String MostrarDatos(){
    
        return this.nombre+" DNI :  "+this.dni+" GRADO: "+
                this.gradoestudiante+" COL: "+
                this.colegio;
    
    }
    
    
    
    
}
