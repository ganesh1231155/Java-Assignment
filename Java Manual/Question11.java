import java.util.*;
public class Question11{
	public static void main(String sk[]){
		int[] arr={23,45,14,6,3,7,2,74,12,90};
		minGap(arr);
	}
	static void minGap(int arr[]){
		for(int i=0;i<9;i++){
			System.out.println("Gap bitween "+arr[i+1]+" and "+arr[i]+" is : "+(arr[i+1]-arr[i]));
		}
	}
}