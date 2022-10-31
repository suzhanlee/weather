package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	void equalTest() {
	    //given
	    //when
		assertEquals(1,1);
	    //then
	}

	@Test
	void equalTest2() {
	    //given
		assertNull(null);
	    //when
	    //then
	}

	@Test
	void test3() {
	    //given
		assertTrue(1==1);
	    //when
	    //then
	}


}
