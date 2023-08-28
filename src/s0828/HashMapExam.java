package s0828;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(20315,"엄재환");
		map.put(20316,"이승재");
		map.put(20318,"임필묵");
		map.put(20301,"김시겸");
		
	 System.out.println(map.toString());
	 System.out.println(map.size());
	 
	 System.out.println(map.get(20315));
	 map.put(20303,"척준경");
	 System.out.println(map.toString());
	 
	 
	for (String s : map.values()) {
		System.out.println(s);
	}	
	
	//값만 출력하기
	for (Integer a:map.keySet()) {
		System.out.println("학번:"+a);
		System.out.println("이름"+map.get(a));
		
	}
	map.remove(20315);
	map.clear();
	
	map.remove(map.toString());
	}
}
