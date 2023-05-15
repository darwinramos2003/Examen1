/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Yaqui
 */
public class Examenprimerparcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salir = 1;
        while (salir == 1) {
            int opc = 0;
            System.out.println("1)Ejercicio de palabras");
            System.out.println("2)Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:{
                    EjercicioPalabra();
                break;
            }
                case 2:{
                    System.out.println("Saliendo del programa......");
                    salir++;
                }
           
            
        }
            
        }

    }

    public static void EjercicioPalabra() {
        String cadena = "";
        String cadena1 ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted escogio el ejercicio si las cadenas son iguales");
        System.out.println("Ingrese la primera palabra: ");
        String pal1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String pal2 = sc.nextLine();
        int cont=0;
          int cont1=0;
            for (int i = 0; i < pal1.length(); i++) {
                cadena+= pal1.charAt(i);
                cont++;
                    
                }
            for (int i = 0; i < pal2.length(); i++) {
            cadena1+=pal2.charAt(i);
            cont1++;
        }
            
        
        if (pal1.equalsIgnoreCase(pal2)) {
            for (int i = pal2.length() - 1; i >= 0; i--) {
                cadena += pal2.charAt(i);

            }
            System.out.println(pal1 + cadena);
        } else if(pal1==pal2){
            System.out.println(pal1+pal2);
        }else if (pal1 != pal2) {
            System.out.println(pal1 + pal2);
        }

    }

}//fin de la clase

