/*
 * Andrew Koroluk
 */

import java.util.ArrayList;

public class euler44 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int n=1; n<=2400; n++)
			a.add( n*(3*n-1)/2 );
		
		for(int j=0; j<2400; j++) {
			for(int k=0; k<2400; k++) {
				if(j==k) continue;
				if(!a.contains( a.get(j)+a.get(k) )) continue;
				int stuff = a.get(j)-a.get(k);
				if(!a.contains( stuff )) continue;
				System.out.println(stuff);
				break;
			}
		}
	}
}
/*
Pentagonal numbers are generated by the formula, P_n=n(3n-1)/2. The first ten pentagonal numbers are:

1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...

It can be seen that P_4 + P_7 = 22 + 70 = 92 = P_8. However, their difference, 70  22 = 48, is not pentagonal.

Find the pair of pentagonal numbers, P_j and P_k, for which their sum and difference is pentagonal and D = |P_k - P_j| is minimised; what is the value of D?
*/