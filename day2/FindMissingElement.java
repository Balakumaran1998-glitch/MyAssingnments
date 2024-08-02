package Week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,4,3,2,8,6,7};
System.out.println("Missing Number:" + FindMissingElement(arr));
	}
public static int FindMissingElement(int[] arr) {
	Arrays.sort(arr);
	for (int i=0; i<arr.length-1; i++);{
		int i=0;
		if (arr[i]+ 1 != arr[i+1]) {
			return arr[i]+1;
		}
	}
	return arr[arr.length-1]+1;
}
}
