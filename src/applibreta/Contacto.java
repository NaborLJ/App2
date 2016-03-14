/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreta;

/**
 * Getters/Setters de los datos básicos de Usuario y un método que los muestra como String
 * @author Usuario
 */
public class Contacto {
      private String nombre, apellidos, telefono, mail;
     public Contacto() {
        nombre=apellidos=telefono=mail="";
    }

    public Contacto(String aux_nombre, String aux_apellidos, String aux_telefono, String aux_mail) {
        this.nombre = aux_nombre;
        this.apellidos = aux_apellidos;
        this.telefono = aux_telefono;
        this.mail = aux_mail;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        String texto;
        return texto=("Contacto: \n" + "Nome: "+"\n"+ getNombre()+"\n"+ "Apelidos: " + getApellidos()+"\n"+"Telefono: " + getTelefono() +"\n"+"Email: " + getMail() +"\n"+'}');
    }
    
}

