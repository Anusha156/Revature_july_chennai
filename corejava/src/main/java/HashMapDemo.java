import java.util.HashMap;
//import java.util.Hashtable;

public class HashMapDemo {

	public static void main(String[] args) {
		//Hashtable<String, String> a=new Hashtable<String, String>();
		HashMap<String, String> a=new HashMap<String, String>();
		a.put("dell", "7330");
		a.put("hp",null);
		
		System.out.println(a.get("dell"));
		

	}

}
