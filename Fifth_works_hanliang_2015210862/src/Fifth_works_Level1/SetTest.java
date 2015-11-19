package Fifth_works_Level1;

import java.util.Set;

import java.util.HashSet;

import java.util.Iterator;

public class SetTest {
	public static void main(String args[]) {
		// HashSet<String> hashSet = new HashSet<String>();
		// Set<String> set = hashSet;
		// Iterator <-- Collection <-- Set <-- HashSet;
		// Iterator <-- Collection <-- List <-- ArrayList;
		// hasNext();next();

		Set<String> set = new HashSet<String>();

		boolean b = set.isEmpty();// 判断是否为空集；
		System.out.println(b);

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");// Set的添加；

		Iterator<String> it = set.iterator();// 迭代器的使用；

		while (it.hasNext()) {
			String m = it.next();
			System.out.println(m);
		}

		System.out.println(set);// 把Set提出来；

		int i = set.size();// 查看set的长度；
		System.out.println("在clear前set.size()的值为--》" + i);

		set.remove("a");// Set的移除；
		int n = set.size();
		System.out.println("在remove后set.size()的值为--》" + n);

		set.clear();// Set清空；
		int j = set.size();
		System.out.println("在clear后set.size()的值为--》" + j);
	}
}
