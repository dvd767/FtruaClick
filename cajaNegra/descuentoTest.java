/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.frutaclick.CalculadoraDescuento;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class descuentoTest {

       @Test
    public void testDescuentoAplicado() {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        double importeOriginal = 150.0;
        double esperado = 135.0; // 10% de descuento aplicado
        double resultado = calc.aplicarDescuento(importeOriginal);
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testSinDescuento() {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        double importeOriginal = 80.0;
        double esperado = 80.0; // No hay descuento
        double resultado = calc.aplicarDescuento(importeOriginal);
        assertEquals(esperado, resultado, 0.001);
    }
}

