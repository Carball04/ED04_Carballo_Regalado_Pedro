package cuentas;

import java.util.Scanner;

public class Main {

    /**
     * Principio del programa.
     *
     * @param args Los argumentos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CCuenta cuenta1;
        double saldoActual;
        float cantidad; 

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        System.out.println("¿Que cantidad quieres mover?");
        cantidad = sc.nextFloat();
        
  
}
    /**
     * Realiza operaciones en una cuenta bancaria.
     *
     * @param cuenta1      La cuenta en la que se realizarán las operaciones.
     * @param saldoActual  El saldo actual de la cuenta.
     * @param cantidad     La cantidad a mover.
     */
    public static void operativa_cuenta(CCuenta cuenta1, double saldoActual, float cantidad) {
       
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

    }
}

