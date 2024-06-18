package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		System.out.println(list.size());
		list.add(1);
		list.add("rohit");
		list.add("rohit");
		list.add("rohit");
		list.remove(0);
		System.out.println(list.toString());
		
		
		 int array[] = { 2, 5, 12, 6, -3, 8, 0, -7, -9, 4 };
		 for(int arr: array){
			 System.out.print(arr+",");
		 }
	}

}
