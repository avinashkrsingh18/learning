package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class AprilCookOff2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			long[] val = new long[N];

			for (int i = 0; i < str.length; i++) {
				val[i] = Integer.parseInt(str[i]);

			}
			long d = val[1] - val[0];
			long D = val[N - 1] - val[N - 2];

			long tn = val[0] + (N - 1) * d;

			long a = val[0];
			if (tn == val[N - 1]) {

			} else {
				d = D;
				a = val[N - 1] - (N - 1) * D;
			}

			for (int i = 0; i < val.length; i++) {
				out.append((a + i * d) + " ");
			}

			out.append("\n");

		}

		out.flush();
		br.close();
		out.close();

	}

}
