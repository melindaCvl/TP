package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() {
		int tabDepart[] = {2, 1, 10, 6};
		int tabAttendu[] = {10, 6, 2, 1};
		
		try {
			TriTableau.trier(tabDepart);
			assertArrayEquals(tabDepart, tabAttendu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testTriCroissant() {
		int tabDepart[] = {2, 1, 10, 6};
		int tabAttendu[] = {1, 2, 6, 10};
		
		TriTableau.triCroissant(tabDepart);
		assertArrayEquals(tabDepart, tabAttendu);
	}

	@Test
	void testTriDecroissant() {
		int tabDepart[] = {2, 1, 10, 6};
		int tabAttendu[] = {10, 6, 2, 1};
		
		TriTableau.triDecroissant(tabDepart);
		assertArrayEquals(tabDepart, tabAttendu);
	}

}
