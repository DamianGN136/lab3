import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testingReverse(){
    int[] input1  = {2,3,4,5,6,7,8,9,10};
    assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testingReverseInPlace(){
    int[] input1 = {2,3,4,5,6,7,8,9,10};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2}, input1);
  }
  
  @Test
  public void testing1Average(){
    double[] test1 = {4,3,0,1,2};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(test1),0);
  }

  @Test
  public void testingAverage(){
    double[] test1 = {2,2,2,1,1,2};
    assertEquals(1.8, ArrayExamples.averageWithoutLowest(test1),0);
  }


}
