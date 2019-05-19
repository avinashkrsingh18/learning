package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class SUBREM {

	BufferedReader br;
	BufferedWriter out;
	int[] A;
	int N;
	int X;
	ArrayList<Integer>[] node;
	int[] DP;

	void DFS(int v, boolean[] visited) {

		visited[v] = true;

		Iterator<Integer> itr = node[v].listIterator();
		while (itr.hasNext()) {

			int e = itr.next();

			if (!visited[e]) {

				DFS(e,visited);
				
				DP[e]=A[e];
			}
		}
		
		
	}

	public static void main(String[] arg) throws Exception {

		SUBREM obj = new SUBREM();

		obj.br = new BufferedReader(new InputStreamReader(System.in));
		obj.out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(obj.br.readLine());

		while (test-- > 0) {

			String[] str = obj.br.readLine().split(" ");
			obj.N = Integer.parseInt(str[0]);
			obj.X = Integer.parseInt(str[1]);
			obj.A = new int[obj.N + 1];
			obj.DP=new int[obj.N + 1];

			str = obj.br.readLine().split(" ");
			obj.node = new ArrayList[obj.N + 1];

			for (int j = 1; j <= obj.N; j++) {
				obj.A[j] = Integer.parseInt(str[j - 1]);
				obj.node[j] = new ArrayList<Integer>();
			}

			for (int i = 1; i < obj.N; i++) {
				str = obj.br.readLine().split(" ");
				int r = Integer.parseInt(str[0]);
				int c = Integer.parseInt(str[1]);

				obj.node[r].add(c);
				obj.node[c].add(r);
			}

			for (int i = 1; i < obj.node.length; i++) {

				System.out.print(i + " - ");
				for (int j = 0; j < obj.node[i].size(); j++) {
					System.out.print(obj.node[i].get(j) + ", ");
				}
				System.out.println();
			}

		}
		obj.out.flush();

	}
}
