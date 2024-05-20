package kz.singularity.testing;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class NumberUtilTest {

//	@Test
//	@BeforeEach
//	public void testBeforeEachAnnotation() {
//		System.out.println("jusan singularity");
//	}
//
//	@Test
//	@AfterEach
//
//	public void testAfterEachAnnotation() {
//		System.out.println("Astana");
//	}
	@Test
	@Order(1)
//	@Disabled("test is disabled")
	void testFactorial() {
		NumberUtil numberUtil = new NumberUtil();
		int result = numberUtil.factorial(5);
		assertEquals(120, result);
	}

	@Order(2)
	@Test
	public void testException() {
		NumberUtil util = new NumberUtil();
		assertThrows(IllegalArgumentException.class,
				()-> {
			util.factorial(-25);
				});
	}
	@Test
	public void testError() {
		NumberUtil util = new NumberUtil();
		int result = util.factorial(3);
		assertEquals(6, result);
	}

}
