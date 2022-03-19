package algorithm.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
		for(int i = 0 ; i < 10; i++) {
			list.add(rand.nextInt(100));
		}
		
		quickSort(list);
		
		System.out.println(list);
	
	}
	
	private static List<Integer> quickSort(List<Integer> list) {
		if(list.size() <= 1) {
			return list;
		}
		
		Integer pivot = list.remove(0);
		
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for(Integer n : list) {
			if(n.compareTo(pivot) < 0) {
				left.add(n);
			} else {
				right.add(n);
			}
		};

		
		List<Integer> sortedList = new ArrayList<Integer>();
		sortedList.addAll(quickSort(left));
		sortedList.add(pivot);
		sortedList.addAll(quickSort(right));
		
		
		return sortedList;
		
	}
}
