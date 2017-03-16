/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author dfernandezrivas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Aqui instanciamos todas las clases y metodos que tenemos para comprovar si funcionan 
       //usariamos unos System.out.println yJOptionPanel`s posteriormente crearíamos el display
       ActivarAlarma usuario=new ActivarAlarma();
       Alarma maquina=new Alarma();
       maquina.MetodoActivacion();
       //usuario.horaAlarma();
       //En el metodo horaalarma se calcularía horasyminutos pero no me da tiempo y a esa variable horasyminutos 
       //le doy un valor para hacer la comprobación
       
    }
    
}
