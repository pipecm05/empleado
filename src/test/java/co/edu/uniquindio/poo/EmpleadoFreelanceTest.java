package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;

public class EmpleadoFreelanceTest {

    @Test
    public void testCalcularSalario() {
        EmpleadoFreelance empleado = new EmpleadoFreelance("Carlos", "789", 5, 500);
        assertEquals(2500, empleado.calcularSalario(), 0.01);
    }
}