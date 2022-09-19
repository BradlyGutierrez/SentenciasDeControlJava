/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author bradl
 */
public class Arreglos1 {
    
    
    public static float calcularProm(String[] arreglo){
        int suma = 0; 
            for(int i = 0; i <= arreglo.length; i++ ){
                suma = suma + Integer.parseInt(arreglo[i]);
            }
        float prom = suma / arreglo.length;
        return prom;
            
        }
   
}
