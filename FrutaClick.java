/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frutaclick;

/**
 *
 * @author nipogi6
 */
public class FrutaClick {

    public static void main(String[] args) {
        CalculadoraDescuento cd = new CalculadoraDescuento();
        double resultado = cd.aplicarDescuento(150);
        System.out.println("Precio con descuento: " + resultado);
    }
}
