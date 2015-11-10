import java.util.List;
import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String args[]){
		List<String> arrayList = new ArrayList<String>();

		boolean b = arrayList.isEmpty();//判断是否为空集；

		arrayList.add("a");//ArrayList的增添；
		arrayList.add("b");
		arrayList.add("c");

		System.out.println(arrayList);

		String j = arrayList.get(0);//ArrayList的提出；
		System.out.println(j);

		for(int i = 0 ; i < arrayList.size() ; i++){
			String s = arrayList.get(i);
			System.out.println(s);
		}

		arrayList.remove(1);//ArrayList的删除；

		arrayList.clear();//arrayList的清空；
		int n = arrayList.size();
		System.out.println("在clear后arrayList的大小--》" + n);
	}
}