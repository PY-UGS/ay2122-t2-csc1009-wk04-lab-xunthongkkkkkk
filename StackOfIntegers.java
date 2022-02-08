
public class StackOfIntegers {
	
	private int[] elements;
	private int size;
	
	public StackOfIntegers() {
		this.elements = new int[16];
	}

	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}
	
	public boolean empty() {
		if(this.size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peek() {
		int topValue = this.elements[size - 1];
		return topValue;
	}
	
	public void push(int value) {
		if (this.size >= this.elements.length) {
			int[] temp = new int[this.elements.length * 2];
			this.elements = temp;
		}
		
		this.elements[size++] = value;
	}

	public int pop() {
		return this.elements[--size];
	}
	
	public int getSize() {
		return this.size;
	}
}
