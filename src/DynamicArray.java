
public class DynamicArray {
	private int[] array;
	private int currSize;
	private int capacity;
	
	public DynamicArray() {
		array = new int[1];
		currSize = 0;
		capacity = 1;
	}
	
	public int size() {
		return currSize;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public boolean isEmpty() {
		boolean isEmpty = true;
		if (currSize != 0) {
			isEmpty = false;
		}
		
		return isEmpty;
	}
	
	public int at(int index) {
		for(int i = 0; i < array.length; i++) {
			if(i == index) {
				return index;
			}
		}
		
		return index;
	}
	
	public void push(int item) {
		if(currSize == capacity) {
			capacity++;
		}
		array[currSize] = item;
		currSize++;
	}
	
	public void insert(int index, int item) {
		
	}
	
	public void prepend(int item) {
		
	}
	
	public void pop() {
		if(currSize == 0) {
			System.out.println("Array is Empty");
		} else {
			array[currSize - 1] = Integer.MIN_VALUE;
			currSize --;
		}
	}
	
	public void print() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	

	public static void main(String[] args) {
		DynamicArray list = new DynamicArray();
		list.push(0);
		list.print();

	}

}
