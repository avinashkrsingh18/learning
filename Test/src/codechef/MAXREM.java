package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MAXREM {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		String[] str = br.readLine().split(" ");

		int[] arr = new int[str.length];
		
		

		for (int i = 0; i < str.length; i++) {

			arr[i] = Integer.parseInt(str[i]);

		}

		Arrays.sort(arr);
		int max2 = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] < arr[arr.length - 1]) {
				max2=arr[i];
				break;
			}
		}
		// System.out.println(Arrays.toString(arr));

		out.append(max2 + "\n");

		out.flush();
	}

}
