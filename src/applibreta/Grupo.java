/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreta;

import javax.swing.JOptionPane;

/**
 * Crea grupos de contactos en la libreta. EJ:Familiares
 * @author Usuario
 */
public class Grupo {
     Contacto dueño = new Contacto();
    Contacto [] contactos = new Contacto[10];
    int libre=VerLibre();
    /** Añade contactos a la libreta*/
    public void añadir(){
        if(libre<0){
            JOptionPane.showMessageDialog(null,"No hay espacio en la libreta");
        } else{
            IntroducirDatos();
        }
    }
    /** Muestra espacios libres en la libreta */
        public int VerLibre(){
            for(int i=0;i<contactos.length;i++){
                if(contactos[i].getNombre().compareTo("")==1){
                    return i;
                }
            }
            return -1;
        }
        
    /** Datos basicos sobre el contacto que añadimos */
    public Contacto IntroducirDatos(){
     String nombre = JOptionPane.showInputDialog("Introduce el nombre:");
     String apellido = JOptionPane.showInputDialog("Introduce el apellido:");
     String telefono = JOptionPane.showInputDialog("Introduce el telefono:");
     String email = JOptionPane.showInputDialog("Introduce el email:");
     Contacto contacto = new Contacto();
        return contacto;
        
}   /** Recorre la longitud del array/grupo */
    public void Grupo(){
        for(int i=0;i<contactos.length;i++){
            contactos[i].setNombre("");
                
            }
        }
    /** Visualiza despues de recorrer los espacios ocupados */
    public void cualOcupado(){
        for(int i=0;i<contactos.length;i++){
        if(contactos[i]!=null){
             JOptionPane.showMessageDialog(null,"Contactos ocupados :"+contactos[i].toString());
    }
 
}
}
}

