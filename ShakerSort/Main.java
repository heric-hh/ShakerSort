/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShakerSort;

import java.io.IOException;

/**
 *
 * @author hheri
 */
public class Main {
    public static void main(String[] args) throws IOException {
    ShakerSort obj = new ShakerSort();
    
    // Determinar la longitud del arreglo
    obj.setNumElementos();
    
    // Llenar el arreglo
    obj.setElementos();
    
    // Ordenar el arreglo
    obj.shakerSort();
    
    // Imprimir el arreglo
    obj.imprimeArray();
    
        
    }
}
