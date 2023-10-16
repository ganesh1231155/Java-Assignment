import java.util.*;
public class Question17{

	public static void main(String sk[]){
		int[] arr1={1,2,12,4,5,11};
		int[] arr2={1,2,3,4,6,7,8,10,11};

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++)
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+", ");
				break;
			}
		}
	}
}