package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Arrays 유틸 사용법 정리 
 * @param args
 */
public class ArraysTest {
	public static void main(String[] args) {
			
		strigArrayToList();
		intArrayToList();
	}
	
	private static void strigArrayToList() {
		String[] array = new String[3];
		array[0] = "test1";
		array[1] = "test2";
		array[2] = "test3";
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
		System.out.println(arrayList);		
	}
 	
	private static void intArrayToList() {
		int[] array = {1,5,2,4,6,8,9};

		List<int[]> list1 = Arrays.asList(array);
		System.out.println(list1);		// int[]의 주소값 
		
		List<Integer> list2 = Arrays.stream(array).boxed().collect(Collectors.toList());
		System.out.println(list2);
	}
	
	
}



