/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura04;

import java.util.Formatter;

/**
 *
 * @author PERSONAL
 */
public class Operacion {
    public static void agregarDatos(String valor , String nombreArchivo) {
        String ruta = String.format ("data/%s.txt",nombreArchivo);
        try {
            Formatter salida = new Formatter(ruta);
            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } 
    
} 

