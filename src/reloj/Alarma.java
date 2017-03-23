/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.time.LocalTime;

/**
 *
 * @author dfernandezrivas
 */
public class Alarma {

    int hora = 10;
    ActivarAlarma usuario = new ActivarAlarma();

    public void reloj() {
        LocalTime i = LocalTime.now();
        System.out.println(i);
        int horas = i.getHour();
        int minutos = i.getMinute();
        int segundos = i.getSecond();
        System.out.println(horas + ":" + minutos + ":" + segundos);
        for (int limhoras = 24; limhoras < horas; limhoras++) {
            if (horas == limhoras) {
                horas = 0;

            }
            for (int limminutos = 59; limminutos < minutos; limminutos++) {
                if (minutos == limminutos) {
                    minutos = 0;

                }
            }

            for (int limsegundos = 59; limsegundos < segundos; limsegundos++) {
                if (segundos == limsegundos) {

                    segundos = 0;

                }
            }

        }
        

        
    }

    //Aqui recivimos la hora y los minutos que eligió el usuario pasados a segundos
    //Los combertiríamos a horas y minutos y recivimos un int tiempo como una variable que es la hora en la que se en cuentra el usuario
    //que sería la hora en la que estaría situado 
    //Este metodo nos devolveria la hora a 
    public void MetodoActivacion() {
//En este metodo reciviríamos la hora de la activación y hariamos el metodo para que cuando llegase a esa hora 
//sonase la alarma,posteriormente lo instanciariamos en el main
        if (usuario.horaAlarma() > hora) {
//  System.out.println("La alarma suena"); Comprovaciones
        } else {
//        System.out.println("No es aun la hora"); Comprovaiones

        }

    }
}
