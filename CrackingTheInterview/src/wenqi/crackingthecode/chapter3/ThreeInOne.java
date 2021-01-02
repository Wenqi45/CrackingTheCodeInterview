package wenqi.crackingthecode.chapter3;

/**
 * 
 * @author Wenqi.Wang
 * use a single array to implement three stacks
 */

public class ThreeInOne {
	
	private Integer[] intArray;
	private Integer top1, top2, top3;
	private Integer maxStackSize;
	
	public ThreeInOne(int maxStackSize) {
		this.maxStackSize = maxStackSize;
		intArray = new Integer[3*maxStackSize];
		top1 = null;
		top2 = null;
		top3 = null;
	}
	
	public void push(int stackNo, Integer item) {
		if (stackNo == 1) {
			if (top1 == maxStackSize - 1) throws new Exception();
			else if (top1 == null ) {intArray[0] = item; top1 = 0;}
			else {intArray[++top1] = item;}
		}
	}
	public Integer pop(int stackNo) {
		if (stackNo == 1) {
			if (top1 == 0) throws 
			else return intArray[--top];
		}
	}
	public boolean isEmpty(int stackNo) {
		if (stackNo == 1) 
			return (top1 == null);
	}
	public int size() {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
