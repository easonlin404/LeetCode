package easy;

/**
 * @author EasonLin
 * 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.

    Example:
    Given s = "hello", return "olleh".
 *
 */
public class Problem344 {

  // 超過時間限制
  public String reverseString_old(String s) {
    if (s == null)
      return null;
    if (s.equals(""))
      return "";

    String reverse = "";
    char[] c = s.toCharArray();
    for (int index = c.length - 1; index >= 0; index--) {
      reverse += c[index];
    }
    return reverse;
  }

  /**
   * swap
   * 
   * @param s
   * @return
   */
  public String reverseString(String s) {
    if (s == null)
      return null;
    if (s.equals(""))
      return "";

    char[] c = s.toCharArray();

    int begin = 0, end = c.length - 1;
    while (begin <= end) {
      char t = c[begin];
      c[begin] = c[end];
      c[end] = t;
      
      begin++;
      end--;
    }
    return new String(c);
  }
  
  public String reverseString3(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
}
}
