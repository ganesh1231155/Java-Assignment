import java.util.*;

public class Question15{
	public static void main(String sk[]){
		int[] arr1={1,2,3,4,5,6,7,8,9};
		int[] arr2={1,2,3,4,5,6,7,8};

		if(arr1.length==arr2.length)
		{	
		for(int i=0;i<9;i++){
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Arrays Are not equal.");
				return;
			}
		}
		System.out.println("Arrays Are equal.");
		}
		else{
			System.out.println("Arrays Are not equal.");
		}
	}
}