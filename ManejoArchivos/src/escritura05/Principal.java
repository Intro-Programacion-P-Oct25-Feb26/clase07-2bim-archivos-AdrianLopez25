/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        for (int i = 1; i < 5; i++) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su tipo de vehiculo");
            String vehiculo = entrada.nextLine();
            System.out.println("Ingrese su placa");
            String placa = entrada.nextLine();

            cadenaFinal = String.format("%s %s %s\n",
                    nombre,
                    vehiculo,
                    placa);

           
            Operacion.agregarDatos(cadenaFinal, placa);

        }
    }
}
