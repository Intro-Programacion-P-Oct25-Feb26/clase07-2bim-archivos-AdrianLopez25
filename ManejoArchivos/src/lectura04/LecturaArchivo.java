/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class LecturaArchivo {
    public static void main (String[] args){
        double sumaTotal = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                if (linea_partes.size() >= 4) {
                    String valorString = linea_partes.get(3); 
                    double valorNumerico = Double.parseDouble(valorString);

                    sumaTotal = sumaTotal + valorNumerico;
                    contador = contador + 1;
                    
                    System.out.println("Valor leído: " + valorNumerico);
                }
            } 
            entrada.close();

            if (contador > 0) {
                double promedio = sumaTotal / contador;
                System.out.printf("Suma total:%.2f \nEl promedio es:%.2f ", 
                        sumaTotal, promedio);
            } else {
                System.out.println("No se encontraron datos para promediar.");
            }

        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } 
    }
}
    
        

        
