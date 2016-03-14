/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreta;

/**
 * Clase usada para recoger y enviar datos de sesión de Usuario
 * @author nlopezjimenez
 */
public class Usuario {
    String nombre;/** Nombre del usuario */
    String Pass;/** Contraseña de usuario */
    int id;/**Id/Nickname/identificador de usuario que utilizará a la hora del loggin */

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return Pass;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
