package Fifth_works_Level3;

public class BagTest {
	public static void main(String args[]) {
		Bag bag = new Bag();

		bag.insert("Monday");
		bag.insert("Tuseday");
		bag.insert("Wednesday");

		System.out.println("集合中元素为：" + bag.toString());

		bag.remove("Tuseday");

		System.out.println("删除Tuesday后，集合中元素为：" + bag.toString());
		System.out.println("查找Monday的结果为：" + bag.find("Monday"));
		System.out.println("判断集合是否为空的结果为：" + bag.isEmpty());
		bag.insert("Monday");
	}
}
