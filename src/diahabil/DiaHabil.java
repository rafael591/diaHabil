/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class DiaHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String diaSemana;
        
        System.out.println("Ingrese un día de la semana");
        diaSemana = entrada.nextLine();
        
        switch (diaSemana) {
            case "Lunes":
                System.out.println( diaSemana + " es un día habil");
                break;
            case "Martes":
                System.out.println( diaSemana + " es un día habil");
                break;
            case "Miercoles":
                System.out.println( diaSemana + " es un día habil");
                break;
            case "Jueves":
                System.out.println( diaSemana + " es un día habil");
                break;
            case "Viernes":
                System.out.println( diaSemana + " es un día habil");
                break;
            default:
                System.out.println( diaSemana + " no es un día habil");
        }
    }
    
}
