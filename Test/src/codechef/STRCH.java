package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class STRCH {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(br.readLine());

		while (test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			long total = 0;
			char[] ch = str[0].toCharArray();
			char c = str[1].charAt(0);
			int n = ch.length;
			int index = 0;

			
			for (int i = 0; i < ch.length; i++) {
				for (int j = i; j < ch.length; j++) {
					
					if (ch[j]==c) {
						//out.append("i "+i+", n "+n+",  n-i "+(n-i)+"\n");
						total+=n-j;
						break;
					}
				}
			}
			
			
			
			
			
			
			
			
//			for (int i = 0; i < n; i++) {
//				if (ch[i] == c) {
//					total += (i - index) * (i - index + 1) / 2;
//					//System.out.println(i+"---"+index+"----"+total);
//					index = i + 1;
//				}
//
//				if (i == n-1 && ch[i] != c) {
//					total += (n - index) * (n - index + 1) / 2;
//					//System.out.println(index+"----"+total);
//				}
//			}

			 //System.out.println("\n"+total);
//			total = n * (n + 1) / 2 - total;
			

			out.append(total + "\n");
		}

		out.flush();
	}

}
