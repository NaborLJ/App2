/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreta;

/**
 * Clase usada para añadir/ver posiciones libres en la Libreta de contactos
 * @author Usuario
 */
public class Libreta {
       private String nombre, dni;/** Variable de nombre y dni de contacto */
    private int libre = cualLibre();
    Contacto[] arrayContactos = new Contacto[3];/** Array donde guardaremos los contactos que querramos añadir/ Especificando limite de array/usuarios */ 

    public Libreta() {
        nombre = dni = "";
    }

    public Libreta(String aux_nombre, String aux_dni) {
        this.nombre = aux_nombre;
        this.dni = aux_dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
     /** Metodo para añadir contactos a la libreta. Introduciendo nombre */
    public void engadir() {
        libre = cualLibre();
        if (libre > 0) {
            System.out.println("Introduzca nombre");
            arrayContactos[libre].setNombre(nombre);
        }
    }
    /** Visualiza las posiciones libres (contactos libres) en la libreta */
    public int cualLibre() {
        for (int libre = 0; libre < arrayContactos.length; libre++) {
            if (arrayContactos[libre].getNombre().equals("")) {
                System.out.println("Hay hueco");
                return libre;
            } else if (libre == arrayContactos.length) {
            }
        }
        return -1;
    }
}
