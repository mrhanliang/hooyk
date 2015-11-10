import java.util.Map;
import java.util.HashMap;

public class MapTest
{
	public static void main(String args[]){

		Map<String,String> map = new HashMap<String,String>();

		boolean b1 = map.isEmpty();//判断是否为空集；
		System.out.println(b1);
		
		map.put("a","A");//放入键值对；
		map.put("b","B");
		map.put("c","C");
		map.put("d","D");
		map.put("e","E");

		System.out.println(map);//提出所有的键值对；

		int i = map.size();//查看map的长度；
		System.out.println("在clear前map的大小--》" + i);

		String j = map.get("a");//提出a键对应的值；
		System.out.println(j);
		
		map.remove("b");//除去map.put("b","B");

		map.clear();//map的清空；
		int n = map.size();
		System.out.println("在clear后map的大小--》" + n);
	}
}