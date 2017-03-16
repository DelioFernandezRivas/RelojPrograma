/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Locale;

/**
 *
 * @author dfernandezrivas
 */
public class Alarma {
    int hora=10;
    ActivarAlarma usuario=new ActivarAlarma(); 
    public int tiempo(int tiempo){
        usuario.horaAlarma();
        
    //Aqui recivimos la hora y los minutos que eligió el usuario pasados a segundos
    //Los combertiríamos a horas y minutos y recivimos un int tiempo como una variable que es la hora en la que se en cuentra el usuario
    //que sería la hora en la que estaría situado 
    //Este metodo nos devolveria la hora a 
    
    
    
    
    return hora;
    }
    
    
    
    public void MetodoActivacion(){
//En este metodo reciviríamos la hora de la activación y hariamos el metodo para que cuando llegase a esa hora 
//sonase la alarma,posteriormente lo instanciariamos en el main
if(usuario.horaAlarma()>hora){
//  System.out.println("La alarma suena"); Comprovaciones
    }
else{
//        System.out.println("No es aun la hora"); Comprovaiones
        
        
        }



}
}
