package codechef;

import java.util.function.*;

public class PredicateFucntionalInterface {

	public static void main(String[] args) {
		//

		String[] str = { "Nag", "chiranjeevi", "Sunny", "Mohan1" };
		Predicate<String> P = s -> s.length() > 5;
		for (String s : str) {

			if (P.test(s)) {
				System.out.println(s);
			}
		}

		

	}

}
