package AddDigits;

public class Solution1 {

	public int addDigits(int num) {
		int result = 0;
		do {
			int n = num%10;
			result+=n;
			num = num/10;
		} while ( num > 0 );

		if( result >9 )
			return addDigits(result);
		else
			return result;
	}

	public static void main(String[] args) {
		Solution1 s =new Solution1();
		int c = s.addDigits(19);
		System.out.println(c);
	}
}
