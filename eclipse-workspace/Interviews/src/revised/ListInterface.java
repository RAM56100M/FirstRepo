package revised;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(null);
		System.out.println(list.lastIndexOf(7));
		System.out.println(list.indexOf(7));
		System.out.println(list.contains(5));
		System.out.println(list.contains(null));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

		

		
		
	}

}
