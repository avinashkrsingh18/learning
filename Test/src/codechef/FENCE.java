package codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FENCE {

	private BufferedReader br;
	private BufferedWriter out;

	public static void main(String[] args) throws Exception {

		FENCE fence = new FENCE();

		fence.br = new BufferedReader(new InputStreamReader(System.in));
		fence.out = new BufferedWriter(new OutputStreamWriter(System.out));

		int test = Integer.parseInt(fence.br.readLine());

		while (test-- > 0) {
			String[] str = fence.br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int K = Integer.parseInt(str[2]);

			SortedMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
			Object[][] obj=new Object[N][M];
			Map<Integer, Integer> map1;
			
			
			int r = 0;
			int c = 0;

			for (int i = 0; i < K; i++) {
				str = fence.br.readLine().split(" ");
				r = Integer.parseInt(str[0]) - 1;
				c = Integer.parseInt(str[1]) - 1;

//				map1=Stream.of(new Object[][] {{r,c},}).
//						collect(Collectors.toMap(data -> (Integer)data[0],
//								data -> (Integer)data[1]));
				if (map.get(r) == null) {
					List<Integer> m = new ArrayList<Integer>();
					m.add(c);
					map.put(r, m);
				} else {

					List<Integer> l = map.get(r);
					l.add(c);
					Collections.sort(l);
					map.put(r, l);
				}

			}

			long total = 0;

			
			Set<Integer> s = map.keySet();
			Integer[] key = s.toArray(new Integer[] {});

			for (int i = 0; i < key.length; i++) {
				
//				Collections.sort(map.);
				//Integer[] v = map.get(key[i]).toArray(new Integer[] {});
				Iterator<Integer> v=map.get(key[i]).listIterator();
				System.out.println(i+"----------");
				while (v.hasNext()) {
					System.out.print(v.next()+", ");
					
				}
				System.out.println();

//				for (int j = 0; j < v.length; j++) {
//
//					total += 4;
//
//					if (j > 0 && v[j] - v[j - 1] == 1) {
//
//						total -= 2;
//					}
//
//					if (i > 0 && map.get(key[i - 1]).contains(v[j])) {
//						total -= 2;
//
//					}
//				}
			}

			fence.out.append(total + "\n");
		}

		fence.out.flush();

	}

}
