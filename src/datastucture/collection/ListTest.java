package datastucture.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

/**
 * Collection List 활용 - LinkedList / ArrayList
 */
public class ListTest {
	@Test
	public void create(){
		// 고정크기
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		System.out.println(list1.getClass().getName() + list1 );
		
		// 고정크기
		Integer[] arr1 = {1,2,3};
		List<Integer> list2 = Arrays.asList(arr1);
		System.out.println(list2.getClass().getName() + list2 );
		
		int[] arr2 = {1,2,3};
//		List<Integer> list3 = Arrays.asList(arr2);
//		Type mismatch: cannot convert from List<int[]> to List<Integer>
		List<Integer> list3 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		System.out.println(list3.getClass().getName() + list3 );
		
		List<Integer> list4 = new LinkedList<Integer>(list1);
		System.out.println(list4.getClass().getName() + list4 );
	}
	
	
	@Test
	public void arrayToList() {
		int[] array = {1,5,2,4,6,8,9};

		List<int[]> list1 = Arrays.asList(array);
		System.out.println(list1);		// int[]의 주소값 [[I@28ac3dc3]
		
		List<Integer> list2 = Arrays.stream(array).boxed().collect(Collectors.toList());
		System.out.println(list2);
	}
	
	@Test
	public void listToArray() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer[] integerArr = list.toArray(new Integer[] {});
		for(int n : integerArr) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		int[] intArr = list.stream().mapToInt(i->i).toArray();
		for(int n : intArr) {
			System.out.print(n + " ");
		}
	}
	
	@Test
	public void sort() {
		Integer[] arr1 = new Integer[] {1, 2, 3, 4, 5};
		Arrays.sort(arr1, Comparator.reverseOrder());
	}
	
	@Test
	public void max() {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 2, 2, 2};
		Arrays.stream(arr).distinct().forEach(i->System.out.println(i));
		System.out.println(Arrays.stream(arr).max().getAsInt());
	}
	

	
}
