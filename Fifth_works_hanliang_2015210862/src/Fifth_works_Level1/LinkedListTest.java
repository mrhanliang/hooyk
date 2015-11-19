package Fifth_works_Level1;

import java.util.List;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]) {
		List<String> linkedlist = new LinkedList<String>();

		boolean b1 = linkedlist.isEmpty();// 判断是否为空
		System.out.println(b1);

		linkedlist.add("one");// linkedList的加入；
		linkedlist.add("two");
		linkedlist.add("three");
		linkedlist.add("four");
		linkedlist.add("five");

		System.out.println(linkedlist);// 提出所有的linkedList；

		String s1 = linkedlist.get(1);// 提出特定的一个linkedList;
		System.out.println(s1);

		int i = linkedlist.size();// 查看linkedList的大小；
		System.out.println("在clear前linkedList的大小--》" + i);

		linkedlist.remove(1);// linkedList的移除；

		linkedlist.clear();// linkedList的清空；
		int j = linkedlist.size();
		System.out.println("在clear后linkedList的大小--》" + j);
	}
}
