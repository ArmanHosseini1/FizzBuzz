package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fizzbuzzTest {
	private fizzbuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new fizzbuzz();
	}

	@Test
	void repond1() {
		assertEquals("1", fb.fizzBuzz(1));
	}

	@Test
	void repond2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
}
