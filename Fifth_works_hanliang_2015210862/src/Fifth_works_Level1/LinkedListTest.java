package Fifth_works_Level1;

import java.util.List;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]){
		List<String> linkedlist = new LinkedList<String>();

		boolean b1 = linkedlist.isEmpty();//�ж��Ƿ�Ϊ�գ�
		System.out.println(b1);

		linkedlist.add("one");//linkedList�ļ��룻
		linkedlist.add("two");
		linkedlist.add("three");
		linkedlist.add("four");
		linkedlist.add("five");

		System.out.println(linkedlist);//������е�linkedList��

		String s1 = linkedlist.get(1);//����ض���һ��linkedList;
		System.out.println(s1);

		int i = linkedlist.size();//�鿴linkedList�Ĵ�С��
		System.out.println("��clearǰlinkedList�Ĵ�С--��" + i);

		linkedlist.remove(1);//linkedList���Ƴ���

		linkedlist.clear();//linkedList����գ�
		int j = linkedlist.size();
		System.out.println("��clear��linkedList�Ĵ�С--��" + j);
	}
}