package mayLong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BINARY {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {

			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int Z = Integer.parseInt(str[1]);
			str = br.readLine().split(" ");
			int[] Arr = new int[N];
			for (int i = 0; i < str.length; i++) {
				Arr[i] = Integer.parseInt(str[i]);
			}
			
			

//			for (int j = 0; j < str.length - 1; j++) {
//
//				if (str[j].equals("1")) {
//
//					int i = j - Z;
//					if (i < 0) {
//						i = 0;
//						while (i <= j && str[i].equals("1")) {
//							i++;
//						}
//						str[i] = "1";
//						str[j] = "0";
//					} else if (i <= j ) {
//						while (i <= j && str[i].equals("1")) {
//							i++;
//						}
//						str[i] = "1";
//						str[j] = "0";
//					}
//				}
//			}

			for (String c : str) {
				out.append(c + " ");
			}
			out.append("\n");

		}
		out.flush();
	}

}
