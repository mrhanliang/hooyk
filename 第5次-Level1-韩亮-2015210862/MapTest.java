import java.util.Map;
import java.util.HashMap;

public class MapTest
{
	public static void main(String args[]){

		Map<String,String> map = new HashMap<String,String>();

		boolean b1 = map.isEmpty();//�ж��Ƿ�Ϊ�ռ���
		System.out.println(b1);
		
		map.put("a","A");//�����ֵ�ԣ�
		map.put("b","B");
		map.put("c","C");
		map.put("d","D");
		map.put("e","E");

		System.out.println(map);//������еļ�ֵ�ԣ�

		int i = map.size();//�鿴map�ĳ��ȣ�
		System.out.println("��clearǰmap�Ĵ�С--��" + i);

		String j = map.get("a");//���a����Ӧ��ֵ��
		System.out.println(j);
		
		map.remove("b");//��ȥmap.put("b","B");

		map.clear();//map����գ�
		int n = map.size();
		System.out.println("��clear��map�Ĵ�С--��" + n);
	}
}