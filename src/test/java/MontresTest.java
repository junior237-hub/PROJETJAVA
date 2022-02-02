import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontresTest {

	@Test
	void Testclone(){
		Montre m = new Montre(12,12);
		Montre clone = m.clone();
		assertEquals(m,clone);
	}

    @Test
    void getHeures() {
    }

    @Test
    void getMin() {
    }

    @Test
    void heure() {
    }

    @Test
    void min() {
    }

    @Test
    void avance() {
    }
}