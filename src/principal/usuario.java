/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ALUMNO - FIIS
 */
public class usuario {
    
    private String Nombre;
    private String apellidos;
    private int edad;
    private int dni;

    public usuario(String Nombre, String apellidos, int edad, int dni) {
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni=dni;
    }
    
}
