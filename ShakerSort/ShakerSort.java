package ShakerSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShakerSort {
    private int numElementos;
    private int[] arr;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    
    // Setear la longitud del arreglo
    
    public void setNumElementos() throws IOException {
        System.out.println("Ingresa la cantidad de elementos del array: ");
        numElementos = Integer.parseInt(bf.readLine());    
        this.arr = new int[numElementos];
    }
    
    // Llenar el arreglo
    
    public void setElementos() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ".- Teclea un numero: ");
            this.arr[i] = Integer.parseInt(bf.readLine());
            
        }
    }
    
    
    // Ordenar con ShakerSort
    
    public void shakerSort() {
        boolean intercambiado = true;
        int comienzo = 0;
        int end = arr.length;
        int temp;
        
        while (intercambiado == true) {
            
            // Setear intercambiado porque puede ser true de una iteracion anterior.
            
            // intercambio en false quiere decir que el arreglo no ha sufrido cambios, por lo tanto, está ordenado
            intercambiado = false;
            
            // Hacer el loop igual que en Bubble sort
            for (int i = comienzo; i < end - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    intercambiado = true;
                }
            }
            
            // Si nada se movió entonces el arreglo está ordenado
            if (intercambiado == false)
                break;
            
            // De otra manera, resetea el flag de intercambiado para que pueda ser usado en la siguiente etapa
            intercambiado = false;
            
            // end ahora debe quitarse un valor porque en el último index del array, ya está el elemento en su lugar correcto
            end = end - 1;
            
            // De derecha a izquierda, haciendo la misma comparacion que en el for anterior
            for (int i = end - 1; i >= comienzo; i--) {
                if( arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    intercambiado = true;
                }
            }
            
            // Incrementar el comienzo porque el primer indice ya tiene el elemento correcto
            comienzo = comienzo + 1;
        }
    }
    
    public void imprimeArray() {
        System.out.println("Arreglo Ordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println("");
    }
}
