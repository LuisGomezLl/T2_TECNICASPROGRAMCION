/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorturnos;

import entidades.Asistencia;
import entidades.Estudiantes;
import entidades.Turnos;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameSalaPrincipal;

/**
 *
 * @author USER
 */
public class OrganizadorTurnos {

    
    public static List<Estudiantes> listaestu;
    public static List<Turnos> listaturnos;
    public static List<Asistencia> listaasistencia;
    
    
    public static void main(String[] args) {
       
        listaestu=new ArrayList<>();
        listaturnos=new ArrayList<>();
        listaasistencia=new ArrayList<>();
        
        JFrameSalaPrincipal principal=new JFrameSalaPrincipal();
        principal.setLocationRelativeTo(null); //Para centrar en la ventana 
        principal.setVisible(true);
        
        
        
        
        
        
        
    }
    
}
