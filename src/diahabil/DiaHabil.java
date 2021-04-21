/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class DiaHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner(System.in);
	        
	        String Dia_Semana;
	        
	        System.out.println("Deme un día de la semana");
	        Dia_Semana = entrada.nextLine();
	        
	        switch (Dia_Semana) {
	            case "Lunes":
	                System.out.println( Dia_Semana + " es un día habil");
	                break;
	            case "Martes":
	                System.out.println( Dia_Semana + " es un día habil");
	                break;
	            case "Miercoles":
	                System.out.println( Dia_Semana + " es un día habil");
	                break;
	            case "Jueves":
	                System.out.println( Dia_Semana + " es un día habil");
	                break;
	            case "Viernes":
	                System.out.println( Dia_Semana + " es un día habil");
	                break;
	            default:
	                System.out.println( Dia_Semana + " no es un día habil");
                }
    }
    
}
