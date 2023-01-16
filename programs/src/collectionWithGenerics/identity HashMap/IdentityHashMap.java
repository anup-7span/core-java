import java.util.Map;

public class IdentityHashMap
{
	public static void main(String[] args) {
		

		Map<Integer,String>map=new java.util.IdentityHashMap<>();

		Integer id1=new Integer(10);
		Integer id2=new Integer(20);

		map.put(id1,"anup");
		map.put(id2,"keyur");
		System.out.println(map);

	}
}