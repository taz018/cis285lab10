package lab10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
	SelectionSort sort = new SelectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		
	}
	public testSelectionSort() {
		
	}
	@Test
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr, Sortedarr));
		
	}
	@Test
	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -5;
		arr[1] = -2;
		arr[2] = -9;
		arr[3] = -1;
		arr[4] = -12;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = -12;
		Sortedarr[1] = -9;
		Sortedarr[2] = -5;
		Sortedarr[3] = -2;
		Sortedarr[4] = -1;
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr, Sortedarr));
		
	}
	@Test
	public void testMixed() {
		int[] arr = new int[5];
		arr[0] = -2;
		arr[1] = 11;
		arr[2] = -3;
		arr[3] = 2;
		arr[4] = -9;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -3;
		Sortedarr[2] = -2;
		Sortedarr[3] = 2;
		Sortedarr[4] = 11;
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr, Sortedarr));
		
		
	}
	@Test
	public void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = 4;
		arr[1] = -2;
		arr[2] = -3;
		arr[3] = -2;
		arr[4] = 4;
		
		int [] Sortedarr = new int[5];
		Sortedarr[0] = -3;
		Sortedarr[1] = -2;
		Sortedarr[2] = -2;
		Sortedarr[3] = 4;
		Sortedarr[4] = 4;
		sort.basicSelectionSort(arr);
		assert(Arrays.equals(arr, Sortedarr));
		
		
	}

}
