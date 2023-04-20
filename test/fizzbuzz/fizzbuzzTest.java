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
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1", fb.fizzBuzz(1));
	}

	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
	
	@Test
	void fizzbuzz_repond_fizz_pour_3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}
	
	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz", fb.fizzBuzz(5));
	}
}
