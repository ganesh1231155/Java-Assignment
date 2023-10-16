import java.util.*;
import java.util.Arrays;
public class Question18{
	public static void main(String sk[]){
		int[] arr={1,2,3,4,5,4,3,2,1,9};
		int[] arr2=new int[arr.length];
		arr2=arr;
		System.out.println(Arrays.toString(arr2));
	}
}