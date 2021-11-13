
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Flavio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido \nIngrese su nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();
        boolean flag = false;
        int edad = 0;
        while(flag==false){
            try {
                System.out.println("Ingrese su edad");
                edad = scan.nextInt();
                flag = true;
            }
            catch(Exception e) {
                scan.nextLine();
                System.out.println("Error al ingresar la edad, recuerde que tiene que ser un numero.");
            }
        }
        scan.nextLine();
        System.out.println("Ingrese su hobbie");
        String hobbie = scan.nextLine();
        System.out.println("Ingrese el editor de codigo que usa");
        String ide = scan.nextLine();
        System.out.println("Ingrese el SO que usa");
        String so = scan.nextLine();
        System.out.println("Soy " + nombre + " " + apellido + ", tengo " + edad + ". Mi hobbie es " + hobbie + ", aparte uso el siguiente ide " + ide + " y el sistema operativo " + so);        
    }  
}
