/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura05;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author PERSONAL
 */
public class Estadistica {
    public static double promedioEmpleados() {

        double suma = 0; // Variable para acumular el total de empleados
        int contador = 0; // Variable para contar las varaibles validas de sucursales

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));
            // Intenta abrir el archivo de texto en la ruta dada.

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine(); //Lee la línea completa y se 
                                                   //guarda en 'linea'.

                try {
                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    // Divide la línea en partes cada vez que encuentra el 
                    //carácter '|'.
                    // Se usa "\\" porque el pipe ya que es un carácter especial 
                    ArrayList<String> partes = new ArrayList<>(lista);
                    //Convierte esa lista fija en un ArrayList

                    int empleados = Integer.parseInt(partes.get(2));
                    //Escoge el dato de la posición 2 y lo convierte a entero

                    suma = suma + empleados;
                    contador = contador + 1;
                    //Acumula la cantidad de empleados y aumenta el contador de
                    //registros válidos.

                } catch (Exception e) {
                    continue;
                    //Si algo falla en una línea,se salta esa línea y sigue.
                }
            }

        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
            //Si el archivo no existe, se captura aquí y le vota el mensaje de error.
            return 0; // Termina el codigo devolviendo a 0.
        }

        
        double promedio;
        promedio = suma / contador;

        promedio = Math.round(promedio); //Redondea el resultado a entero
        return promedio; // Devuelve el valor final del promedio ya redondeado.
    }
}