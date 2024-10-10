package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoPorHora;

public class EmpleadoPorHoraTest {

    @Test
    public void testCalcularSalario() {
        EmpleadoPorHora empleado = new EmpleadoPorHora("Ana", "456", 40, 15);
        assertEquals(600, empleado.calcularSalario(), 0.01);
    }
}
