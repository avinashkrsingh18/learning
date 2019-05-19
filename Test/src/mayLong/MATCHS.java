package mayLong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class MATCHS {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			String[] str = br.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			int C = Integer.parseInt(str[1]);
			int[][] mat = new int[R][C];
			boolean bolR = false;
			boolean bolC = false;

			int val = 0;
			for (int i = 0; i < R; i++) {
				str = br.readLine().split(" ");
				for (int j = 0; j < C; j++) {

					mat[i][j] = Integer.parseInt(str[j]);

				}

			}

			for (int i = 0; i < R; i++) {

				for (int j = 0; j < C; j++) {

					val += Integer.parseInt(str[j]);
				}
				if (val < R) {
					bolR = false;
					break;
				}
				bolR = true;
			}

			val = 0;
			for (int i = 0; i < C; i++) {

				for (int j = 0; j < R; j++) {

					val += mat[j][i];
				}
				if (val < C) {
					bolC = false;
					break;
				}
				bolC = true;

			}

			if (bolR && bolC) {
				out.append("Stable\n");
			} else {
				out.append("Unstable\n");
			}
		}

		out.flush();
		br.close();
		out.close();

	}

}
