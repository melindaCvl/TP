package monPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	private FIFO fifo = new FIFO();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		fifo = new FIFO();
		fifo.add(3);
		
		int nombreActuel = fifo.first();
		assertEquals(3, nombreActuel);
	}

	@Test
	void testFirst() {
		fifo = new FIFO();
		
		fifo.add(1);
		fifo.add(2);
		fifo.add(3);
		int actual = fifo.first();
		assertEquals(1, actual);

	}
	
	@Test
	void testFirst2() {
		fifo = new FIFO();
		
		assertThrows(NoSuchElementException.class, () -> {fifo.first();},"");		

	}
	
	@Test
	void testIsEmpty() {
		fifo = new FIFO();
		assertEquals(fifo.isEmpty(), true);
	}

	@Test
	void testRemoveFirst() {
		fifo = new FIFO();
		fifo.add(2);
		fifo.add(3);
		
		fifo.removeFirst();
		
		int premierNb = fifo.first();
		assertEquals(3, premierNb);
	}

	@Test
	void testSize() {
		fifo = new FIFO();
		fifo.add(2);
		fifo.add(3);
		
		int actuel = fifo.size();

		assertEquals(2, actuel);
	}
	
}
