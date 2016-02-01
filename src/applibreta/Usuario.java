/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreta;

/**
 *
 * @author nlopezjimenez
 */
public class Usuario {
    String nombre;
    String Pass;
    int id;

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
