/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author bradl
 */
public class ProcAritmeticas {

    public static String comparacion(int num1, int num2) {

        if (num1 % num2 == 0) {
            return "Los numeros son multiplos";
        } else if (num2 % num1 == 0) {
            return "Los numeros son multiplos";
        } else {
            return "Los numeros no son multiplos";
        }

    }

    public static int suma(int num1, int num2, int num3, int num4, int num5) {
        int op = num1 + num2 - num3 * num4 / num5;
        return op;
    }

    public static int suma2(int num1, int num2, int num3, int num4, int num5) {
        int op = (num1 + num2) * num3 - (num4 / num5);
        return op;
    }

    public static double exponente(double x, double a) {

        return Math.pow(x, a);
    }
    
    public static double exponenteMult(double x, double y, double z){
        double result = (Math.pow(x, y))* (y/z);
        return result;
    }
}
