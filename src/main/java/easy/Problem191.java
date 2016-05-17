package easy;

/**
 * 191. Number of 1 Bits
 * @author EasonLin
 *
 */
public class Problem191 {
//you need to treat n as an unsigned value
  public int hammingWeight(int n) {
      int count = 0;
      for(int i = 0; i < 32; i++ ) {
        count += (n&1);
        n = n >>> 1;
      }
      return count;
  }
}
