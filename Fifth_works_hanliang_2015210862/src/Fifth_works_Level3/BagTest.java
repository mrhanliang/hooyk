package Fifth_works_Level3;

public class BagTest {
	public static void main(String args[]){
		Bag bag = new Bag();

		bag.insert("Monday");
		bag.insert("Tuseday");
		bag.insert("Wednesday");

		System.out.println("������Ԫ��Ϊ��" + bag.toString());

		bag.remove("Tuseday");

		System.out.println("ɾ��Tuesday�󣬼�����Ԫ��Ϊ��" + bag.toString());
		System.out.println("����Monday�Ľ��Ϊ��" + bag.find("Monday"));
		System.out.println("�жϼ����Ƿ�Ϊ�յĽ��Ϊ��" + bag.isEmpty());
		bag.insert("Monday");
	}
}