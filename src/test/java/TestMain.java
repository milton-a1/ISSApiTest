import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import vista.Main;

@DisplayName("Tests para la clase Main")
public class TestMain {

	private final Main main = new Main();
	
	@Test
    @DisplayName("Test de connecion a la Api")
	void testConeccionApi() {
		assertNotNull(main.coneccionApi());
	}
	
	@Test
    @DisplayName("Test del status de la connecion a la Api")
	void teststatusConeccion() {
		assertEquals("success", main.statusConeccion(main.coneccionApi()));
	}
	
	@Test
    @DisplayName("Test del ID de la connecion")
	void testidConeccion() {
		assertNotNull(main.idConeccion(main.coneccionApi()));
	}
	
	@Test
    @DisplayName("Test de la Latitud.")
	void testinfoLat() {
		assertNotNull(main.infoLat(main.coneccionApi()));
	}

	@Test
    @DisplayName("Test de la Longitud.")
	void testinfoLong() {
		assertNotNull(main.infoLong(main.coneccionApi()));
	}
	
	
	
}
