package que1;
import java.util.Scanner;
public class ArrayInsertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter length of an array");
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		//System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println("Enter the position where you want to insert");
		int pos=sc.nextInt();
		//System.out.println("Enter the element which you want to insert");
		int a=sc.nextInt();
		for(int i=n-1;i>=(pos-1);i--) {
		arr[i+1]=arr[i];
		}
		arr[pos-1]=a;
		System.out.println("Array after insertinon is");
		for(int i=0;i<=n;i++) {
			System.out.println(arr[i]);
		}
	}
}
