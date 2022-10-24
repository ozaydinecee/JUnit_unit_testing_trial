package unittestingcourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCourse {

	@Test
	void successfulDivision() {
		int validNumOne=6;
		int validNumTwo=2;
		int result= Course.division(validNumOne, validNumTwo);
		assertEquals(result,3);
	}
	
	@Test
	void successfulIsEmptyTest() {
		assertTrue(Course.isEmpty(null));
		assertTrue(Course.isEmpty(""));
		assertFalse(Course.isEmpty("Ece"));
		assertFalse(Course.isEmpty(" "));
	}
	
	@Test
	void arrayEqualsExample() {
		final int [] actualArray= {3,2,1};
		final int [] expectedArray= {3,2,1};
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	void arrayEqualsTwoExample() {
		final int [] actualArray= {3,2,1};
		final int [] expectedArray= {1,2,3};
		Arrays.sort(actualArray);
		
		assertArrayEquals(expectedArray, actualArray);
	}
	@ParameterizedTest
	@ValueSource(ints= {6,4,8,16})
	void isEvenReturnTrue(int number)
	{
		assertTrue(Course.isEven(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,3,5,7})
	void isOddReturnFalse(int number) {
		assertFalse(Course.isEven(number));
	}
	

}
