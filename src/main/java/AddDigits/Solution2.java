package AddDigits;

public class Solution2 {

	public int addDigits(int num) {
		return num % 9 == 0 ?  num ==0 ? 0 : 9  : num % 9;
	}



	public static void main(String[] args) {
		Solution2 s =new Solution2();
		int c = s.addDigits(19);
		System.out.println(c);
	}
}
