package td3;

/**
 * @author mpluchar
 *
 */
public class Tableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tab = {0, 1, 2, 3, 4, 5};
		displayTab(tab);
		
		//1.
		swap(tab, 0, 1);
		displayTab(tab);
		
		// 2. & 3.
		System.out.println(indexOfMin(tab, 1, 4));
		
		// 4.
		sort(tab);
		displayTab(tab);
		
		int[] tab2 = {5464, 41, -4, 2, 0, 487};
		sort(tab2);
		displayTab(tab2);
	}
	
	public static void displayTab(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int index1, int index2)
			throws IllegalArgumentException
	{
		if (index1 > array.length || index2 > array.length) {
			System.out.println("indexMin : " + index1 + " | indexMax" + index2);
			throw new IllegalArgumentException();
		}
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
	public static int indexOfMin(int[] array, int indexMin, int indexMax)
			throws IllegalArgumentException
	{
		if (indexMin > array.length || indexMax > array.length) {
			System.out.println("indexMin : " + indexMin + " | indexMax" + indexMax);
			throw new IllegalArgumentException();
		}
		int indexOfMin = -1;
		int min = Integer.MAX_VALUE;
		for (int i=indexMin; i<indexMax; i++) {
			if (min > array[i]) {
				min = array[i];
				indexOfMin = i;				
			}
		}
		return indexOfMin;
	}
	
	public static void sort(int[] array) {
		System.out.println("Sort");
		for (int i=0; i<array.length; i++) {
			int minIndex = indexOfMin(array, i, array.length);
			if(minIndex != i) {
				swap(array, i, minIndex);
			}
		}		
	}

}
