package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class AprilCookOff1 {

	static BigInteger gcd(BigInteger a, BigInteger b) {
		// Everything divides 0
		if (a.longValue() == 0 || b.longValue() == 0)
			return new BigInteger("0");

		// base case
		if (a.longValue() == b.longValue())
			return a;

		// a is greater
		if (a.longValue() > b.longValue())
			return gcd(a.subtract(b), b);

		return gcd(a, b.subtract(a));
	}

	static BigInteger lcm(BigInteger a, BigInteger b) {
		return (a.multiply(b)).divide(gcd(a, b));
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			String[] str = br.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			int C = Integer.parseInt(str[1]);
	
			for (int i = 0; i < R; i++) {
				str = br.readLine().split(" ");
				for (int j = 0; j < C; j++) {

					int val=Integer.parseInt(str[j]);
					
				}

			}

			
		}

		out.flush();
		br.close();
		out.close();

	}

}
