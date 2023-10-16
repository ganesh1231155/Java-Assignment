import java.util.*;
import java.util.Arrays;
public class Question16{

	public static void main(String sk[]){
		int[] arr={1,2,3,4,5,4,3,2,1,9};
		int index=0;
		System.out.print("Enter Key element to remove : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=n){
				arr[index++]=arr[i];
			}
		}
		System.out.print("Array after removing key element :"+Arrays.toString(Arrays.copyOf(arr,index)));
	}
}