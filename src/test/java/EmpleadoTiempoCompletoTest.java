
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

public class EmpleadoTiempoCompletoTest {

    @Test
    public void testCalcularSalario() {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Juan", "123", 3000);
        assertEquals(3000, empleado.calcularSalario(), 0.01);
    }
}