package mayLong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class REDONE {

	long[] arr = new long[1000001];

	REDONE() {
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i-1] + (i * (arr[i-1] + 1)) % 1000000007) % 1000000007;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		REDONE r = new REDONE();
		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {

			int N = Integer.parseInt(br.readLine());
			

			out.append(r.arr[N] + "\n");

		}
		out.flush();
	}

}
