/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frutaclick;

/**
 *
 * @author nipogi6
 */
public class CalculadoraDescuento {
    /*
     * Calcula el precio final aplicando un 10% de descuento si el importe supera los 100€.
     * @param importeTotal Importe original del pedido
     * @return Importe con descuento si corresponde
     */
    public double aplicarDescuento(double importeTotal) {
        if (importeTotal > 100) {
            return importeTotal * 0.9; // 10% de descuento
        } else {
            return importeTotal;
        }
    }
}
