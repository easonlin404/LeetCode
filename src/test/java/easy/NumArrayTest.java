package easy;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class NumArrayTest {

  @Test
  public void testsumRange1() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);
    assertThat(numArray.sumRange(0, 2), is(1));
  }
  
  @Test
  public void testsumRange2() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);
    assertThat(numArray.sumRange(2, 5), is(-1));
  }
  
  @Test
  public void testsumRange3() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);
    assertThat(numArray.sumRange(0, 5), is(-3));
  }

}
