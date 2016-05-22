package easy;

/**
 * 342. Power of Four
 * 
 * @author EasonLin
 *
 */
public class Problem342 {
  public boolean isPowerOfFour(int num) {
    String binaryStr = Integer.toBinaryString(num);
    return binaryStr.matches("^1(00)*");
  }

  public static void main(String[] args) {
    System.out.println(new Problem342().isPowerOfFour(4 * 4 * 4 * 4));
  }
}
