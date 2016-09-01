package HW20160901;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class LottoSet {

	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) set.add((int) (Math.random() * 45 + 1));
		Object[] its = set.toArray();
		Arrays.sort(its);
		System.out.println(Arrays.toString(its));
	}
	
}
