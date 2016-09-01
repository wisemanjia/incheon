package HW20160901;

public class Ppumppai {
	static int ppumppai(int p1, int p2, String p3) {
		if (p3.equals("4") || p3.equals("/")) {
			return p1 / p2;
		} else if (p3.equals("1") || p3.equals("+")) {
			return p1 + p2;
		} else if (p3.equals("2") || p3.equals("-")) {
			return p1 - p2;
		} else if (p3.equals("3") || p3.equals("*")) {
			return p1 * p2;
		}

		return 0;
	}
}
