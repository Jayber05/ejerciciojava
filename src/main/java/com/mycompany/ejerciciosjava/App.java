/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class App {

    public static void main(String[] args) {
        
         /*La Registraduría Nacional del Estado Civil desea que le construya un programa que
permita solicitar el año de nacimiento de cada persona y determine si esta persona es
apta para votar o no. Sugerencia: Cuando ya no desee ingresar más datos se debe digitar
un valor centinela (buscar un valor apropiado.
*/
         int año= 2024, edad, añonac,a=0;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Buen dia, bienvenido a la pagina de la Registraduria Nacional del Estado Civil");
        System.out.println("");
        System.out.println("ingrese año de nacimiento");
        añonac= entrada.nextInt();
        edad=año-añonac;
        if (edad>=18){
            System.out.println("es apto para votar");
        }else{
            System.out.println("no cumple la mayoria de edad para ejercer el voto");
        }
        do{
        System.out.println("desea ingresar un nuevo año de nacimiento?\n1:si\n2:no");
        a=entrada.nextInt();
        if (a==1){
             System.out.println("ingrese año de nacimiento");
        añonac= entrada.nextInt();
        edad=año-añonac;
        if (edad>=18){
            System.out.println("es apto para votar");
        }else{
            System.out.println("no cumple la mayoria de edad para ejercer el voto");
        }
        }else{
            if (a==2){
            System.out.println("sus datos han sido registrados existosamente");
            }
        }
        }while(a==1);
    }
}
